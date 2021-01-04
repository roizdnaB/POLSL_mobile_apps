package com.example.courseviewer.viewModel

import com.example.courseviewer.model.StudentModel

interface ICallbackStudent {

    fun clickEditStudent(studentModel: StudentModel)
    fun clickDeleteStudent(studentModel: StudentModel)
    fun clickAddStudent(studentModel: StudentModel)
    fun clickGradesOfStudent(studentModel: StudentModel)
}