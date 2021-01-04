package com.example.courseviewer.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.courseviewer.model.CourseViewerDatabase
import com.example.courseviewer.model.GradeModel
import com.example.courseviewer.model.StudentSubjectModel
import com.example.courseviewer.model.repository.GradeRepo
import kotlinx.coroutines.launch

//View Model of the Grade class
class GradeVM(application: Application): AndroidViewModel(application) {

    //Create the repo
    private val repo: GradeRepo = GradeRepo(
        CourseViewerDatabase.getDatabase(application).gradeDAO())

    //Create the current grade
    var currentStudentSubject: StudentSubjectVM? = null
    var currentGrade: GradeModel? = null

    //Add the grade
    fun addGrade(gradeModel: GradeModel) {
        viewModelScope.launch { repo.addGrade(gradeModel) }
    }

    //Get all grades
    val getAllGrades: LiveData<List<GradeModel>> = repo.getAllGrades
    lateinit var listStudentGrades: LiveData<List<GradeModel>>
    lateinit var listAllStudentGrades: LiveData<List<GradeModel>>

    //Update the current grade
    fun updateCurrentGrade() {
        viewModelScope.launch { repo.updateGrade(currentGrade) }
    }

    //Delete the current grade
    fun deleteCurrentGrade() {
        viewModelScope.launch { repo.deleteGrade(currentGrade) }
    }

    fun getStudentGrades(idStudent: Int, idSubject: Int) {
        if (currentStudentSubject != null) {
            repo.getStudentGrades(idStudent, idSubject)
            listStudentGrades = repo.getListStudentGrades
        }
    }

    fun getAllStudentGrades(idStudent: Int) {
        repo.getAllStudentGrades(idStudent)
        listAllStudentGrades = repo.getListAllStudentGrades
    }
}