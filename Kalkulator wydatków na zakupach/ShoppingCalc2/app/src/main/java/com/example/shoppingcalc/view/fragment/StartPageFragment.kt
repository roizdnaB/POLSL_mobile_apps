package com.example.shoppingcalc.view.fragment

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.shoppingcalc.R
import com.example.shoppingcalc.model.ProductModel
import com.example.shoppingcalc.viewModel.ProductVM
import kotlinx.android.synthetic.main.fragment_start_page.*
import kotlinx.android.synthetic.main.fragment_start_page.view.*

class StartPageFragment: Fragment() {
    private lateinit var viewModel: ProductVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_start_page, container, false)
        viewModel = ViewModelProvider(requireActivity()).get(ProductVM::class.java)


        viewModel.getAllProducts.observe(viewLifecycleOwner, Observer {
            view.sumCostLabel.text = calculateSum().toString() + " zł"
        })

        view.addProductButton.setOnClickListener { addProductToDatabase() }
        view.goToListButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_StartPageFragment_to_ViewProductsFragment) }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun addProductToDatabase() {
        if (dataValidation(nameField.text.toString(), quantityField.text.toString(), priceField.text.toString())) {
            val name = nameField.text.toString()
            val quantity = quantityField.text.toString().toInt()
            val price = priceField.text.toString().toFloat()

            val product = ProductModel(name = name, quantity = quantity, price = price)
            viewModel.addProduct(product)
            Toast.makeText(requireContext(), "Dodano do listy", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(requireContext(), "Błędne dane!", Toast.LENGTH_LONG).show()
    }

    private fun dataValidation(name: String, quantity: String, price: String): Boolean {
        if (TextUtils.isEmpty(name) || TextUtils.isEmpty(quantity.toString()) || TextUtils.isEmpty(price.toString()))
            return false
        return true
    }

    private fun calculateSum(): Float {
        val products = viewModel.getAllProducts.value
        var sum: Float = 0f

        products?.forEach { sum += (it.price * it.quantity) }

        return sum
    }
}