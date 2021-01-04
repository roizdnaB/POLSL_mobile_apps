package com.example.courseviewer.model.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0019J\u0016\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dJ\u000e\u0010\u001f\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!R&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006#"}, d2 = {"Lcom/example/courseviewer/model/repository/StudentSubjectRepo;", "", "studentSubjectDAO", "Lcom/example/courseviewer/model/dao/StudentSubjectDAO;", "(Lcom/example/courseviewer/model/dao/StudentSubjectDAO;)V", "readStudentInSubject", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/courseviewer/model/StudentModel;", "getReadStudentInSubject", "()Landroidx/lifecycle/LiveData;", "setReadStudentInSubject", "(Landroidx/lifecycle/LiveData;)V", "readStudentOutSubject", "getReadStudentOutSubject", "setReadStudentOutSubject", "readStudentSubjectObj", "Lcom/example/courseviewer/model/StudentSubjectModel;", "getReadStudentSubjectObj", "()Lcom/example/courseviewer/model/StudentSubjectModel;", "setReadStudentSubjectObj", "(Lcom/example/courseviewer/model/StudentSubjectModel;)V", "addStudentSubject", "", "studentSubjectModel", "(Lcom/example/courseviewer/model/StudentSubjectModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStudentSubject", "getStudentSubjectObject", "idSubject", "", "idStudent", "getStudentsInSubject", "subjectModel", "Lcom/example/courseviewer/model/SubjectModel;", "getStudentsOutSubject", "app_debug"})
public final class StudentSubjectRepo {
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> readStudentInSubject;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> readStudentOutSubject;
    @org.jetbrains.annotations.NotNull()
    public com.example.courseviewer.model.StudentSubjectModel readStudentSubjectObj;
    private final com.example.courseviewer.model.dao.StudentSubjectDAO studentSubjectDAO = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> getReadStudentInSubject() {
        return null;
    }
    
    public final void setReadStudentInSubject(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> getReadStudentOutSubject() {
        return null;
    }
    
    public final void setReadStudentOutSubject(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.courseviewer.model.StudentSubjectModel getReadStudentSubjectObj() {
        return null;
    }
    
    public final void setReadStudentSubjectObj(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentSubjectModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object addStudentSubject(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentSubjectModel studentSubjectModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteStudentSubject(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.StudentSubjectModel studentSubjectModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    public final void getStudentsInSubject(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.SubjectModel subjectModel) {
    }
    
    public final void getStudentsOutSubject(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.SubjectModel subjectModel) {
    }
    
    public final void getStudentSubjectObject(int idSubject, int idStudent) {
    }
    
    public StudentSubjectRepo(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.dao.StudentSubjectDAO studentSubjectDAO) {
        super();
    }
}