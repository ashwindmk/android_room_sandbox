package com.ashwin.android.roomsandbox.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = SCHOOL_TABLE)
data class School(
    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = NAME)
    val name: String
)
