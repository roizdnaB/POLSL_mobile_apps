package com.example.courseviewer.view.fragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.courseviewer.R
import com.example.courseviewer.model.GradeModel
import com.example.courseviewer.viewModel.GradeVM
import com.example.courseviewer.viewModel.ICallbackGrade
import com.example.courseviewer.viewModel.StudentSubjectVM
import com.example.courseviewer.viewModel.StudentVM
import com.example.courseviewer.viewModel.adapter.GradeListAdapter
import com.example.courseviewer.viewModel.adapter.StudentListAdapter
import kotlinx.android.synthetic.main.fragment_grades.*
import kotlinx.android.synthetic.main.fragment_grades.view.*

class GradesFragment: Fragment(), ICallbackGrade {

    private lateinit var myAdapter: GradeListAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModelGrade: GradeVM
    private lateinit var viewModelStudentSubject: StudentSubjectVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_grades, container, false)

        viewModelGrade = ViewModelProvider(requireActivity()).get(GradeVM::class.java)
        viewModelGrade.currentStudentSubject = ViewModelProvider(requireActivity()).get(StudentSubjectVM::class.java)

        myLayoutManager = LinearLayoutManager(context)

        viewModelGrade.getStudentGrades(
            viewModelGrade.currentStudentSubject!!.currentStudent!!.idStudent,
            viewModelGrade.currentStudentSubject!!.currentSubject!!.idSubject)

        myAdapter = GradeListAdapter(viewModelGrade.listStudentGrades, this)

        viewModelGrade.listStudentGrades.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()

            var textViewStatus = view.textViewStatus

            if (viewModelGrade.listStudentGrades.value.isNullOrEmpty())
                textViewStatus.visibility = View.INVISIBLE
            else {
                val grades = viewModelGrade.listStudentGrades.value
                var avg: Float = 0f
                var failed: Boolean = false

                grades?.forEach {
                    if (it.grade < 3)
                        failed = true
                    avg += it.grade }

                avg /= grades!!.size

                if (avg >= 3 && !failed) {
                    textViewStatus.setText("PASSED")
                    textViewStatus.setTextColor(Color.parseColor("#43CA0D"))
                }
                else {
                    textViewStatus.setText("FAILED")
                    textViewStatus.setTextColor(Color.parseColor("#BE0423"))
                }
            }
        })

        var textViewTitle = view.textViewTitle3
        var textViewFirstName = view.textViewFirstName4

        textViewTitle.setText(viewModelGrade.currentStudentSubject!!.currentSubject!!.title)
        textViewFirstName.setText(viewModelGrade.currentStudentSubject!!.currentStudent!!.firstName + "'s")

        view.addGradeButton.setOnClickListener {
            viewModelGrade.currentGrade = null
            view.findNavController().navigate(R.id.action_GradesFragment_to_AddEditGradeFragment)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = recyclerViewGrades.apply {
            this.layoutManager = myLayoutManager
            this.adapter = myAdapter
        }
    }

    override fun clickDeleteGrade(gradeModel: GradeModel) {
        viewModelGrade.currentGrade = gradeModel
        viewModelGrade.deleteCurrentGrade()
    }

    override fun clickEditGrade(gradeModel: GradeModel) {
        viewModelGrade.currentGrade = gradeModel
        findNavController().navigate(R.id.action_GradesFragment_to_AddEditGradeFragment)
    }

    override fun clickAddGrade(gradeModel: GradeModel) {
        //Empty
    }
}