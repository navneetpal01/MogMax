package com.example.mogmax.presentation.getstarted.components

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import com.example.mogmax.R
import com.example.mogmax.ui.theme.AppTheme


@Composable
fun ContinueButton(
    modifier: Modifier = Modifier,
    onClick: () -> Unit
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
        border = BorderStroke(width = AppTheme.getMogMaxDimens.oneDp, color = colorResource(id = R.color.black)),
        color = colorResource(id = R.color.button_green)
    ) {
        Column(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Continue",
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