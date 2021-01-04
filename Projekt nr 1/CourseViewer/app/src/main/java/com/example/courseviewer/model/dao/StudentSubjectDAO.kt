package com.example.courseviewer.model.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.courseviewer.model.StudentModel
import com.example.courseviewer.model.StudentSubjectModel

@Dao
interface StudentSubjectDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun createStudentSubject(studentSubjectModel: StudentSubjectModel)

    @Delete
    suspend fun deleteStudentSubject(studentSubjectModel: StudentSubjectModel)

    @Query("DELETE FROM student_subject_table WHERE (idStudentS = :studentId AND idSubjectS = :subjectId)")
    suspend fun deleteStudentSubjectByTheirIds(studentId: Int, subjectId: Int)

    @Query("SELECT * FROM studentTable WHERE idStudent IN (SELECT idStudentS FROM student_subject_table WHERE idSubjectS = :idSubject)")
    fun readStudentsInSubject(idSubject: Int): LiveData<List<StudentModel>>

    @Query("SELECT * FROM studentTable WHERE idStudent NOT IN (SELECT idStudentS FROM student_subject_table WHERE idSubjectS = :idSubject)")
    fun readStudentsOutSubject(idSubject: Int): LiveData<List<StudentModel>>

    @Query("SELECT * FROM student_subject_table WHERE (idSubjectS = :idSubject AND idStudentS = :idStudent)")
    fun readStudentSubjectObject(idSubject: Int, idStudent: Int ): StudentSubjectModel
}