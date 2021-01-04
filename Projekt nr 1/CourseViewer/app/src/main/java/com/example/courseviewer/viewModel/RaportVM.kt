package com.example.courseviewer.viewModel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.Transformations
import com.example.courseviewer.model.CourseViewerDatabase
import com.example.courseviewer.model.GradeModel
import com.example.courseviewer.model.repository.GradeRepo
import java.util.*

class RaportVM(application: Application): AndroidViewModel(application) {

    private val repo: GradeRepo = GradeRepo(
        CourseViewerDatabase.getDatabase(application).gradeDAO())

    private val allGrades: LiveData<List<GradeModel>> = repo.getAllGrades
    lateinit var gradesFromToday: LiveData<List<GradeModel>>

    init {
        allGrades.observeForever {}
    }

    var today = Calendar.getInstance().also {
        it.set(Calendar.HOUR_OF_DAY, 0)
        it.set(Calendar.MINUTE, 0)
        it.set(Calendar.SECOND, 0)
        it.set(Calendar.MILLISECOND, 0)
    }

    fun getGradesFromToday() {
        gradesFromToday = Transformations.map(allGrades) {
            it.filterNot { x ->
                x.date.before(today.time) } }
    }

}