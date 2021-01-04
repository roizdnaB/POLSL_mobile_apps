package com.example.courseviewer.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.courseviewer.R
import com.example.courseviewer.model.StudentModel
import com.example.courseviewer.viewModel.GradeVM
import com.example.courseviewer.viewModel.ICallbackStudent
import com.example.courseviewer.viewModel.StudentVM
import com.example.courseviewer.viewModel.adapter.StudentListAdapter
import kotlinx.android.synthetic.main.fragment_main_menu.view.*
import kotlinx.android.synthetic.main.fragment_main_students.*
import kotlinx.android.synthetic.main.fragment_main_students.view.*

class MainStudentsFragment: Fragment(), ICallbackStudent {
    private lateinit var myAdapter: StudentListAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: StudentVM
    private lateinit var viewModelGrade: GradeVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main_students, container, false)
        myLayoutManager = LinearLayoutManager(context)
        viewModel = ViewModelProvider(requireActivity()).get(StudentVM::class.java)
        viewModelGrade = ViewModelProvider(requireActivity()).get(GradeVM::class.java)

        myAdapter = StudentListAdapter(viewModel.getAllStudents, this)

        viewModel.getAllStudents.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()
        })

        view.addStudentButton.setOnClickListener {
            viewModel.currentStudent = null
            view.findNavController().navigate(R.id.action_MainStudentsFragment_to_AddEditStudentFragment) }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = recyclerViewStudents.apply {
            this.layoutManager = myLayoutManager
            this.adapter = myAdapter
        }
    }

    override fun clickDeleteStudent(studentModel: StudentModel) {
        viewModel.currentStudent = studentModel

        viewModelGrade.getAllStudentGrades(viewModel.currentStudent!!.idStudent)
        viewModelGrade.listAllStudentGrades.value?.forEach {
                viewModelGrade.currentGrade = it
                viewModelGrade.deleteCurrentGrade()
        }

        viewModel.deleteCurrentStudent()
    }

    override fun clickEditStudent(studentModel: StudentModel) {
        viewModel.currentStudent = studentModel
        findNavController().navigate(R.id.action_MainStudentsFragment_to_AddEditStudentFragment)
    }

    override fun clickAddStudent(studentModel: StudentModel) {

    }

    override fun clickGradesOfStudent(studentModel: StudentModel) {
        viewModel.currentStudent = studentModel
        findNavController().navigate(R.id.action_MainStudentsFragment_to_AllGradesFragment)
    }
}