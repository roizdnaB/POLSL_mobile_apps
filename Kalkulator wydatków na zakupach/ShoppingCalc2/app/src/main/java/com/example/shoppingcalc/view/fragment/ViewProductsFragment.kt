package com.example.shoppingcalc.view.fragment

import android.os.Bundle
import android.os.Debug
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingcalc.R
import com.example.shoppingcalc.model.ProductModel
import com.example.shoppingcalc.viewModel.ICallbackProduct
import com.example.shoppingcalc.viewModel.ProductListAdapter
import com.example.shoppingcalc.viewModel.ProductVM
import kotlinx.android.synthetic.main.fragment_view_products.*
import kotlinx.android.synthetic.main.product_list_one_row.view.*

class ViewProductsFragment: Fragment(), ICallbackProduct  {
    private lateinit var myAdapter: ProductListAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: ProductVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_view_products, container, false)
        myLayoutManager = LinearLayoutManager(context)
        viewModel = ViewModelProvider(requireActivity()).get(ProductVM::class.java)
        myAdapter = ProductListAdapter(viewModel.getAllProducts, this)

        viewModel.getAllProducts.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()
        })

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = recyclerViewProducts.apply {
            this.layoutManager = myLayoutManager
            this.adapter = myAdapter
        }
    }

    override fun clickDeleteProduct(productModel: ProductModel) {
        viewModel.currentProduct = productModel
        viewModel.deleteProduct()
    }

    override fun clickIncreaseProduct(productModel: ProductModel) {
        productModel.quantity++
        viewModel.currentProduct = productModel
        viewModel.updateProduct()
    }

    override fun clickDecreaseProduct(productModel: ProductModel) {
        productModel.quantity--
        viewModel.currentProduct = productModel
        if (viewModel.currentProduct?.quantity == 0)
            viewModel.deleteProduct()
        else {
            viewModel.updateProduct()
        }
    }
}