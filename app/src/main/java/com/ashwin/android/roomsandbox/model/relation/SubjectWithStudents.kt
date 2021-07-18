package com.ashwin.android.roomsandbox.model.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.ashwin.android.roomsandbox.model.*

data class SubjectWithStudents(
    @Embedded val subject: Subject,

    @Relation(
        parentColumn = NAME,  // subject.name, parent is the embedded class
        entityColumn = NAME,  // student.name, entity is the field-type.
        entity = Student::class,  // optional, required only if the entity is different than the field-type.
        associateBy = Junction(
            value = StudentSubjectCrossRef::class,
            parentColumn = SUBJECT_NAME,  // parent-column in cross-ref
            entityColumn = STUDENT_NAME  // entity-column in cross-ref
        )
    )
    val students: List<Student>
)
