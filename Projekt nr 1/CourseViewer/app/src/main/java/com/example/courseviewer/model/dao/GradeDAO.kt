package com.example.courseviewer.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.courseviewer.model.GradeModel

@Dao
interface GradeDAO {

    //CRUD - Create, Read, Update, Delete
    //Create the Grade, on conflict just ignore
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createGrade(gradeModel: GradeModel)

    //Read all Grades
    @Query("SELECT * FROM gradeTable")
    fun readAllGrades(): LiveData<List<GradeModel>>

    @Query("SELECT * FROM gradeTable WHERE (gradeTable.idGStudent = :idStudent AND gradeTable.idGSubject = :idSubject)")
    fun readStudentsGrades(idStudent: Int, idSubject: Int): LiveData<List<GradeModel>>

    @Query("SELECT * FROM gradeTable WHERE gradeTable.idGStudent = :idStudent")
    fun readAllStudentsGrades(idStudent: Int): LiveData<List<GradeModel>>

    //Update the Grade
    @Update
    suspend fun updateGrade(gradeModel: GradeModel)

    //Delete the Grade
    @Delete
    suspend fun deleteGrade(gradeModel: GradeModel)
}