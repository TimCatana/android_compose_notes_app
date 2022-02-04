package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.notes

import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.model.Note
import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.util.NoteOrder
import com.plcoding.cleanarchitecturenoteapp.feature_note.domail.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSelectionVisible: Boolean = false
)