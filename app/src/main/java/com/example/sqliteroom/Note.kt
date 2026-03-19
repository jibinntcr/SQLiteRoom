package com.example.sqliteroom

import androidx.room.Entity
import androidx.room.PrimaryKey

/**
 * @Entity: This annotation marks the class as a database table.
 * We set 'tableName' to "notes" so Room knows exactly what to call it.
 */
@Entity(tableName = "notes")
data class Note(
    /**
     * @PrimaryKey: Every table needs a unique ID to identify records.
     * 'autoGenerate = true' tells Room to handle the numbering (1, 2, 3...) for us.
     */
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    // These properties automatically become columns in the table.
    val title: String,
    val content: String,
    val createdDate: String
)