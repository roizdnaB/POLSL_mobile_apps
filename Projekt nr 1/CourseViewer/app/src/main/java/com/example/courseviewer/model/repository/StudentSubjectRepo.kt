package com.example.courseviewer.model.repository

import android.provider.Settings
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.courseviewer.model.StudentModel
import com.example.courseviewer.model.StudentSubjectModel
import com.example.courseviewer.model.SubjectModel
import com.example.courseviewer.model.dao.StudentSubjectDAO
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class StudentSubjectRepo(
    private val studentSubjectDAO: StudentSubjectDAO
) {

    lateinit var readStudentInSubject: LiveData<List<StudentModel>>
    lateinit var readStudentOutSubject: LiveData<List<StudentModel>>
    lateinit var readStudentSubjectObj: StudentSubjectModel


    suspend fun addStudentSubject(studentSubjectModel: StudentSubjectModel) {
            studentSubjectDAO.createStudentSubject(studentSubjectModel)
    }

    suspend fun deleteStudentSubject(studentSubjectModel: StudentSubjectModel?) {
            if (studentSubjectModel != null)
                studentSubjectDAO.deleteStudentSubject(studentSubjectModel!!)
    }

    fun getStudentsInSubject(subjectModel: SubjectModel) {
            readStudentInSubject = studentSubjectDAO.readStudentsInSubject(subjectModel.idSubject)
    }

    fun getStudentsOutSubject(subjectModel: SubjectModel) {
            readStudentOutSubject = studentSubjectDAO.readStudentsOutSubject(subjectModel.idSubject)
    }

    fun getStudentSubjectObject(idSubject: Int, idStudent: Int) {
            readStudentSubjectObj = studentSubjectDAO.readStudentSubjectObject(idSubject, idStudent)
    }

}