package com.example.courseviewer.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.courseviewer.R
import com.example.courseviewer.model.GradeModel
import com.example.courseviewer.viewModel.*
import com.example.courseviewer.viewModel.adapter.AllGradesListAdapter
import com.example.courseviewer.viewModel.adapter.RaportAdapter
import kotlinx.android.synthetic.main.fragment_grades.*

class RaportFragment: Fragment(), ICallbackGrade {

    private lateinit var myAdapter: RaportAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: RaportVM
    private lateinit var viewModelStudent: StudentVM
    private lateinit var viewModelSubject: SubjectVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_raport, container, false)

        myLayoutManager = LinearLayoutManager(context)

        viewModel = ViewModelProvider(requireActivity()).get(RaportVM::class.java)
        viewModelStudent = ViewModelProvider(requireActivity()).get(StudentVM::class.java)
        viewModelSubject = ViewModelProvider(requireActivity()).get(SubjectVM::class.java)

        viewModel.getGradesFromToday()

        myAdapter = RaportAdapter(viewModel.gradesFromToday, viewModelStudent, viewModelSubject)

        viewModel.gradesFromToday.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()
            viewModelStudent.getAllStudents.observeForever {  }
            viewModelSubject.getAllSubjects.observeForever {  }
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





    override fun clickAddGrade(gradeModel: GradeModel) {
        //Empty
    }

    override fun clickDeleteGrade(gradeModel: GradeModel) {
        //Empty
    }

    override fun clickEditGrade(gradeModel: GradeModel) {
        //Empty
    }

}