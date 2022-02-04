package com.plcoding.cleanarchitecturenoteapp.feature_note.domail.use_cases

import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.repository.NoteRepository

class GetNoteUseCase(
    private val repository: NoteRepository
) {

    suspend fun execute(id: Int): Note? {
        return repository.getNoteById(id)
    }
}