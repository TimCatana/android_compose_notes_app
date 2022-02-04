package com.plcoding.cleanarchitecturenoteapp.feature_note.presentation.util

sealed class Screen(val route: String) {
    object NotesScreen: Screen("notesScreen")
    object AddEditNoteScreen: Screen("addEditNoteScreen")
}
