package com.ashwin.android.roomsandbox.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = STUDENT_TABLE)
data class Student(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = NAME)
    val name: String,

    @ColumnInfo(name = SEMESTER)
    val semester: Int,

    @ColumnInfo(name = SCHOOL_NAME)
    val schoolName: String
)
