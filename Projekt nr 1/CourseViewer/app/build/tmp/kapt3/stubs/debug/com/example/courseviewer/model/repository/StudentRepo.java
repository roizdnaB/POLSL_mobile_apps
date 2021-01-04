package com.example.courseviewer.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u000e\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012J\u001b\u0010\u0013\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/courseviewer/model/repository/StudentRepo;", "", "studentDAO", "Lcom/example/courseviewer/model/dao/StudentDAO;", "(Lcom/example/courseviewer/model/dao/StudentDAO;)V", "getAllStudents", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/courseviewer/model/StudentModel;", "getGetAllStudents", "()Landroidx/lifecycle/LiveData;", "addStudent", "", "studentModel", "(Lcom/example/courseviewer/model/StudentModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStudent", "getStudentById", "idStudent", "", "updateStudent", "app_debug"})
public final class StudentRepo {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> getAllStudents = null;
    private final com.example.courseviewer.model.dao.StudentDAO studentDAO = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addStudent(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.StudentModel studentModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> getGetAllStudents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.courseviewer.model.StudentModel getStudentById(int idStudent) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateStudent(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.StudentModel studentModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteStudent(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.StudentModel studentModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public StudentRepo(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.dao.StudentDAO studentDAO) {
        super();
    }
}