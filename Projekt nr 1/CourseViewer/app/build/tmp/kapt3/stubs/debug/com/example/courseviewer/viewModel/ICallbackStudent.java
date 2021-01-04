package com.example.courseviewer.viewModel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\t"}, d2 = {"Lcom/example/courseviewer/viewModel/ICallbackStudent;", "", "clickAddStudent", "", "studentModel", "Lcom/example/courseviewer/model/StudentModel;", "clickDeleteStudent", "clickEditStudent", "clickGradesOfStudent", "app_debug"})
public abstract interface ICallbackStudent {
    
    public abstract void clickEditStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel);
    
    public abstract void clickDeleteStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel);
    
    public abstract void clickAddStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel);
    
    public abstract void clickGradesOfStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel);
}