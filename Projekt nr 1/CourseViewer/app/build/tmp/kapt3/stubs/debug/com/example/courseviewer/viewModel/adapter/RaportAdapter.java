package com.example.courseviewer.viewModel.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\"B)\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u001c\u0010\u001a\u001a\u00020\u001b2\n\u0010\u001c\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u0019H\u0016J\u001c\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0019H\u0016R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lcom/example/courseviewer/viewModel/adapter/RaportAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/courseviewer/viewModel/adapter/RaportAdapter$RaportHolder;", "gradeList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/courseviewer/model/GradeModel;", "viewModelStudent", "Lcom/example/courseviewer/viewModel/StudentVM;", "viewModelSubject", "Lcom/example/courseviewer/viewModel/SubjectVM;", "(Landroidx/lifecycle/LiveData;Lcom/example/courseviewer/viewModel/StudentVM;Lcom/example/courseviewer/viewModel/SubjectVM;)V", "getGradeList", "()Landroidx/lifecycle/LiveData;", "setGradeList", "(Landroidx/lifecycle/LiveData;)V", "getViewModelStudent", "()Lcom/example/courseviewer/viewModel/StudentVM;", "setViewModelStudent", "(Lcom/example/courseviewer/viewModel/StudentVM;)V", "getViewModelSubject", "()Lcom/example/courseviewer/viewModel/SubjectVM;", "setViewModelSubject", "(Lcom/example/courseviewer/viewModel/SubjectVM;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RaportHolder", "app_debug"})
public final class RaportAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.courseviewer.viewModel.adapter.RaportAdapter.RaportHolder> {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> gradeList;
    @org.jetbrains.annotations.NotNull()
    private com.example.courseviewer.viewModel.StudentVM viewModelStudent;
    @org.jetbrains.annotations.NotNull()
    private com.example.courseviewer.viewModel.SubjectVM viewModelSubject;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.courseviewer.viewModel.adapter.RaportAdapter.RaportHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.viewModel.adapter.RaportAdapter.RaportHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> getGradeList() {
        return null;
    }
    
    public final void setGradeList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.courseviewer.viewModel.StudentVM getViewModelStudent() {
        return null;
    }
    
    public final void setViewModelStudent(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.viewModel.StudentVM p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.courseviewer.viewModel.SubjectVM getViewModelSubject() {
        return null;
    }
    
    public final void setViewModelSubject(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.viewModel.SubjectVM p0) {
    }
    
    public RaportAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.GradeModel>> gradeList, @org.jetbrains.annotations.NotNull()
    com.example.courseviewer.viewModel.StudentVM viewModelStudent, @org.jetbrains.annotations.NotNull()
    com.example.courseviewer.viewModel.SubjectVM viewModelSubject) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/courseviewer/viewModel/adapter/RaportAdapter$RaportHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/courseviewer/viewModel/adapter/RaportAdapter;Landroid/view/View;)V", "app_debug"})
    public final class RaportHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public RaportHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}