package com.example.zakataceh.helper

import android.database.Cursor
import com.example.zakataceh.db.DatabaseContract
import com.example.zakataceh.entity.Note

object MappingHelper {

    fun mapCursorToArrayList(notesCursor: Cursor?): ArrayList<Note> {
        val notesList = ArrayList<Note>()
        notesCursor?.apply {
            while (moveToNext()) {
                val id = getInt(getColumnIndexOrThrow(DatabaseContract.NoteColumns._ID))
                val nama = getString(getColumnIndexOrThrow(DatabaseContract.NoteColumns.NAMA))
                val alamat = getString(getColumnIndexOrThrow(DatabaseContract.NoteColumns.ALAMAT))
                notesList.add(Note(id, nama, alamat))
            }
        }
        return notesList
    }
}