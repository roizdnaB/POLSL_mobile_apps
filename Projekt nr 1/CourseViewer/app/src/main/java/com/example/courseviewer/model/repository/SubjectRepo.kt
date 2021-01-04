package com.example.courseviewer.model.repository

import androidx.lifecycle.LiveData
import com.example.courseviewer.model.dao.SubjectDAO
import com.example.courseviewer.model.SubjectModel

//Repository of the Subject base
class SubjectRepo(
    //Dependency Injection
    private val subjectDAO: SubjectDAO
) {

    //Add Subject to database
    suspend fun addSubject(subjectModel: SubjectModel?) {
        if (subjectModel != null)
            subjectDAO.createSubject(subjectModel)
    }

    //Read all Subjects from database
    val getAllSubjects: LiveData<List<SubjectModel>> = subjectDAO.readAllSubjects()

    //Read Subject by ID
    fun getSubjectById(idSubject: Int): SubjectModel {
        return subjectDAO.readSubjectById(idSubject)
    }

    //Update Subject
    suspend fun updateSubject(subjectModel: SubjectModel?) {
        if (subjectModel != null)
            subjectDAO.updateSubject(subjectModel)
    }

    //Delete Subject
    suspend fun deleteSubject(subjectModel: SubjectModel?) {
        if (subjectModel != null)
            subjectDAO.deleteSubject(subjectModel)
    }
}