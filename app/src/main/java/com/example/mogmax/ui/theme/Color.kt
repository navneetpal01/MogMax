package com.example.mogmax.ui.theme

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.example.mogmax.R

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val ColumnGrad = Brush.verticalGradient(
    colors = listOf(
        Color.Transparent,
        Color.Black,
        Color.Black,
        Color.Black,
        Color.Black
    ),
    startY = 0.0f,
    endY = Float.POSITIVE_INFINITY
)