package com.example.courseviewer.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019J\u0016\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019J\u001b\u0010\u001c\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\n\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/example/courseviewer/model/repository/GradeRepo;", "", "gradeDAO", "Lcom/example/courseviewer/model/dao/GradeDAO;", "(Lcom/example/courseviewer/model/dao/GradeDAO;)V", "getAllGrades", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/courseviewer/model/GradeModel;", "getGetAllGrades", "()Landroidx/lifecycle/LiveData;", "getListAllStudentGrades", "getGetListAllStudentGrades", "setGetListAllStudentGrades", "(Landroidx/lifecycle/LiveData;)V", "getListStudentGrades", "getGetListStudentGrades", "setGetListStudentGrades", "addGrade", "", "gradeModel", "(Lcom/example/courseviewer/model/GradeModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGrade", "getAllStudentGrades", "idStudent", "", "getStudentGrades", "idSubject", "updateGrade", "app_debug"})
public final class GradeRepo {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getAllGrades = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getListStudentGrades;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getListAllStudentGrades;
    private final com.example.courseviewer.model.dao.GradeDAO gradeDAO = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addGrade(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.GradeModel gradeModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getGetAllGrades() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getGetListStudentGrades() {
        return null;
    }
    
    public final void setGetListStudentGrades(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getGetListAllStudentGrades() {
        return null;
    }
    
    public final void setGetListAllStudentGrades(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object updateGrade(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.GradeModel gradeModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteGrade(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.GradeModel gradeModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void getStudentGrades(int idStudent, int idSubject) {
    }
    
    public final void getAllStudentGrades(int idStudent) {
    }
    
    public GradeRepo(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.dao.GradeDAO gradeDAO) {
        super();
    }
}