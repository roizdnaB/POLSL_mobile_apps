package com.example.courseviewer.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.courseviewer.R
import com.example.courseviewer.model.StudentModel
import com.example.courseviewer.viewModel.ICallbackStudent
import com.example.courseviewer.viewModel.StudentSubjectVM
import com.example.courseviewer.viewModel.StudentVM
import com.example.courseviewer.viewModel.SubjectVM
import com.example.courseviewer.viewModel.adapter.AddStudentToListAdapter
import com.example.courseviewer.viewModel.adapter.StudentListInSubjectAdapter
import kotlinx.android.synthetic.main.fragment_add_students_to_subject.*
import kotlinx.android.synthetic.main.fragment_main_students.*
import kotlinx.android.synthetic.main.fragment_main_students.recyclerViewStudents
import kotlinx.android.synthetic.main.fragment_main_students.view.*

class AddStudentsToSubjectFragment: Fragment(), ICallbackStudent {
    private lateinit var myAdapter: AddStudentToListAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView

    private lateinit var viewModelStudent: StudentVM
    private lateinit var viewModelSubject: SubjectVM
    private lateinit var viewModelStudentSubject: StudentSubjectVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_students_to_subject, container, false)

        myLayoutManager = LinearLayoutManager(context)
        viewModelStudent = ViewModelProvider(requireActivity()).get(StudentVM::class.java)
        viewModelSubject = ViewModelProvider(requireActivity()).get(SubjectVM::class.java)
        viewModelStudentSubject = ViewModelProvider(requireActivity()).get(StudentSubjectVM::class.java)

        viewModelStudentSubject.currentSubject = viewModelSubject.currentSubject!!

        viewModelStudentSubject.getStudentsInSubject(viewModelSubject.currentSubject)
        viewModelStudentSubject.getStudentsOutSubject(viewModelSubject.currentSubject)

        viewModelStudentSubject.readStudentsInSubject.observeForever {  }
        viewModelStudentSubject.readStudentsOutSubject.observeForever {  }

        myAdapter = AddStudentToListAdapter(viewModelStudentSubject.readStudentsOutSubject, this)

        viewModelStudentSubject.readStudentsOutSubject.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()
        })

        var textViewTitle = view.findViewById<TextView>(R.id.TextViewTitle2)
        textViewTitle.setText(viewModelSubject.currentSubject!!.title)

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = recyclerViewStudents.apply {
            this.layoutManager = myLayoutManager
            this.adapter = myAdapter
        }
    }

    override fun clickAddStudent(studentModel: StudentModel) {
        viewModelStudentSubject.addStudentToSubject(studentModel, viewModelSubject.currentSubject)
        viewModelStudentSubject.readStudentsInSubject.observeForever {  }
        viewModelStudentSubject.readStudentsOutSubject.observeForever {  }
    }

    override fun clickDeleteStudent(studentModel: StudentModel) {
        //Empty
    }

    override fun clickEditStudent(studentModel: StudentModel) {
        //Empty
    }

    override fun clickGradesOfStudent(studentModel: StudentModel) {
        //Empty
    }
}