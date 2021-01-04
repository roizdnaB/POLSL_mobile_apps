package com.example.courseviewer.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.courseviewer.model.CourseViewerDatabase
import com.example.courseviewer.model.repository.SubjectRepo
import com.example.courseviewer.model.SubjectModel
import kotlinx.coroutines.launch

//View Model of the Subject class
class SubjectVM(application: Application): AndroidViewModel(application) {

    //Create the repo
    private val repo: SubjectRepo = SubjectRepo(
        CourseViewerDatabase.getDatabase(application).subjectDAO())

    //Create the current Subject
    var currentSubject: SubjectModel? = null

    //Add the subject
    fun addSubject(subjectModel: SubjectModel) {
        viewModelScope.launch { repo.addSubject(subjectModel) }
    }

    //Get all subject
    val getAllSubjects: LiveData<List<SubjectModel>> = repo.getAllSubjects

    //Get subject by ID
    fun getSubjectById(subjectID: Int) {
        viewModelScope.launch { repo.getSubjectById(subjectID) }
    }

    //Update the current subject
    fun updateCurrentSubject() {
        viewModelScope.launch { repo.updateSubject(currentSubject) }
    }

    //Delete the current subject
    fun deleteCurrentSubject() {
        viewModelScope.launch { repo.deleteSubject(currentSubject) }
    }
}