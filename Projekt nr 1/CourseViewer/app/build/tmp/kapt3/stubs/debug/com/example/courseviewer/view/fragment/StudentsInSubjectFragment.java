package com.example.courseviewer.view.fragment;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J&\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\u001a\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/example/courseviewer/view/fragment/StudentsInSubjectFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/courseviewer/viewModel/ICallbackStudent;", "()V", "myAdapter", "Lcom/example/courseviewer/viewModel/adapter/StudentListInSubjectAdapter;", "myLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "viewModelGrade", "Lcom/example/courseviewer/viewModel/GradeVM;", "viewModelStudent", "Lcom/example/courseviewer/viewModel/StudentVM;", "viewModelStudentSubject", "Lcom/example/courseviewer/viewModel/StudentSubjectVM;", "viewModelSubject", "Lcom/example/courseviewer/viewModel/SubjectVM;", "clickAddStudent", "", "studentModel", "Lcom/example/courseviewer/model/StudentModel;", "clickDeleteStudent", "clickEditStudent", "clickGradesOfStudent", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "app_debug"})
public final class StudentsInSubjectFragment extends androidx.fragment.app.Fragment implements com.example.courseviewer.viewModel.ICallbackStudent {
    private com.example.courseviewer.viewModel.adapter.StudentListInSubjectAdapter myAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager myLayoutManager;
    private androidx.recyclerview.widget.RecyclerView recyclerView;
    private com.example.courseviewer.viewModel.StudentVM viewModelStudent;
    private com.example.courseviewer.viewModel.SubjectVM viewModelSubject;
    private com.example.courseviewer.viewModel.StudentSubjectVM viewModelStudentSubject;
    private com.example.courseviewer.viewModel.GradeVM viewModelGrade;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void clickDeleteStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel) {
    }
    
    @java.lang.Override()
    public void clickGradesOfStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel) {
    }
    
    @java.lang.Override()
    public void clickEditStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel) {
    }
    
    @java.lang.Override()
    public void clickAddStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentModel studentModel) {
    }
    
    public StudentsInSubjectFragment() {
        super();
    }
}