package com.example.courseviewer.viewModel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.courseviewer.R
import com.example.courseviewer.model.GradeModel
import com.example.courseviewer.viewModel.ICallbackGrade
import kotlinx.android.synthetic.main.grade_list_one_row.view.*

class GradeListAdapter(var gradeList: LiveData<List<GradeModel>>, val gradeCallback: ICallbackGrade):
    RecyclerView.Adapter<GradeListAdapter.GradeHolder>() {

    inner class GradeHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GradeHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.grade_list_one_row, parent, false)

        return GradeHolder(view)
    }

    override fun onBindViewHolder(holder: GradeHolder, position: Int) {
        var textViewDescription = holder.itemView.findViewById<TextView>(R.id.textViewDescription)
        var textViewGrade = holder.itemView.findViewById<TextView>(R.id.textViewGrade)
        var textViewDate = holder.itemView.findViewById<TextView>(R.id.textViewDate)

        textViewDescription.text = gradeList.value?.get(position)?.description
        textViewGrade.text = gradeList.value?.get(position)?.grade.toString()
        textViewDate.text = gradeList.value?.get(position)?.date.toString()

        holder.itemView.deleteButton.setOnClickListener {
            gradeCallback.clickDeleteGrade(gradeList.value!![position])
        }

        holder.itemView.editButton.setOnClickListener {
            gradeCallback.clickEditGrade(gradeList.value!![position])
        }
    }

    override fun getItemCount(): Int {
        return gradeList.value?.size?:0
    }
}