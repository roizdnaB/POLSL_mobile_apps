package com.example.courseviewer.model

import androidx.room.Entity
import androidx.room.PrimaryKey

//Model of the Student, marked as Entity
@Entity(tableName = "studentTable")
data class StudentModel(

    //Auto generate the ID and set it as primary key
    @PrimaryKey(autoGenerate = true)
    val idStudent: Int = 0,
    var firstName: String,
    var lastName: String
)