package com.example.multiples

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Detail(val imgname : String, val imgtag : String, var strcount : Double) : Parcelable {
}
