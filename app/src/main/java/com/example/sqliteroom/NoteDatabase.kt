package com.example.sqliteroom

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * @Database: Defines the configuration for the database.
 * We specify the 'Note' entity and set the version to 1.
 */
@Database(entities = [Note::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {

    /**
     * This function allows the app to access the DAO (Data Access Object),
     * which contains the actual logic for saving and reading notes.
     */
    abstract fun noteDao(): NoteDao
}