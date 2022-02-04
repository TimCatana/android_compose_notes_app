package com.plcoding.cleanarchitecturenoteapp.feature_note.domail.use_cases

import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.repository.NoteRepository


class DeleteNoteUseCase(
    private val repository: NoteRepository
) {

    suspend fun execute(note: Note) {
        repository.deleteNote(note)
    }
}