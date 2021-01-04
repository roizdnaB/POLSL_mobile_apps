package com.example.shoppingcalc.viewModel

import com.example.shoppingcalc.model.ProductModel

interface ICallbackProduct {

    fun clickDeleteProduct(productModel: ProductModel)
    fun clickIncreaseProduct(productModel: ProductModel)
    fun clickDecreaseProduct(productModel: ProductModel)
}