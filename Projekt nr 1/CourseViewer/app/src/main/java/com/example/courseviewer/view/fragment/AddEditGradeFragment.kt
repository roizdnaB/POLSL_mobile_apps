package com.example.courseviewer.view.fragment

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.courseviewer.R
import com.example.courseviewer.model.GradeModel
import com.example.courseviewer.model.StudentModel
import com.example.courseviewer.viewModel.GradeVM
import com.example.courseviewer.viewModel.StudentSubjectVM
import com.example.courseviewer.viewModel.StudentVM
import kotlinx.android.synthetic.main.fragment_add_edit_grade.*
import kotlinx.android.synthetic.main.fragment_add_edit_grade.view.*
import kotlinx.android.synthetic.main.fragment_add_edit_student.*
import kotlinx.android.synthetic.main.fragment_add_edit_student.view.*

class AddEditGradeFragment: Fragment() {
    private lateinit var viewModelGrade: GradeVM

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_add_edit_grade, container, false)
        viewModelGrade = ViewModelProvider(requireActivity()).get(GradeVM::class.java)
        viewModelGrade.currentStudentSubject = ViewModelProvider(requireActivity()).get(StudentSubjectVM::class.java)

        if (viewModelGrade.currentGrade != null) {
            view.descriptionField.setText(viewModelGrade.currentGrade!!.description)
            view.gradeField.setText(viewModelGrade.currentGrade!!.grade.toString())
            view.addGradeButton.isEnabled = false
            view.editGradeButton.isEnabled = true
        }
        else {
            view.descriptionField.setText("")
            view.gradeField.setText("")
            view.addGradeButton.isEnabled = true
            view.editGradeButton.isEnabled = false
        }

        view.addGradeButton.setOnClickListener { addGrade() }
        view.editGradeButton.setOnClickListener { editGrade() }

        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    private fun addGrade() {
        if (dataValidation(descriptionField.text.toString(), gradeField.text.toString())) {
            val descrption = descriptionField.text.toString()
            val grade = gradeField.text.toString().toLong()

            val gradeModel = GradeModel(
                idGStudent = viewModelGrade.currentStudentSubject!!.currentStudent!!.idStudent,
                idGSubject = viewModelGrade.currentStudentSubject!!.currentSubject!!.idSubject,
                description = descrption,
                grade = grade,
                date = java.util.Calendar.getInstance().time
            )

            viewModelGrade.addGrade(gradeModel)

            descriptionField.setText("")
            gradeField.setText("")
            viewModelGrade.currentGrade = null

            Toast.makeText(requireContext(), "Added", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(requireContext(), "Error!", Toast.LENGTH_LONG).show()
    }

    private fun editGrade() {
        if (dataValidation(descriptionField.text.toString(), gradeField.text.toString())) {
            val descrption = descriptionField.text.toString()
            val grade = gradeField.text.toString().toLong()

            viewModelGrade.currentGrade!!.description = descrption
            viewModelGrade.currentGrade!!.grade = grade
            viewModelGrade.updateCurrentGrade()
            viewModelGrade.currentGrade = null

            Toast.makeText(requireContext(), "Updated", Toast.LENGTH_LONG).show()
        }
        else
            Toast.makeText(requireContext(), "Error!", Toast.LENGTH_LONG).show()
    }

    private fun dataValidation(descrption: String, grade: String): Boolean {
        if (TextUtils.isEmpty(descrption) || TextUtils.isEmpty(grade))
            return false
        return true
    }
}