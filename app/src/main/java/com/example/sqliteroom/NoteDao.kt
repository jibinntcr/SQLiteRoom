package com.example.sqliteroom

import androidx.room.*

/**
 * @Dao: This annotation tells Room that this interface is responsible
 * for defining database operations (CRUD).
 */
@Dao
interface NoteDao {

    /**
     * @Insert: Room handles all the 'INSERT INTO' logic automatically.
     * We use 'suspend' so these operations run on a background thread.
     */
    @Insert
    suspend fun insertNote(note: Note)

    /**
     * @Query: Allows you to write custom SQL. Room verifies this string
     * at compile-time to ensure it is correct.
     */
    @Query("SELECT * FROM notes")
    suspend fun getAllNotes(): List<Note>

    /**
     * @Delete: Removes a specific note record from the database.
     */
    @Delete
    suspend fun deleteNote(note: Note)

    /**
     * @Update: Updates an existing note in the database.
     */
    @Update
    suspend fun updateNote(note: Note)
}