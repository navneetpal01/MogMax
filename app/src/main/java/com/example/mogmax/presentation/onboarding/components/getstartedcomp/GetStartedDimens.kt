package com.example.mogmax.presentation.onboarding.components.getstartedcomp

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

data class GetStartedDimens(
    val welcomeTextSize : TextUnit,
    val mogMaxTextSize : TextUnit,
    val descriptionTextSize : TextUnit,
    val continueButtonTextSize : TextUnit,
    val copyrightTextSize : TextUnit,
    val bothTextPadding : Dp,
    val cardCornerSize : Dp,
    val buttonCornerSize : Dp
)

val smallGetStartedDimens = GetStartedDimens(
    welcomeTextSize = 20.sp,
    mogMaxTextSize = 25.sp,
    descriptionTextSize = 10.sp,
    continueButtonTextSize = 15.sp,
    copyrightTextSize = 8.sp,
    bothTextPadding = 10.dp,
    cardCornerSize = 40.dp,
    buttonCornerSize = 15.dp
)
//Main
val compactGetStartedDimens = GetStartedDimens(
    welcomeTextSize = 30.sp,
    mogMaxTextSize = 40.sp,
    descriptionTextSize = 15.sp,
    continueButtonTextSize = 16.sp,
    copyrightTextSize = 10.sp,
    bothTextPadding = 10.dp,
    cardCornerSize = 40.dp,
    buttonCornerSize = 15.dp
)

val mediumGetStartedDimens = GetStartedDimens(
    welcomeTextSize = 20.sp,
    mogMaxTextSize = 25.sp,
    descriptionTextSize = 10.sp,
    continueButtonTextSize = 15.sp,
    copyrightTextSize = 8.sp,
    bothTextPadding = 10.dp,
    cardCornerSize = 40.dp,
    buttonCornerSize = 15.dp
)
val bigGetStartedDimes = GetStartedDimens(
    welcomeTextSize = 20.sp,
    mogMaxTextSize = 25.sp,
    descriptionTextSize = 10.sp,
    continueButtonTextSize = 15.sp,
    copyrightTextSize = 8.sp,
    bothTextPadding = 10.dp,
    cardCornerSize = 40.dp,
    buttonCornerSize = 15.dp
)

/* Testing Cleared
1- 320 -> 360
2- 361 -> 400

 */



