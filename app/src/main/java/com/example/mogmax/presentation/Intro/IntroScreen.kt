package com.example.mogmax.presentation.Intro

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.mogmax.R

@Composable
fun IntroScreen(
    onBackClick: () -> Unit
) {
    BackHandler {
        onBackClick()
    }
    Box(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.system_black))
            .statusBarsPadding()
            .navigationBarsPadding()
    ) {

    }
}

@Preview
@Composable
fun IntroScreenPrev() {

}