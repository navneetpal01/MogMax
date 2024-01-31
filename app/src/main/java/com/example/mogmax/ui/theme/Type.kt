package com.example.mogmax.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.mogmax.R

val vigaFont = FontFamily(Font(R.font.viga_regular))
val segoeFont = FontFamily(Font(R.font.segoe_ui))
val interBold = FontFamily(Font(R.font.inter_bold))
val interExtraBold = FontFamily(Font(R.font.inter_extrabold))

val typographySmall = Typography(
    displayLarge = TextStyle(
        fontFamily = vigaFont,
        fontWeight = FontWeight.Normal,
        fontSize = 28.sp,

    ),
    displayMedium = TextStyle(
        fontFamily = interBold,
        fontWeight = FontWeight.Normal,
        fontSize = 25.sp
    ),
    displaySmall = TextStyle(
        fontFamily = segoeFont,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),

)

val typographyCompact = Typography(
    displayLarge = TextStyle(
        fontFamily = vigaFont,
        fontWeight = FontWeight.Normal,
        fontSize = 30.sp
    ),
    displayMedium = TextStyle(
        fontFamily = interBold,
        fontWeight = FontWeight.Normal,
        fontSize = 27.sp
    ),
    displaySmall = TextStyle(
        fontFamily = segoeFont,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    )


)

val typographyMedium = Typography(
    displayLarge = TextStyle(
        fontFamily = vigaFont,
        fontWeight = FontWeight.Normal,
        fontSize = 34.sp
    ),
    displayMedium = TextStyle(
        fontFamily = interBold,
        fontWeight = FontWeight.Normal,
        fontSize = 31.sp
    ),
    displaySmall = TextStyle(
        fontFamily = segoeFont,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp

    )

)

val typographyBig = Typography(
    displayLarge = TextStyle(
        fontFamily = vigaFont,
        fontWeight = FontWeight.Normal,
        fontSize = 42.sp
    ),
    displayMedium = TextStyle(
        fontFamily = interBold,
        fontWeight = FontWeight.Normal,
        fontSize = 39.sp
    ),
    displaySmall = TextStyle(
        fontFamily = segoeFont,
        fontWeight = FontWeight.Normal,
        fontSize = 26.sp
    )

)