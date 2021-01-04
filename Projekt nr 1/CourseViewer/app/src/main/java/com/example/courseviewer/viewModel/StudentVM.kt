package com.example.courseviewer.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.courseviewer.model.CourseViewerDatabase
import com.example.courseviewer.model.repository.StudentRepo
import com.example.courseviewer.model.StudentModel
import kotlinx.coroutines.launch

//View Model of the Student class
class StudentVM(application: Application): AndroidViewModel(application) {

    //Create the repo
    private val repo: StudentRepo = StudentRepo(
        CourseViewerDatabase.getDatabase(application).studentDAO())

    //Create the current Student
    var currentStudent: StudentModel? = null

    //Add the student
    fun addStudent(studentModel: StudentModel) {
        viewModelScope.launch { repo.addStudent(studentModel) }
    }

    //Get all Students
    val getAllStudents: LiveData<List<StudentModel>> = repo.getAllStudents

    //Get student by ID
    fun getStudentById(studentID: Int) {
        viewModelScope.launch { repo.getStudentById(studentID) }
    }

    //Update the current student
    fun updateCurrentStudent() {
        viewModelScope.launch { repo.updateStudent(currentStudent) }
    }

    //Delete the current student
    fun deleteCurrentStudent() {
        viewModelScope.launch { repo.deleteStudent(currentStudent) }
    }
}