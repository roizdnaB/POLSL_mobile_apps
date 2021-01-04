package com.example.courseviewer.viewModel

import com.example.courseviewer.model.SubjectModel

interface ICallbackSubject {

    fun clickEditSubject(subjectModel: SubjectModel)
    fun clickDeleteSubject(subjectModel: SubjectModel)
    fun clickGoToStudents(subjectModel: SubjectModel)
}