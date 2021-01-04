package com.example.shoppingcalc.viewModel

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingcalc.R
import com.example.shoppingcalc.model.ProductModel
import kotlinx.android.synthetic.main.product_list_one_row.view.*
import org.w3c.dom.Text

class ProductListAdapter(var productList: LiveData<List<ProductModel>>, val productCallback: ICallbackProduct):
    RecyclerView.Adapter<ProductListAdapter.ProductHolder>() {

    inner class ProductHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.product_list_one_row, parent, false)

        return ProductHolder(view)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        var textViewName = holder.itemView.findViewById<TextView>(R.id.textViewName)
        var textViewQuantity = holder.itemView.findViewById<TextView>(R.id.textViewQuantity)
        var textViewPrice = holder.itemView.findViewById<TextView>(R.id.textViewPrice)

        textViewName.text = productList.value?.get(position)?.name.toString()
        textViewQuantity.text = productList.value?.get(position)?.quantity.toString()
        textViewPrice.text = productList.value?.get(position)?.price.toString()

        holder.itemView.deleteButton.setOnClickListener {
            productCallback.clickDeleteProduct(productList.value!![position])
        }

        holder.itemView.increaseButton.setOnClickListener {
            productCallback.clickIncreaseProduct(productList.value!![position])
        }

        holder.itemView.decreaseButton.setOnClickListener {
            productCallback.clickDecreaseProduct(productList.value!![position])
        }
    }

    override fun getItemCount(): Int {
        return productList.value?.size?:0
    }
}