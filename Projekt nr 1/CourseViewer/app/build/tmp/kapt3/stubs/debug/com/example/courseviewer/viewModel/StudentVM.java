package com.example.courseviewer.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0013R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/example/courseviewer/viewModel/StudentVM;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "currentStudent", "Lcom/example/courseviewer/model/StudentModel;", "getCurrentStudent", "()Lcom/example/courseviewer/model/StudentModel;", "setCurrentStudent", "(Lcom/example/courseviewer/model/StudentModel;)V", "getAllStudents", "Landroidx/lifecycle/LiveData;", "", "getGetAllStudents", "()Landroidx/lifecycle/LiveData;", "repo", "Lcom/example/courseviewer/model/repository/StudentRepo;", "addStudent", "", "studentModel", "deleteCurrentStudent", "getStudentById", "studentID", "", "updateCurrentStudent", "app_debug"})
public final class StudentVM extends androidx.lifecycle.AndroidViewModel {
    private final com.example.courseviewer.model.repository.StudentRepo repo = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.courseviewer.model.StudentModel currentStudent;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> getAllStudents = null;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.courseviewer.model.StudentModel getCurrentStudent() {
        return null;
    }
    
    public final void setCurrentStudent(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.StudentModel p0) {
    }
    
    public final void addStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> getGetAllStudents() {
        return null;
    }
    
    public final void getStudentById(int studentID) {
    }
    
    public final void updateCurrentStudent() {
    }
    
    public final void deleteCurrentStudent() {
    }
    
    public StudentVM(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}