package com.ashwin.android.roomsandbox.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = DIRECTOR_TABLE)
data class Director(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = NAME)
    val name: String,

    @ColumnInfo(name = SCHOOL_NAME)
    val schoolName: String
)
