package com.example.mogmax.presentation.Intro

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mogmax.R
import com.example.mogmax.presentation.Intro.components.ScrollButton

@Composable
fun IntroScreen(
    onBackClick: () -> Unit
) {
    var isVisible by remember { mutableStateOf(false) }
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

        ScrollButton(){
            isVisible = true
        }
        if (isVisible){
            Text(text = "Moderfucker", fontSize = 20.sp, color = Color.White)
        }
    }
}

@Preview
@Composable
fun IntroScreenPrev() {

}