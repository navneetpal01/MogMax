package com.example.mogmax.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember

@Composable
fun ProvideAppUtils(
    mogMaxDimens : MogMaxDimens,
    orientation: Orientation,
    content: @Composable () -> Unit
) {
    val mogMaxDimens = remember {mogMaxDimens}
    val orientation = remember { orientation }
    CompositionLocalProvider(
        LocalOrientationMode provides orientation,
        LocalMogMaxDimens provides mogMaxDimens,
        content = content
    )

}

//which takes a lambda expression that returns the initial value of the local variable

val LocalOrientationMode = compositionLocalOf {
    Orientation.Portrait
}
val LocalMogMaxDimens = compositionLocalOf {
    smallMogMaxDimens
}