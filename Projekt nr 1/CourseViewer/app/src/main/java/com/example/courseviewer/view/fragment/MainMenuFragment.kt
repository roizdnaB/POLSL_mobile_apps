package com.example.courseviewer.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import com.example.courseviewer.R
import com.example.courseviewer.viewModel.GradeVM
import com.example.courseviewer.viewModel.StudentVM
import com.example.courseviewer.viewModel.SubjectVM
import kotlinx.android.synthetic.main.fragment_main_menu.view.*

class MainMenuFragment: Fragment() {

    private lateinit var viewModelStudent: StudentVM
    private lateinit var viewModelSubject: SubjectVM
    private lateinit var viewModelGrade: GradeVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main_menu, container, false)

        viewModelStudent = ViewModelProvider(requireActivity()).get(StudentVM::class.java)
        viewModelStudent.getAllStudents.observeForever {  }

        viewModelSubject = ViewModelProvider(requireActivity()).get(SubjectVM::class.java)
        viewModelSubject.getAllSubjects.observeForever {  }

        viewModelGrade = ViewModelProvider(requireActivity()).get(GradeVM::class.java)
        viewModelGrade.getAllGrades.observeForever {  }

        view.goToStudentsButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_MainMenuFragment_to_MainStudentsFragment) }

        view.goToSubjectsButton.setOnClickListener {
            view.findNavController().navigate(R.id.action_MainMenuFragment_to_MainSubjectsFragment) }

        view.goToRaport.setOnClickListener {
            view.findNavController().navigate(R.id.action_MainMenuFragment_to_RaportFragment) }

        return view
    }
    
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}