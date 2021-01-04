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
import androidx.lifecycle.viewModelScope
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.courseviewer.R
import com.example.courseviewer.model.StudentModel
import com.example.courseviewer.model.StudentSubjectModel
import com.example.courseviewer.viewModel.*
import com.example.courseviewer.viewModel.adapter.StudentListAdapter
import com.example.courseviewer.viewModel.adapter.StudentListInSubjectAdapter
import kotlinx.android.synthetic.main.fragment_main_students.*
import kotlinx.android.synthetic.main.fragment_main_students.recyclerViewStudents
import kotlinx.android.synthetic.main.fragment_main_students.view.*
import kotlinx.android.synthetic.main.fragment_main_students.view.addStudentButton
import kotlinx.android.synthetic.main.fragment_students_in_subject.*
import kotlinx.android.synthetic.main.fragment_students_in_subject.view.*
import javax.security.auth.Subject

class StudentsInSubjectFragment: Fragment(), ICallbackStudent {
    private lateinit var myAdapter: StudentListInSubjectAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView

    private lateinit var viewModelStudent: StudentVM
    private lateinit var viewModelSubject: SubjectVM
    private lateinit var viewModelStudentSubject: StudentSubjectVM
    private lateinit var viewModelGrade: GradeVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_students_in_subject, container, false)

        myLayoutManager = LinearLayoutManager(context)
        viewModelStudent = ViewModelProvider(requireActivity()).get(StudentVM::class.java)
        viewModelSubject = ViewModelProvider(requireActivity()).get(SubjectVM::class.java)
        viewModelStudentSubject = ViewModelProvider(requireActivity()).get(StudentSubjectVM::class.java)
        viewModelGrade = ViewModelProvider(requireActivity()).get(GradeVM::class.java)

        viewModelStudentSubject.currentSubject = viewModelSubject.currentSubject!!

        viewModelStudentSubject.getStudentsInSubject(viewModelSubject.currentSubject)
        viewModelStudentSubject.getStudentsOutSubject(viewModelSubject.currentSubject)

        viewModelStudentSubject.readStudentsInSubject.observeForever {  }
        viewModelStudentSubject.readStudentsOutSubject.observeForever {  }

        myAdapter = StudentListInSubjectAdapter(viewModelStudentSubject.readStudentsInSubject, this)

        viewModelStudentSubject.readStudentsInSubject.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()
        })

        var textViewTitle = view.findViewById<TextView>(R.id.TextViewTitle)
        textViewTitle.setText(viewModelSubject.currentSubject!!.title)

        view.addStudentButton.setOnClickListener {
            findNavController().navigate(R.id.action_StudentsInSubjectFragment_to_AddStudentsToSubjectFragment)
        }

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
        viewModelStudentSubject.currentStudent = studentModel
        viewModelStudentSubject.getStudentSubjectObject(viewModelStudentSubject.currentSubject!!.idSubject, studentModel.idStudent)

        viewModelGrade.getStudentGrades(studentModel.idStudent, viewModelStudentSubject.currentSubject!!.idSubject)
        viewModelGrade.listStudentGrades.observe(viewLifecycleOwner, Observer {
            viewModelGrade.listStudentGrades.value?.forEach {
                viewModelGrade.currentGrade = it
                viewModelGrade.deleteCurrentGrade()
            }
        })

        viewModelStudentSubject.deleteStudentFromSubject()
        viewModelStudentSubject.currentStudent = null
    }

    override fun clickGradesOfStudent(studentModel: StudentModel) {
        viewModelStudentSubject.currentStudent = studentModel
        findNavController().navigate(R.id.action_StudentsInSubjectFragment_to_GradesFragment)
    }




    override fun clickEditStudent(studentModel: StudentModel) {
        //Empty
    }

    override fun clickAddStudent(studentModel: StudentModel) {
        //Empty
    }
}