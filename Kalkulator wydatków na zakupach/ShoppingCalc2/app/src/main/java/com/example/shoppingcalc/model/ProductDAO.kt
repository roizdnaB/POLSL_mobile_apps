package com.example.shoppingcalc.model

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ProductDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createProduct(productModel: ProductModel)

    @Query("SELECT * FROM product_table")
    fun readAllProducts():LiveData<List<ProductModel>>

    @Query("SELECT * FROM product_table WHERE idProduct=:idProduct")
    fun readProductById(idProduct: Int): ProductModel

    @Update
    suspend fun updateProduct(productModel: ProductModel)

    @Delete
    suspend fun deleteProduct(productModel: ProductModel)
}