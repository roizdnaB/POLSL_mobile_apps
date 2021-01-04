package com.example.courseviewer.model

import androidx.room.Entity
import androidx.room.PrimaryKey

//Model of the Subject, marked as Entity
@Entity(tableName = "subjectTable")
data class SubjectModel (

    //Auto generate the ID and set it as primary key
    @PrimaryKey(autoGenerate = true)
    val idSubject: Int = 0,
    var title: String,
    var description: String
)