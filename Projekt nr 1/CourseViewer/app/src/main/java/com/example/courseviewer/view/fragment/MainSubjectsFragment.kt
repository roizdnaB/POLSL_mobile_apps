package com.example.courseviewer.view.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.courseviewer.R
import com.example.courseviewer.model.SubjectModel
import com.example.courseviewer.viewModel.ICallbackSubject
import com.example.courseviewer.viewModel.SubjectVM
import com.example.courseviewer.viewModel.adapter.SubjectListAdapter
import kotlinx.android.synthetic.main.fragment_main_subjects.*
import kotlinx.android.synthetic.main.fragment_main_subjects.view.*

class MainSubjectsFragment: Fragment(), ICallbackSubject {
    private lateinit var myAdapter: SubjectListAdapter
    private lateinit var myLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var viewModel: SubjectVM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_main_subjects, container, false)
        myLayoutManager = LinearLayoutManager(context)
        viewModel = ViewModelProvider(requireActivity()).get(SubjectVM::class.java)
        myAdapter = SubjectListAdapter(viewModel.getAllSubjects, this)

        viewModel.getAllSubjects.observe(viewLifecycleOwner, Observer {
            myAdapter.notifyDataSetChanged()
        })

        view.addSubjectButton.setOnClickListener {
            viewModel.currentSubject = null
            view.findNavController().navigate(R.id.action_MainSubjectsFragment_to_AddEditSubjectFragment) }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = recyclerViewSubjects.apply {
            this.layoutManager = myLayoutManager
            this.adapter = myAdapter
        }
    }

    override fun clickDeleteSubject(subjectModel: SubjectModel) {
        viewModel.currentSubject = subjectModel
        viewModel.deleteCurrentSubject()
    }

    override fun clickEditSubject(subjectModel: SubjectModel) {
        viewModel.currentSubject = subjectModel
        findNavController().navigate(R.id.action_MainSubjectsFragment_to_AddEditSubjectFragment)
    }

    override fun clickGoToStudents(subjectModel: SubjectModel) {
        viewModel.currentSubject = subjectModel
        findNavController().navigate(R.id.action_MainSubjectsFragment_to_StudentsInSubjectFragment)
    }
}