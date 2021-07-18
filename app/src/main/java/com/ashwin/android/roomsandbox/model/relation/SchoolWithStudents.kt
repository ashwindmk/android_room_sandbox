package com.ashwin.android.roomsandbox.model.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.ashwin.android.roomsandbox.model.NAME
import com.ashwin.android.roomsandbox.model.SCHOOL_NAME
import com.ashwin.android.roomsandbox.model.School
import com.ashwin.android.roomsandbox.model.Student

data class SchoolWithStudents(
    @Embedded val school: School,

    @Relation(
        parentColumn = NAME,
        entityColumn = SCHOOL_NAME
    )
    val students: List<Student>
)
