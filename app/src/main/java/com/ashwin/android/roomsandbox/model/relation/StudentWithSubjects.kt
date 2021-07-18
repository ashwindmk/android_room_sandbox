package com.ashwin.android.roomsandbox.model.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.ashwin.android.roomsandbox.model.*

data class StudentWithSubjects(
    @Embedded val student: Student,

    @Relation(
        parentColumn = NAME,
        entityColumn = NAME,
        associateBy = Junction(
            value = StudentSubjectCrossRef::class,
            parentColumn = STUDENT_NAME,
            entityColumn = SUBJECT_NAME)
    )
    val subjects: List<Subject>
)
