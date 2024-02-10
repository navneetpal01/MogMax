package com.example.mogmax.presentation.picture.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mogmax.R
import com.example.mogmax.presentation.common.MogMaxButton
import com.example.mogmax.ui.theme.AppTheme
import com.example.mogmax.ui.theme.interBold
import com.example.mogmax.ui.theme.vigaFont

@Composable
fun BottomBar(
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.system_gray_6))
    ) {
        Column(
            modifier = modifier
                .fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp, top = 10.dp),
                text = "STEP 1",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = vigaFont,
                maxLines = 1,
                overflow = TextOverflow.Ellipsis
            )
            Text(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, end = 5.dp, bottom = 5.dp),
                text = "Click a Picture,",
                style = TextStyle(
                    brush = Brush.linearGradient(
                        listOf(
                            colorResource(id = R.color.text_grad1),
                            colorResource(id = R.color.text_grad2),
                            colorResource(id = R.color.text_grad3),
                            colorResource(id = R.color.text_grad4)
                        )
                    )),
                fontFamily = interBold,
                fontSize = 30.sp,
                color = colorResource(id = R.color.white),
                maxLines = 1
            )
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(vertical = 20.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                MogMaxButton(
                    modifier = Modifier.padding(
                        start = 20.dp,
                        end = 20.dp,
                        top = 5.dp,
                        bottom = 5.dp
                    ),
                    onClick = {
                    },
                    text = "Upload Picture"
                )
                MogMaxButton(
                    modifier = Modifier.padding(
                        start = 20.dp,
                        end = 20.dp,
                        top = 5.dp,
                        bottom = 5.dp
                    ),
                    onClick = {
                    },
                    color = colorResource(id = R.color.system_gray_5),
                    text = "Continue"
                )
            }
        }
    }
}

@Preview
@Composable
fun PrevBottomBar() {
    BottomBar()
}