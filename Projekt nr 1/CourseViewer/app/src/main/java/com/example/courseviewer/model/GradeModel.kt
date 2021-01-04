package com.example.courseviewer.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey
import androidx.room.ForeignKey.CASCADE
import androidx.room.TypeConverters
import java.util.*

//Set the foreign keys
@Entity(
    tableName = "gradeTable",
    foreignKeys = [
        ForeignKey(
            entity = StudentModel::class,
            parentColumns = ["idStudent"],
            childColumns = ["idGStudent"],
            onDelete = ForeignKey.CASCADE),
        ForeignKey(
            entity = SubjectModel::class,
            parentColumns = ["idSubject"],
            childColumns = ["idGSubject"],
            onDelete = ForeignKey.CASCADE)
    ])
@TypeConverters(DateConverters::class)
data class GradeModel (

    //Auto generate the ID and set it as primary key
    @PrimaryKey(autoGenerate = true)
    val idGrade: Int = 0,
    val idGStudent: Int,
    val idGSubject: Int,
    var description: String,
    var grade: Long,
    var date: Date
)