package com.example.courseviewer.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.courseviewer.model.dao.GradeDAO
import com.example.courseviewer.model.dao.StudentDAO
import com.example.courseviewer.model.dao.StudentSubjectDAO
import com.example.courseviewer.model.dao.SubjectDAO

//https://developer.android.com/training/data-storage/room
@Database(
    entities = [
        StudentModel::class,
        SubjectModel::class,
        GradeModel::class,
        StudentSubjectModel::class
    ],
    version = 1
)

//Database class
abstract class CourseViewerDatabase: RoomDatabase() {
    //Create the DAOs of database
    abstract fun studentDAO(): StudentDAO
    abstract fun subjectDAO(): SubjectDAO
    abstract fun gradeDAO(): GradeDAO
    abstract fun studentSubjectDAO(): StudentSubjectDAO

    //Get the instance of the created database
    companion object {
        @Volatile
        private var INSTANCE: CourseViewerDatabase? = null

        fun getDatabase(context: Context): CourseViewerDatabase {
            val tempInstance = INSTANCE

            if (tempInstance != null)
                return tempInstance
            else
                synchronized(this) {
                    val instance = Room.databaseBuilder(
                        context.applicationContext,
                        CourseViewerDatabase::class.java,
                        "CVDatabase"
                    ).fallbackToDestructiveMigration()
                        .allowMainThreadQueries().build() //dangerous but i give it a try
                    INSTANCE = instance

                    return instance
                }
        }
    }
}