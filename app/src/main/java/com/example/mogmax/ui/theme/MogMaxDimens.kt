package com.example.mogmax.ui.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mogmax.R
val vigaFont = FontFamily(Font(R.font.viga_regular))
val segoeFont = FontFamily(Font(R.font.segoe_ui))
val interBold = FontFamily(Font(R.font.inter_bold))

data class MogMaxDimens(
    val oneDp : Dp,
    val fiveDp : Dp,
    val tenDp : Dp,
    val twentyDp : Dp,
    val fortyDp : Dp,
    val fifteenDp : Dp,
    val fiftyDp : Dp,
    val ninetyDp : Dp,
    //SP Units
    val tenSp : TextUnit,
    val fifteenSp : TextUnit,
    val thirtySp : TextUnit,
    val fortySp : TextUnit
)

val smallMogMaxDimens = MogMaxDimens(
    oneDp = 1.dp,
    fiveDp = 5.dp,
    tenDp = 10.dp,
    fifteenDp = 15.dp,
    twentyDp = 20.dp,
    fortyDp = 40.dp,
    fiftyDp = 50.dp,
    ninetyDp = 90.dp,
    tenSp = 10.sp,
    fifteenSp = 15.sp,
    thirtySp = 30.sp,
    fortySp = 40.sp
)
//Main
val compactMogMaxDimens = MogMaxDimens(
    oneDp = 1.dp,
    fiveDp = 5.dp,
    tenDp = 10.dp,
    fifteenDp = 15.dp,
    twentyDp = 20.dp,
    fortyDp = 40.dp,
    fiftyDp = 50.dp,
    ninetyDp = 90.dp,
    tenSp = 10.sp,
    fifteenSp = 15.sp,
    thirtySp = 30.sp,
    fortySp = 40.sp
)

val mediumMogMaxDimens = MogMaxDimens(
    oneDp = 1.dp,
    fiveDp = 5.dp,
    tenDp = 10.dp,
    fifteenDp = 15.dp,
    twentyDp = 20.dp,
    fortyDp = 40.dp,
    fiftyDp = 50.dp,
    ninetyDp = 90.dp,
    tenSp = 10.sp,
    fifteenSp = 15.sp,
    thirtySp = 30.sp,
    fortySp = 40.sp
)
val bigMogMaxDimes = MogMaxDimens(
    oneDp = 1.dp,
    fiveDp = 5.dp,
    tenDp = 10.dp,
    fifteenDp = 15.dp,
    twentyDp = 20.dp,
    fortyDp = 40.dp,
    fiftyDp = 50.dp,
    ninetyDp = 90.dp,
    tenSp = 10.sp,
    fifteenSp = 15.sp,
    thirtySp = 30.sp,
    fortySp = 40.sp
)

//TODO::
/* Testing Cleared
1- <360
2- 361 -> 400
3- 401 -> 720

 */



