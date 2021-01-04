package com.example.courseviewer.viewModel

import com.example.courseviewer.model.GradeModel

interface ICallbackGrade {

    fun clickEditGrade(gradeModel: GradeModel)
    fun clickDeleteGrade(gradeModel: GradeModel)
    fun clickAddGrade(gradeModel: GradeModel)
}