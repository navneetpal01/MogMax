package com.example.mogmax.presentation.common

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.mogmax.R
import com.example.mogmax.ui.theme.AppTheme


@Composable
fun MogMaxButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    color : Color = colorResource(id = R.color.button_green),
    text : String,
) {
    Surface(
        modifier = modifier
            .height(AppTheme.getMogMaxDimens.fiftyDp)
            .fillMaxWidth()
            .clip(RoundedCornerShape(CornerSize(AppTheme.getMogMaxDimens.fifteenDp)))
            .clickable {
                onClick()
            },
        shape = RoundedCornerShape(CornerSize(AppTheme.getMogMaxDimens.fifteenDp)),
        color = color
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = text,
                fontSize = AppTheme.getMogMaxDimens.fifteenSp,
                color = colorResource(id = R.color.black),
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Preview
@Composable
fun GreenButtonPrev() {

}