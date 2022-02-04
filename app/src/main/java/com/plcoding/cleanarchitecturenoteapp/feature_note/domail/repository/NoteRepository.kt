package com.plcoding.cleanarchitecturenoteapp.feature_note.domail.repository

import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.model.Note
import kotlinx.coroutines.flow.Flow

/**
 * Definitions belong in domain layer, implementations belong in data layer
 */
interface NoteRepository {

    fun getNotes(): Flow<List<Note>>
    suspend fun getNoteById(id: Int): Note?
    suspend fun insertNote(note: Note)
    suspend fun deleteNote(note: Note)
}