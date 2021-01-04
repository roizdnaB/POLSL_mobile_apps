package com.example.courseviewer.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.courseviewer.model.StudentModel

//Create a Student data access object
@Dao
interface StudentDAO {

    //CRUD - Create, Read, Update, Delete
    //Create the Student, on conflict just ignore
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun createStudent(studentModel: StudentModel)

    //Read all Students
    @Query("SELECT * FROM studentTable")
    fun readAllStudents(): LiveData<List<StudentModel>>

    //Read student with given ID
    @Query("SELECT * FROM studentTable WHERE idStudent=:idStudent")
    fun readStudentById(idStudent: Int): StudentModel

    //Update the Student
    @Update
    suspend fun updateStudent(studentModel: StudentModel)

    //Delete the Student
    @Delete
    suspend fun deleteStudent(studentModel: StudentModel)
}