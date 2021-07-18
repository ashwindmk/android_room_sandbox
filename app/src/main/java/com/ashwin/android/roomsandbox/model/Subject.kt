package com.ashwin.android.roomsandbox.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = SUBJECT_TABLE)
data class Subject(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = NAME)
    val name: String
)
