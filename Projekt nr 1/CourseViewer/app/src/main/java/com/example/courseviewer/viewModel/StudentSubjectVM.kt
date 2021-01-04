package com.example.courseviewer.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.courseviewer.model.CourseViewerDatabase
import com.example.courseviewer.model.repository.StudentSubjectRepo
import com.example.courseviewer.model.StudentModel
import com.example.courseviewer.model.StudentSubjectModel
import com.example.courseviewer.model.SubjectModel
import kotlinx.coroutines.launch

class StudentSubjectVM(application: Application): AndroidViewModel(application) {

    private val repo: StudentSubjectRepo = StudentSubjectRepo(
        CourseViewerDatabase.getDatabase(application).studentSubjectDAO()
    )

    lateinit var readStudentsInSubject: LiveData<List<StudentModel>>
    lateinit var readStudentsOutSubject: LiveData<List<StudentModel>>
    lateinit var currentStudentSubject: StudentSubjectModel

    var currentStudent: StudentModel? = null
    var currentSubject: SubjectModel? = null

    fun addStudentToSubject(studentModel: StudentModel?, subjectModel: SubjectModel?) {
        if (studentModel != null && subjectModel != null) {
            viewModelScope.launch {
                repo.addStudentSubject(
                    StudentSubjectModel(
                        idStudentS = studentModel.idStudent,
                        idSubjectS = subjectModel.idSubject
                    )
                )
            }
        }
    }

    fun deleteStudentFromSubject() {
        if (currentStudent != null && currentSubject != null) {
            repo.getStudentSubjectObject(currentSubject!!.idSubject, currentStudent!!.idStudent)
            currentStudentSubject = repo.readStudentSubjectObj

            viewModelScope.launch {  repo.deleteStudentSubject(currentStudentSubject) }
        }
    }

    fun getStudentsInSubject(subjectModel: SubjectModel?) {
        if (subjectModel != null) {
            repo.getStudentsInSubject(currentSubject!!)
            readStudentsInSubject = repo.readStudentInSubject
        }
    }

    fun getStudentsOutSubject(subjectModel: SubjectModel?) {
        if (subjectModel != null) {
            repo.getStudentsOutSubject(currentSubject!!)
            readStudentsOutSubject = repo.readStudentOutSubject
        }
    }

    fun getStudentSubjectObject(idSubject: Int?, idStudent: Int?) {
            if (idStudent != null && idSubject != null) {
                    repo.getStudentSubjectObject(idSubject, idStudent)
                    currentStudentSubject = repo.readStudentSubjectObj
            }
    }
}
