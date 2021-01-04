package com.example.shoppingcalc.model

import androidx.lifecycle.LiveData

class ProductRepo (
    private val productDAO: ProductDAO
) {
    suspend fun addProduct(productModel: ProductModel?) {
        if (productModel != null)
            productDAO.createProduct(productModel)
    }

    val getAllProducts: LiveData<List<ProductModel>> = productDAO.readAllProducts()

    fun getProductById(idProduct: Int): ProductModel {
        return productDAO.readProductById(idProduct)
    }

    suspend fun updateProduct(productModel: ProductModel?) {
        if (productModel != null)
            productDAO.updateProduct(productModel)
    }

    suspend fun deleteProduct(productModel: ProductModel?) {
        if (productModel != null)
            productDAO.deleteProduct(productModel)
    }
}