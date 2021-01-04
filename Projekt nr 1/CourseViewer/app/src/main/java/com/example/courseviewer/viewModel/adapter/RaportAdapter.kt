package com.example.courseviewer.viewModel.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.courseviewer.R
import com.example.courseviewer.model.GradeModel
import com.example.courseviewer.viewModel.StudentVM
import com.example.courseviewer.viewModel.SubjectVM
import java.text.SimpleDateFormat

class RaportAdapter(
    var gradeList: LiveData<List<GradeModel>>,
    var viewModelStudent: StudentVM,
    var viewModelSubject: SubjectVM): RecyclerView.Adapter<RaportAdapter.RaportHolder>() {

    inner class RaportHolder(view: View): RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RaportHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.raport_list_one_row, parent, false);

        return RaportHolder(view)
    }

    override fun onBindViewHolder(holder: RaportHolder, position: Int) {
        var textViewLastName = holder.itemView.findViewById<TextView>(R.id.textViewLastName)
        var textViewTitle = holder.itemView.findViewById<TextView>(R.id.textViewTitle)
        var textViewGrade = holder.itemView.findViewById<TextView>(R.id.textViewGrade)
        var textViewDescription = holder.itemView.findViewById<TextView>(R.id.textViewDescription)
        var textViewDate = holder.itemView.findViewById<TextView>(R.id.textViewDate)

        textViewLastName.text = viewModelStudent.getAllStudents.value?.find { it.idStudent == gradeList.value?.get(position)?.idGStudent }?.lastName
        textViewTitle.text =  viewModelSubject.getAllSubjects.value?.find { it.idSubject == gradeList.value?.get(position)?.idGSubject }?.title
        textViewGrade.text = gradeList.value?.get(position)?.grade.toString()
        textViewDescription.text = gradeList.value?.get(position)?.description

        val pattern = "yyyy-MM-dd HH:mm:ss"
        val simpleDateFormat = SimpleDateFormat(pattern)
        textViewDate.text = simpleDateFormat.format(gradeList.value?.get(position)?.date)
    }

    override fun getItemCount(): Int {
        return gradeList.value?.size?:0
    }

}