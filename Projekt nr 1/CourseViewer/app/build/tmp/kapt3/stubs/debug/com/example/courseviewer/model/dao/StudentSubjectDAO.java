package com.example.courseviewer.model.dao;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\'J\u001c\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u000e\u001a\u00020\nH\'J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u000e\u001a\u00020\nH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/courseviewer/model/dao/StudentSubjectDAO;", "", "createStudentSubject", "", "studentSubjectModel", "Lcom/example/courseviewer/model/StudentSubjectModel;", "(Lcom/example/courseviewer/model/StudentSubjectModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteStudentSubject", "deleteStudentSubjectByTheirIds", "studentId", "", "subjectId", "(IILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readStudentSubjectObject", "idSubject", "idStudent", "readStudentsInSubject", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/courseviewer/model/StudentModel;", "readStudentsOutSubject", "app_debug"})
public abstract interface StudentSubjectDAO {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract java.lang.Object createStudentSubject(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentSubjectModel studentSubjectModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object deleteStudentSubject(@org.jetbrains.annotations.NotNull()
    com.example.courseviewer.model.StudentSubjectModel studentSubjectModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM student_subject_table WHERE (idStudentS = :studentId AND idSubjectS = :subjectId)")
    public abstract java.lang.Object deleteStudentSubjectByTheirIds(int studentId, int subjectId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p2);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM studentTable WHERE idStudent IN (SELECT idStudentS FROM student_subject_table WHERE idSubjectS = :idSubject)")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> readStudentsInSubject(int idSubject);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM studentTable WHERE idStudent NOT IN (SELECT idStudentS FROM student_subject_table WHERE idSubjectS = :idSubject)")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.courseviewer.model.StudentModel>> readStudentsOutSubject(int idSubject);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM student_subject_table WHERE (idSubjectS = :idSubject AND idStudentS = :idStudent)")
    public abstract com.example.courseviewer.model.StudentSubjectModel readStudentSubjectObject(int idSubject, int idStudent);
}