package com.example.courseviewer.model.repository

import androidx.lifecycle.LiveData
import com.example.courseviewer.model.dao.GradeDAO
import com.example.courseviewer.model.GradeModel

//Repository of the Grade base
class GradeRepo(
    private val gradeDAO: GradeDAO
) {

    //Add Grade to database
    suspend fun addGrade(gradeModel: GradeModel?) {
        if (gradeModel != null)
            gradeDAO.createGrade(gradeModel)
    }

    //Read all Grades
    val getAllGrades: LiveData<List<GradeModel>> = gradeDAO.readAllGrades()
    lateinit var getListStudentGrades: LiveData<List<GradeModel>>
    lateinit var getListAllStudentGrades: LiveData<List<GradeModel>>

    //Update Grade
    suspend fun updateGrade(gradeModel: GradeModel?) {
        if (gradeModel != null)
            gradeDAO.updateGrade(gradeModel)
    }

    //Delete Grade
    suspend fun deleteGrade(gradeModel: GradeModel?) {
        if (gradeModel != null)
            gradeDAO.deleteGrade(gradeModel)
    }

    fun getStudentGrades(idStudent: Int, idSubject: Int) {
        getListStudentGrades = gradeDAO.readStudentsGrades(idStudent, idSubject)
    }

    fun getAllStudentGrades(idStudent: Int) {
        getListAllStudentGrades = gradeDAO.readAllStudentsGrades(idStudent)
    }
}