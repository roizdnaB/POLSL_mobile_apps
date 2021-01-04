package com.example.courseviewer.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
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
import com.example.courseviewer.viewModel.adapter.AllGradesListAdapter
import com.example.courseviewer.viewModel.adapter.GradeListAdapter
import kotlinx.android.synthetic.main.fragment_grades.*
import kotlinx.android.synthetic.main.fragment_grades.view.*

class AllGradesFragment: Fragment(), ICallbackGrade {

    private lateinit var myAdapter: AllGradesListAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModelGrade: GradeVM
    private lateinit var viewModelStudent: StudentVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_all_grades, container, false)

        myLayoutManager = LinearLayoutManager(context)

        viewModelGrade = ViewModelProvider(requireActivity()).get(GradeVM::class.java)
        viewModelStudent = ViewModelProvider(requireActivity()).get(StudentVM::class.java)

        viewModelGrade.getAllStudentGrades(viewModelStudent.currentStudent!!.idStudent)

        myAdapter = AllGradesListAdapter(viewModelGrade.listAllStudentGrades, this)

        var textViewFirstName = view.findViewById<TextView>(R.id.TextViewFirstName)
        textViewFirstName.setText(viewModelStudent.currentStudent!!.firstName + "'s")

        viewModelGrade.listAllStudentGrades.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()
        })

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
        //Empty
    }

    override fun clickEditGrade(gradeModel: GradeModel) {
        //Empty
    }

    override fun clickAddGrade(gradeModel: GradeModel) {
        //Empty
    }

}