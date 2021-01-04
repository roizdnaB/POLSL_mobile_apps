package com.example.courseviewer.model.repository

import androidx.lifecycle.LiveData
import com.example.courseviewer.model.dao.StudentDAO
import com.example.courseviewer.model.StudentModel

//Repository of the Student base
class StudentRepo(
    //Dependency Injection
    private val studentDAO: StudentDAO
) {

    //Add Student to database
    suspend fun addStudent(studentModel: StudentModel?) {
        if (studentModel != null)
            studentDAO.createStudent(studentModel)
    }

    //Read all Students from database
    val getAllStudents: LiveData<List<StudentModel>> = studentDAO.readAllStudents()

    //Read Student by ID
    fun getStudentById(idStudent: Int): StudentModel {
        return studentDAO.readStudentById(idStudent)
    }

    //Update Student
    suspend fun updateStudent(studentModel: StudentModel?) {
        if (studentModel != null)
            studentDAO.updateStudent(studentModel)
    }

    //Delete Student
    suspend fun deleteStudent(studentModel: StudentModel?) {
        if (studentModel != null)
            studentDAO.deleteStudent(studentModel)
    }

}