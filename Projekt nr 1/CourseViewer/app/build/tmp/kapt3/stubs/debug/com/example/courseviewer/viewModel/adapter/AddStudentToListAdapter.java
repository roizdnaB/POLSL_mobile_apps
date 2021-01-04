package com.example.courseviewer.viewModel.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u001aB!\u0012\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u001c\u0010\u0012\u001a\u00020\u00132\n\u0010\u0014\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0011H\u0016J\u001c\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0011H\u0016R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/courseviewer/viewModel/adapter/AddStudentToListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/courseviewer/viewModel/adapter/AddStudentToListAdapter$StudentHolder;", "studentList", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/courseviewer/model/StudentModel;", "studentCallback", "Lcom/example/courseviewer/viewModel/ICallbackStudent;", "(Landroidx/lifecycle/LiveData;Lcom/example/courseviewer/viewModel/ICallbackStudent;)V", "getStudentCallback", "()Lcom/example/courseviewer/viewModel/ICallbackStudent;", "getStudentList", "()Landroidx/lifecycle/LiveData;", "setStudentList", "(Landroidx/lifecycle/LiveData;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "StudentHolder", "app_debug"})
public final class AddStudentToListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.courseviewer.viewModel.adapter.AddStudentToListAdapter.StudentHolder> {
    @org.jetbrains.annotations.NotNull()
    private androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> studentList;
    @org.jetbrains.annotations.NotNull()
    private final com.example.courseviewer.viewModel.ICallbackStudent studentCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.courseviewer.viewModel.adapter.AddStudentToListAdapter.StudentHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.viewModel.adapter.AddStudentToListAdapter.StudentHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> getStudentList() {
        return null;
    }
    
    public final void setStudentList(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.courseviewer.viewModel.ICallbackStudent getStudentCallback() {
        return null;
    }
    
    public AddStudentToListAdapter(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> studentList, @org.jetbrains.annotations.NotNull()
    com.example.courseviewer.viewModel.ICallbackStudent studentCallback) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/example/courseviewer/viewModel/adapter/AddStudentToListAdapter$StudentHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/courseviewer/viewModel/adapter/AddStudentToListAdapter;Landroid/view/View;)V", "app_debug"})
    public final class StudentHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public StudentHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}