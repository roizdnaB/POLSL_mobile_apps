package com.example.shoppingcalc.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product_table")
data class ProductModel (
    @PrimaryKey(autoGenerate = true)
    val idProduct: Int = 0,
    var name: String,
    var price: Float,
    var quantity: Int
)