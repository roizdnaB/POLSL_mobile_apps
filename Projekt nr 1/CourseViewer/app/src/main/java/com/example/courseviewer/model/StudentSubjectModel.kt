package com.example.courseviewer.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.PrimaryKey
import javax.security.auth.Subject

@Entity(
    tableName = "student_subject_table",
    foreignKeys = [
        ForeignKey(
            entity = StudentModel::class,
            parentColumns = ["idStudent"],
            childColumns = ["idStudentS"],
            onDelete = ForeignKey.CASCADE),
        ForeignKey(
            entity = SubjectModel::class,
            parentColumns = ["idSubject"],
            childColumns = ["idSubjectS"],
            onDelete = ForeignKey.CASCADE
        )])
data class StudentSubjectModel (
    @PrimaryKey(autoGenerate = true)
    var id:Int = 0,
    var idStudentS: Int,
    var idSubjectS: Int
)