package com.example.mogmax.util

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun getCurrentTime(): String {
    val sdf = SimpleDateFormat("h:mm", Locale.getDefault())
    return sdf.format(Date())
}