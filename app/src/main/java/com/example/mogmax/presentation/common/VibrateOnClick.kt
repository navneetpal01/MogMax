package com.example.mogmax.presentation.common

import android.content.Context
import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator

fun vibrateOnClick(context : Context){
    val vibrator = context.getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
        vibrator.vibrate(VibrationEffect.createOneShot(50,VibrationEffect.DEFAULT_AMPLITUDE))
    }else{
        vibrator.vibrate(50)
    }
}