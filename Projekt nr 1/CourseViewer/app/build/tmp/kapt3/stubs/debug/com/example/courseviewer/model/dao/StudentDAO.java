package com.example.courseviewer.model.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\'J\u0019\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/courseviewer/model/dao/StudentDAO;", "", "createStudent", "", "studentModel", "Lcom/example/courseviewer/model/StudentModel;", "(Lcom/example/courseviewer/model/StudentModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStudent", "readAllStudents", "Landroidx/lifecycle/LiveData;", "", "readStudentById", "idStudent", "", "updateStudent", "app_debug"})
public abstract interface StudentDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.IGNORE)
    public abstract java.lang.Object createStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM studentTable")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> readAllStudents();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM studentTable WHERE idStudent=:idStudent")
    public abstract com.example.courseviewer.model.StudentModel readStudentById(int idStudent);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}