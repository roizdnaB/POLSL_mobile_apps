package com.example.courseviewer.model.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\tH\'J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t2\u0006\u0010\f\u001a\u00020\rH\'J$\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\'J\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/example/courseviewer/model/dao/GradeDAO;", "", "createGrade", "", "gradeModel", "Lcom/example/courseviewer/model/GradeModel;", "(Lcom/example/courseviewer/model/GradeModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteGrade", "readAllGrades", "Landroidx/lifecycle/LiveData;", "", "readAllStudentsGrades", "idStudent", "", "readStudentsGrades", "idSubject", "updateGrade", "app_debug"})
public abstract interface GradeDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object createGrade(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.GradeModel gradeModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM gradeTable")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> readAllGrades();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM gradeTable WHERE (gradeTable.idGStudent = :idStudent AND gradeTable.idGSubject = :idSubject)")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> readStudentsGrades(int idStudent, int idSubject);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM gradeTable WHERE gradeTable.idGStudent = :idStudent")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> readAllStudentsGrades(int idStudent);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Update()
    public abstract java.lang.Object updateGrade(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.GradeModel gradeModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteGrade(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.GradeModel gradeModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
}