package com.example.courseviewer.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006J\u0006\u0010\"\u001a\u00020 J\u000e\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020%J\u0016\u0010&\u001a\u00020 2\u0006\u0010$\u001a\u00020%2\u0006\u0010\'\u001a\u00020%J\u0006\u0010(\u001a\u00020 R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u0012\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R&\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\u0018\u0010\u0019R&\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00130\u0012X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0015\"\u0004\b\u001c\u0010\u0019R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006)"}, d2 = {"Lcom/example/courseviewer/viewModel/GradeVM;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "currentGrade", "Lcom/example/courseviewer/model/GradeModel;", "getCurrentGrade", "()Lcom/example/courseviewer/model/GradeModel;", "setCurrentGrade", "(Lcom/example/courseviewer/model/GradeModel;)V", "currentStudentSubject", "Lcom/example/courseviewer/viewModel/StudentSubjectVM;", "getCurrentStudentSubject", "()Lcom/example/courseviewer/viewModel/StudentSubjectVM;", "setCurrentStudentSubject", "(Lcom/example/courseviewer/viewModel/StudentSubjectVM;)V", "getAllGrades", "Landroidx/lifecycle/LiveData;", "", "getGetAllGrades", "()Landroidx/lifecycle/LiveData;", "listAllStudentGrades", "getListAllStudentGrades", "setListAllStudentGrades", "(Landroidx/lifecycle/LiveData;)V", "listStudentGrades", "getListStudentGrades", "setListStudentGrades", "repo", "Lcom/example/courseviewer/model/repository/GradeRepo;", "addGrade", "", "gradeModel", "deleteCurrentGrade", "getAllStudentGrades", "idStudent", "", "getStudentGrades", "idSubject", "updateCurrentGrade", "app_debug"})
public final class GradeVM extends androidx.lifecycle.AndroidViewModel {
    private final com.example.courseviewer.model.repository.GradeRepo repo = null;
    @org.jetbrains.annotations.Nullable()
    private com.example.courseviewer.viewModel.StudentSubjectVM currentStudentSubject;
    @org.jetbrains.annotations.Nullable()
    private com.example.courseviewer.model.GradeModel currentGrade;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getAllGrades = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> listStudentGrades;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> listAllStudentGrades;
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.courseviewer.viewModel.StudentSubjectVM getCurrentStudentSubject() {
        return null;
    }
    
    public final void setCurrentStudentSubject(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.viewModel.StudentSubjectVM p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.courseviewer.model.GradeModel getCurrentGrade() {
        return null;
    }
    
    public final void setCurrentGrade(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.GradeModel p0) {
    }
    
    public final void addGrade(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.GradeModel gradeModel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getGetAllGrades() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getListStudentGrades() {
        return null;
    }
    
    public final void setListStudentGrades(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getListAllStudentGrades() {
        return null;
    }
    
    public final void setListAllStudentGrades(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> p0) {
    }
    
    public final void updateCurrentGrade() {
    }
    
    public final void deleteCurrentGrade() {
    }
    
    public final void getStudentGrades(int idStudent, int idSubject) {
    }
    
    public final void getAllStudentGrades(int idStudent) {
    }
    
    public GradeVM(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}