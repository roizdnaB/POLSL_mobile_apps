package com.example.courseviewer.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\n\u001a\u00020\u0017R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\"\u0010\u0010\u001a\n \u0012*\u0004\u0018\u00010\u00110\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u0018"}, d2 = {"Lcom/example/courseviewer/viewModel/RaportVM;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allGrades", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/courseviewer/model/GradeModel;", "gradesFromToday", "getGradesFromToday", "()Landroidx/lifecycle/LiveData;", "setGradesFromToday", "(Landroidx/lifecycle/LiveData;)V", "repo", "Lcom/example/courseviewer/model/repository/GradeRepo;", "today", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "getToday", "()Ljava/util/Calendar;", "setToday", "(Ljava/util/Calendar;)V", "", "app_debug"})
public final class RaportVM extends androidx.lifecycle.AndroidViewModel {
    private final com.example.courseviewer.model.repository.GradeRepo repo = null;
    private final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> allGrades = null;
    @org.jetbrains.annotations.NotNull()
    public androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> gradesFromToday;
    private java.util.Calendar today;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getGradesFromToday() {
        return null;
    }
    
    public final void setGradesFromToday(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> p0) {
    }
    
    public final java.util.Calendar getToday() {
        return null;
    }
    
    public final void setToday(java.util.Calendar p0) {
    }
    
    public final void getGradesFromToday() {
    }
    
    public RaportVM(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super(null);
    }
}