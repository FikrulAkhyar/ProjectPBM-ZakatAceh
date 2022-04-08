package com.example.zakataceh.entity
import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Note(
    var id: Int = 0,
    var nama: String? = null,
    var alamat: String? = null
): Parcelable