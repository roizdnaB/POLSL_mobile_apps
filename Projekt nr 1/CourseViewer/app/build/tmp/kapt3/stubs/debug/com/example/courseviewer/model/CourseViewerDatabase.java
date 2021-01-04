package com.example.courseviewer.model;

import java.lang.System;

@androidx.room.Database(entities = {com.example.courseviewer.model.StudentModel.class, com.example.courseviewer.model.SubjectModel.class, com.example.courseviewer.model.GradeModel.class, com.example.courseviewer.model.StudentSubjectModel.class}, version = 1)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&\u00a8\u0006\f"}, d2 = {"Lcom/example/courseviewer/model/CourseViewerDatabase;", "Landroidx/room/RoomDatabase;", "()V", "gradeDAO", "Lcom/example/courseviewer/model/dao/GradeDAO;", "studentDAO", "Lcom/example/courseviewer/model/dao/StudentDAO;", "studentSubjectDAO", "Lcom/example/courseviewer/model/dao/StudentSubjectDAO;", "subjectDAO", "Lcom/example/courseviewer/model/dao/SubjectDAO;", "Companion", "app_debug"})
public abstract class CourseViewerDatabase extends androidx.room.RoomDatabase {
    private static volatile com.example.courseviewer.model.CourseViewerDatabase INSTANCE;
    public static final com.example.courseviewer.model.CourseViewerDatabase.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.courseviewer.model.dao.StudentDAO studentDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.courseviewer.model.dao.SubjectDAO subjectDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.courseviewer.model.dao.GradeDAO gradeDAO();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.courseviewer.model.dao.StudentSubjectDAO studentSubjectDAO();
    
    public CourseViewerDatabase() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/courseviewer/model/CourseViewerDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/example/courseviewer/model/CourseViewerDatabase;", "getDatabase", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.courseviewer.model.CourseViewerDatabase getDatabase(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}