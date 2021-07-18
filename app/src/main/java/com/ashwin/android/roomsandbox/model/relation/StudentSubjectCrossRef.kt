package com.ashwin.android.roomsandbox.model.relation

import androidx.room.ColumnInfo
import androidx.room.Entity
import com.ashwin.android.roomsandbox.model.STUDENT_NAME
import com.ashwin.android.roomsandbox.model.SUBJECT_NAME

@Entity(primaryKeys = [STUDENT_NAME, SUBJECT_NAME])
data class StudentSubjectCrossRef(
    @ColumnInfo(name = STUDENT_NAME)
    val studentName: String,

    @ColumnInfo(name = SUBJECT_NAME)
    val subjectName: String
)
