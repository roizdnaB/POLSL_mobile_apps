package com.example.shoppingcalc.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u001b\u0010\u0013\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/shoppingcalc/model/ProductRepo;", "", "productDAO", "Lcom/example/shoppingcalc/model/ProductDAO;", "(Lcom/example/shoppingcalc/model/ProductDAO;)V", "getAllProducts", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/shoppingcalc/model/ProductModel;", "getGetAllProducts", "()Landroidx/lifecycle/LiveData;", "addProduct", "", "productModel", "(Lcom/example/shoppingcalc/model/ProductModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteProduct", "getProductById", "idProduct", "", "updateProduct", "app_debug"})
public final class ProductRepo {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.shoppingcalc.model.ProductModel>> getAllProducts = null;
    private final com.example.shoppingcalc.model.ProductDAO productDAO = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addProduct(@org.jetbrains.annotations.Nullable()
    com.example.shoppingcalc.model.ProductModel productModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.shoppingcalc.model.ProductModel>> getGetAllProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.shoppingcalc.model.ProductModel getProductById(int idProduct) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateProduct(@org.jetbrains.annotations.Nullable()
    com.example.shoppingcalc.model.ProductModel productModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteProduct(@org.jetbrains.annotations.Nullable()
    com.example.shoppingcalc.model.ProductModel productModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public ProductRepo(@org.jetbrains.annotations.NotNull()
    com.example.shoppingcalc.model.ProductDAO productDAO) {
        super();
    }
}