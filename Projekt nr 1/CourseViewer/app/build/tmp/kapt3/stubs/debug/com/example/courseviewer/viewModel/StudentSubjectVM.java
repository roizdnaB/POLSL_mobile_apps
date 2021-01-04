package com.example.courseviewer.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u00062\b\u0010&\u001a\u0004\u0018\u00010\u0012J\u0006\u0010\'\u001a\u00020$J\u001f\u0010(\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010+\u001a\u0004\u0018\u00010*\u00a2\u0006\u0002\u0010,J\u0010\u0010-\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u0012J\u0010\u0010.\u001a\u00020$2\b\u0010&\u001a\u0004\u0018\u00010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00190\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR&\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00190\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001dR\u000e\u0010!\u001a\u00020\"X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006/"}, d2 = {"Lcom/example/courseviewer/viewModel/StudentSubjectVM;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "currentStudent", "Lcom/example/courseviewer/model/StudentModel;", "getCurrentStudent", "()Lcom/example/courseviewer/model/StudentModel;", "setCurrentStudent", "(Lcom/example/courseviewer/model/StudentModel;)V", "currentStudentSubject", "Lcom/example/courseviewer/model/StudentSubjectModel;", "getCurrentStudentSubject", "()Lcom/example/courseviewer/model/StudentSubjectModel;", "setCurrentStudentSubject", "(Lcom/example/courseviewer/model/StudentSubjectModel;)V", "currentSubject", "Lcom/example/courseviewer/model/SubjectModel;", "getCurrentSubject", "()Lcom/example/courseviewer/model/SubjectModel;", "setCurrentSubject", "(Lcom/example/courseviewer/model/SubjectModel;)V", "readStudentsInSubject", "Landroidx/lifecycle/LiveData;", "", "getReadStudentsInSubject", "()Landroidx/lifecycle/LiveData;", "setReadStudentsInSubject", "(Landroidx/lifecycle/LiveData;)V", "readStudentsOutSubject", "getReadStudentsOutSubject", "setReadStudentsOutSubject", "repo", "Lcom/example/courseviewer/model/repository/StudentSubjectRepo;", "addStudentToSubject", "", "studentModel", "subjectModel", "deleteStudentFromSubject", "getStudentSubjectObject", "idSubject", "", "idStudent", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "getStudentsInSubject", "getStudentsOutSubject", "app_debug"})
public final class StudentSubjectVM extends androidx.lifecycle.AndroidViewModel {
    private final com.example.courseviewer.model.repository.StudentSubjectRepo repo = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> readStudentsInSubject;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> readStudentsOutSubject;
    @org.jetbrains.annotations.NotNull()
    public com.example.courseviewer.model.StudentSubjectModel currentStudentSubject;
    @org.jetbrains.annotations.Nullable()
    private com.example.courseviewer.model.StudentModel currentStudent;
    @org.jetbrains.annotations.Nullable()
    private com.example.courseviewer.model.SubjectModel currentSubject;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> getReadStudentsInSubject() {
        return null;
    }
    
    public final void setReadStudentsInSubject(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> getReadStudentsOutSubject() {
        return null;
    }
    
    public final void setReadStudentsOutSubject(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.courseviewer.model.StudentSubjectModel getCurrentStudentSubject() {
        return null;
    }
    
    public final void setCurrentStudentSubject(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentSubjectModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.courseviewer.model.StudentModel getCurrentStudent() {
        return null;
    }
    
    public final void setCurrentStudent(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.StudentModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.courseviewer.model.SubjectModel getCurrentSubject() {
        return null;
    }
    
    public final void setCurrentSubject(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.SubjectModel p0) {
    }
    
    public final void addStudentToSubject(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.StudentModel studentModel, @org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.SubjectModel subjectModel) {
    }
    
    public final void deleteStudentFromSubject() {
    }
    
    public final void getStudentsInSubject(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.SubjectModel subjectModel) {
    }
    
    public final void getStudentsOutSubject(@org.jetbrains.annotations.Nullable()
    com.example.courseviewer.model.SubjectModel subjectModel) {
    }
    
    public final void getStudentSubjectObject(@org.jetbrains.annotations.Nullable()
    java.lang.Integer idSubject, @org.jetbrains.annotations.Nullable()
    java.lang.Integer idStudent) {
    }
    
    public StudentSubjectVM(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}