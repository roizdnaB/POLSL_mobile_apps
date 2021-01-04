package com.example.shoppingcalc.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.shoppingcalc.model.ProductModel
import com.example.shoppingcalc.model.ProductRepo
import com.example.shoppingcalc.model.ShoppingCalcDatabase
import kotlinx.coroutines.launch

class ProductVM(application: Application): AndroidViewModel(application) {

    private val repo: ProductRepo = ProductRepo(
        ShoppingCalcDatabase.getDatabase(application).productDAO()
    )

    var currentProduct: ProductModel? = null

    fun addProduct(productModel: ProductModel) {
        viewModelScope.launch { repo.addProduct(productModel) }
    }

    val getAllProducts: LiveData<List<ProductModel>> = repo.getAllProducts

    fun getProductById(productId: Int) {
        viewModelScope.launch { repo.getProductById(productId) }
    }

    fun updateProduct() {
        viewModelScope.launch { repo.updateProduct(currentProduct) }
    }

    fun deleteProduct() {
        viewModelScope.launch { repo.deleteProduct(currentProduct) }
    }
}