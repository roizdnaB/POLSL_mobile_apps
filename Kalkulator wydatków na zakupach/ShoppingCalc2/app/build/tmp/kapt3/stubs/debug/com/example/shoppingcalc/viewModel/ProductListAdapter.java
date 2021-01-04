package com.example.shoppingcalc.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB!\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/shoppingcalc/viewModel/ProductListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/shoppingcalc/viewModel/ProductListAdapter$ProductHolder;", "productList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/shoppingcalc/model/ProductModel;", "productCallback", "Lcom/example/shoppingcalc/viewModel/ICallbackProduct;", "(Landroidx/lifecycle/LiveData;Lcom/example/shoppingcalc/viewModel/ICallbackProduct;)V", "getProductCallback", "()Lcom/example/shoppingcalc/viewModel/ICallbackProduct;", "getProductList", "()Landroidx/lifecycle/LiveData;", "setProductList", "(Landroidx/lifecycle/LiveData;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductHolder", "app_debug"})
public final class ProductListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.shoppingcalc.viewModel.ProductListAdapter.ProductHolder> {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.shoppingcalc.model.ProductModel>> productList;
    @org.jetbrains.annotations.NotNull()
    private final com.example.shoppingcalc.viewModel.ICallbackProduct productCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.shoppingcalc.viewModel.ProductListAdapter.ProductHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.shoppingcalc.viewModel.ProductListAdapter.ProductHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.shoppingcalc.model.ProductModel>> getProductList() {
        return null;
    }
    
    public final void setProductList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.shoppingcalc.model.ProductModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.shoppingcalc.viewModel.ICallbackProduct getProductCallback() {
        return null;
    }
    
    public ProductListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.shoppingcalc.model.ProductModel>> productList, @org.jetbrains.annotations.NotNull()
    com.example.shoppingcalc.viewModel.ICallbackProduct productCallback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/shoppingcalc/viewModel/ProductListAdapter$ProductHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/shoppingcalc/viewModel/ProductListAdapter;Landroid/view/View;)V", "app_debug"})
    public final class ProductHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ProductHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}