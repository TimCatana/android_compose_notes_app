package com.plcoding.cleanarchitecturenoteapp.feature_note.domail.use_cases

import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.model.InvalidNoteException
import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.repository.NoteRepository
import kotlin.jvm.Throws

class AddNoteUseCase(
    private val repository: NoteRepository
) {

    @Throws(InvalidNoteException::class)
    suspend fun execute(note: Note) {
        if(note.title.isBlank()) {
            throw InvalidNoteException("The title of the note can not be empty")
        }
        if(note.content.isBlank()) {
            throw InvalidNoteException("The content of the note can not be empty")
        }
        repository.insertNote(note)
    }
}