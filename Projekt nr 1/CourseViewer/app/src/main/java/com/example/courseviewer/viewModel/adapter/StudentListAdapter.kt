package com.example.courseviewer.viewModel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.courseviewer.model.StudentModel
import com.example.courseviewer.R
import com.example.courseviewer.viewModel.ICallbackStudent
import kotlinx.android.synthetic.main.student_list_one_row.view.*

class StudentListAdapter(var studentList: LiveData<List<StudentModel>>, val studentCallback: ICallbackStudent):
    RecyclerView.Adapter<StudentListAdapter.StudentHolder>() {

    inner class StudentHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentHolder {
        val view=LayoutInflater.from(parent.context)
            .inflate(R.layout.student_list_one_row, parent, false)

        return StudentHolder(view)
    }

    override fun onBindViewHolder(holder: StudentHolder, position: Int) {
        var textViewFirstName = holder.itemView.findViewById<TextView>(R.id.textViewFirstName)
        var textViewLastName = holder.itemView.findViewById<TextView>(R.id.textViewLastName)

        textViewFirstName.text = studentList.value?.get(position)?.firstName
        textViewLastName.text = studentList.value?.get(position)?.lastName

        holder.itemView.deleteButton.setOnClickListener {
            studentCallback.clickDeleteStudent(studentList.value!![position])
        }

        holder.itemView.editButton.setOnClickListener {
            studentCallback.clickEditStudent(studentList.value!![position])
        }

        holder.itemView.viewGradesButton.setOnClickListener {
            studentCallback.clickGradesOfStudent(studentList.value!![position])
        }
    }

    override fun getItemCount(): Int {
        return studentList.value?.size?:0
    }
}