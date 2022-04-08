package com.example.zakataceh.db

import android.provider.BaseColumns

internal class DatabaseContract {
    internal class NoteColumns: BaseColumns {
        companion object {
            const val TABLE_NAME = "note"
            const val _ID = "_id"
            const val NAMA = "nama"
            const val ALAMAT = "alamat"
        }
    }
}