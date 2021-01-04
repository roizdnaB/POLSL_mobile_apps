package com.example.shoppingcalc.model;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\'J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/shoppingcalc/model/ProductDAO;", "", "createProduct", "", "productModel", "Lcom/example/shoppingcalc/model/ProductModel;", "(Lcom/example/shoppingcalc/model/ProductModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProduct", "readAllProducts", "Landroidx/lifecycle/LiveData;", "", "readProductById", "idProduct", "", "updateProduct", "app_debug"})
public abstract interface ProductDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object createProduct(@org.jetbrains.annotations.NotNull()
    com.example.shoppingcalc.model.ProductModel productModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM product_table")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.shoppingcalc.model.ProductModel>> readAllProducts();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM product_table WHERE idProduct=:idProduct")
    public abstract com.example.shoppingcalc.model.ProductModel readProductById(int idProduct);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateProduct(@org.jetbrains.annotations.NotNull()
    com.example.shoppingcalc.model.ProductModel productModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteProduct(@org.jetbrains.annotations.NotNull()
    com.example.shoppingcalc.model.ProductModel productModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}