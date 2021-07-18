package com.ashwin.android.roomsandbox.data

import androidx.room.*
import com.ashwin.android.roomsandbox.model.*
import com.ashwin.android.roomsandbox.model.relation.*

@Dao
interface SchoolDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSchool(school: School)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertDirector(director: Director)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudent(student: Student)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertSubject(subject: Subject)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertStudentSubjectCrossRef(crossRef: StudentSubjectCrossRef)

    // Get director with the given school name
    @Transaction
    @Query("SELECT * FROM $SCHOOL_TABLE WHERE $NAME = :schoolName")
    suspend fun getDirectorWithSchool(schoolName: String): List<SchoolAndDirector>

    // Get all students in a school
    @Transaction
    @Query("SELECT * FROM $SCHOOL_TABLE WHERE $NAME = :schoolName")
    suspend fun getStudentsWithSchool(schoolName: String): List<SchoolWithStudents>

    // Get all subjects for a specific student
    @Transaction
    @Query("SELECT * FROM $STUDENT_TABLE WHERE $NAME = :studentName")
    suspend fun getSubjectsWithStudent(studentName: String): List<StudentWithSubjects>

    // Get all students with a specific subject
    @Transaction
    @Query("SELECT * FROM $SUBJECT_TABLE WHERE $NAME = :subjectName")
    suspend fun getStudentsWithSubject(subjectName: String): List<SubjectWithStudents>
}
