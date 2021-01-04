package com.example.courseviewer.viewModel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.courseviewer.R
import com.example.courseviewer.model.SubjectModel
import com.example.courseviewer.viewModel.ICallbackSubject
import kotlinx.android.synthetic.main.subject_list_one_row.view.*


class SubjectListAdapter(var subjectList: LiveData<List<SubjectModel>>, val subjectCallback: ICallbackSubject): RecyclerView.Adapter<SubjectListAdapter.SubjectHolder>() {

    inner class SubjectHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SubjectHolder {
        val view= LayoutInflater.from(parent.context)
            .inflate(R.layout.subject_list_one_row, parent, false)

        return SubjectHolder(view)
    }

    override fun onBindViewHolder(holder: SubjectHolder, position: Int) {
        var textViewTitle = holder.itemView.findViewById<TextView>(R.id.textViewTitle)
        var textViewDescription = holder.itemView.findViewById<TextView>(R.id.textViewDescription)

        textViewTitle.text = subjectList.value?.get(position)?.title
        textViewDescription.text = subjectList.value?.get(position)?.description

        holder.itemView.deleteButton.setOnClickListener {
            subjectCallback.clickDeleteSubject(subjectList.value!![position])
        }

        holder.itemView.editButton.setOnClickListener {
            subjectCallback.clickEditSubject(subjectList.value!![position])
        }

        holder.itemView.viewStudentsButton.setOnClickListener {
            subjectCallback.clickGoToStudents(subjectList.value!![position])
        }
    }

    override fun getItemCount(): Int {
        return subjectList.value?.size?:0
    }
}