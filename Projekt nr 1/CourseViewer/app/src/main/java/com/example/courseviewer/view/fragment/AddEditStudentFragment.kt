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
import com.example.courseviewer.model.StudentModel
import com.example.courseviewer.viewModel.StudentVM
import kotlinx.android.synthetic.main.fragment_add_edit_student.*
import kotlinx.android.synthetic.main.fragment_add_edit_student.view.*

class AddEditStudentFragment: Fragment() {
    private lateinit var viewModel: StudentVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_edit_student, container, false)
        viewModel = ViewModelProvider(requireActivity()).get(StudentVM::class.java)

        if (viewModel.currentStudent != null) {
            view.addStudentButton.isEnabled = false
            view.editStudentButton.isEnabled = true
            view.firstNameField.setText(viewModel.currentStudent!!.firstName)
            view.lastNameField.setText(viewModel.currentStudent!!.lastName)
        }
        else {
            view.firstNameField.setText("")
            view.lastNameField.setText("")
            view.addStudentButton.isEnabled = true
            view.editStudentButton.isEnabled = false
        }

        view.addStudentButton.setOnClickListener { addStudent() }
        view.editStudentButton.setOnClickListener { editStudent() }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun addStudent() {
        if (dataValidation(firstNameField.text.toString(), lastNameField.text.toString())) {
            val firstName = firstNameField.text.toString()
            val lastName = lastNameField.text.toString()

            val student = StudentModel(firstName = firstName, lastName = lastName)
            viewModel.addStudent(student)

            firstNameField.setText("")
            lastNameField.setText("")
            viewModel.currentStudent = null

            Toast.makeText(requireContext(), "Added", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(requireContext(), "Error!", Toast.LENGTH_LONG).show()
    }

    private fun editStudent() {
        if (dataValidation(firstNameField.text.toString(), lastNameField.text.toString())) {
            viewModel.currentStudent!!.firstName = firstNameField.text.toString()
            viewModel.currentStudent!!.lastName = lastNameField.text.toString()
            viewModel.updateCurrentStudent()
            viewModel.currentStudent = null

            Toast.makeText(requireContext(), "Updated", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(requireContext(), "Error!", Toast.LENGTH_LONG).show()
    }

    private fun dataValidation(firstName: String, lastName: String): Boolean {
        if (TextUtils.isEmpty(firstName) || TextUtils.isEmpty(lastName))
            return false
        return true
    }
}