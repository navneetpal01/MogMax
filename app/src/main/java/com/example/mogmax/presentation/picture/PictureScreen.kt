package com.example.mogmax.presentation.picture

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.mogmax.R
import com.example.mogmax.presentation.picture.components.BottomBar

@Composable
fun PictureScreen(
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
        Column(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            brush = Brush.linearGradient(
                                listOf(
                                    colorResource(id = R.color.text_grad1),
                                    colorResource(id = R.color.text_grad2),
                                    colorResource(id = R.color.text_grad3),
                                    colorResource(id = R.color.text_grad4)
                                )
                            )
                        )
                    ){
                        append(text = "")
                    }
                }
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth(),
                text = "Results",
                style = TextStyle(
                    brush = Brush.linearGradient(
                        listOf(
                            colorResource(id = R.color.text_grad1),
                            colorResource(id = R.color.text_grad2),
                            colorResource(id = R.color.text_grad3),
                            colorResource(id = R.color.text_grad4)
                        )
                    ),
                    fontSize = 40.sp
                ),
            )
        }
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomEnd)
                .background(color = colorResource(id = R.color.system_gray_6)),
        ) {
            BottomBar()
        }
    }
}

@Preview
@Composable
fun IntroScreenPrev() {

}