package com.example.courseviewer.view.fragment

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.courseviewer.R
import com.example.courseviewer.model.SubjectModel
import com.example.courseviewer.viewModel.SubjectVM
import kotlinx.android.synthetic.main.fragment_add_edit_subject.*
import kotlinx.android.synthetic.main.fragment_add_edit_subject.view.*

class AddEditSubjectFragment: Fragment() {
    private lateinit var viewModel: SubjectVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_edit_subject, container, false)
        viewModel = ViewModelProvider(requireActivity()).get(SubjectVM::class.java)

        if (viewModel.currentSubject  != null) {
            view.titleField.setText(viewModel.currentSubject!!.title)
            view.descriptionField.setText(viewModel.currentSubject!!.description)
            view.addSubjectButton.isEnabled = false
            view.editSubjectButton.isEnabled = true
        }
        else {
            view.titleField.setText("")
            view.descriptionField.setText("")
            view.addSubjectButton.isEnabled = true
            view.editSubjectButton.isEnabled = false
        }

        view.addSubjectButton.setOnClickListener { addSubject() }
        view.editSubjectButton.setOnClickListener { editSubject() }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun addSubject() {
        if (dataValidation(titleField.text.toString(), descriptionField.text.toString())) {
            val title = titleField.text.toString()
            val description = descriptionField.text.toString()

            val subject = SubjectModel(title = title, description = description)
            viewModel.addSubject(subject)

            titleField.setText("")
            descriptionField.setText("")
            viewModel.currentSubject = null

            Toast.makeText(requireContext(), "Added", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(requireContext(), "Error!", Toast.LENGTH_LONG).show()
    }

    private fun editSubject() {
        if (dataValidation(titleField.text.toString(), descriptionField.text.toString())) {
            viewModel.currentSubject!!.title = titleField.text.toString()
            viewModel.currentSubject!!.description = descriptionField.text.toString()
            viewModel.updateCurrentSubject()
            viewModel.currentSubject = null

            Toast.makeText(requireContext(), "Updated", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(requireContext(), "Error!", Toast.LENGTH_LONG).show()
    }

    private fun dataValidation(title: String, description: String): Boolean {
        if (TextUtils.isEmpty(title) || TextUtils.isEmpty(description))
            return false
        return true
    }
}