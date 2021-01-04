package com.example.shoppingcalc.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        ProductModel::class
    ],
    version = 2
)

abstract class ShoppingCalcDatabase: RoomDatabase() {

    abstract fun productDAO(): ProductDAO

    companion object {
        @Volatile
        private var INSTANCE: ShoppingCalcDatabase? = null

        fun getDatabase(context: Context): ShoppingCalcDatabase {
            val tempInstance = INSTANCE

            if (tempInstance != null)
                return tempInstance
            else
                synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        ShoppingCalcDatabase::class.java,
                        "SCDatabase"
                    ).fallbackToDestructiveMigration().build()
                    INSTANCE = instance

                    return instance
                }
        }
    }
}