package com.example.courseviewer.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.courseviewer.model.SubjectModel


//Create a Subject data access object
@Dao
interface SubjectDAO {

    //CRUD - Create, Read, Update, Delete
    //Create the Subject, on conflict just ignore
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun createSubject(subjectModel: SubjectModel)

    //Read all Subjects
    @Query("SELECT * FROM subjectTable")
    fun readAllSubjects(): LiveData<List<SubjectModel>>

    //Read subject with given ID
    @Query("SELECT * FROM subjectTable WHERE idSubject=:idSubject")
    fun readSubjectById(idSubject: Int): SubjectModel

    //Update the Subject
    @Update
    suspend fun updateSubject(subjectModel: SubjectModel)

    //Delete the Subject
    @Delete
    suspend fun deleteSubject(subjectModel: SubjectModel)
}