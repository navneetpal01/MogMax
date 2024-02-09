package com.example.mogmax.presentation.getstarted.components

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import com.example.mogmax.R
import com.example.mogmax.presentation.getstarted.components.ContinueButton
import com.example.mogmax.ui.theme.AppTheme
import com.example.mogmax.ui.theme.interBold
import com.example.mogmax.ui.theme.segoeFont


@Composable
fun OnBoardingCard(
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = AppTheme.getMogMaxDimens.tenDp, end = AppTheme.getMogMaxDimens.tenDp, bottom = AppTheme.getMogMaxDimens.fiveDp),
        shape = RoundedCornerShape(CornerSize(AppTheme.getMogMaxDimens.fortyDp)),
        tonalElevation = AppTheme.getMogMaxDimens.tenDp,
        color = colorResource(id = R.color.system_gray_6)
        ) {
        Column(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(CornerSize(AppTheme.getMogMaxDimens.fortyDp)))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = AppTheme.getMogMaxDimens.fortyDp, start = AppTheme.getMogMaxDimens.tenDp, end = AppTheme.getMogMaxDimens.tenDp, bottom = AppTheme.getMogMaxDimens.tenDp),
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = colorResource(id = R.color.white),
                                fontSize = AppTheme.getMogMaxDimens.thirtySp
                            )
                        ) {
                            append(text = "Welcome to,")
                        }
                        append("\n")
                        withStyle(
                            style = SpanStyle(
                                color = colorResource(id = R.color.text_green),
                                fontSize = AppTheme.getMogMaxDimens.fortySp,
                            )
                        ) {
                            append(text = "MogMax")
                        }
                    },
                    style = TextStyle(fontFamily = interBold),
                    color = colorResource(id = R.color.white),
                    overflow = TextOverflow.Ellipsis
                )
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                //    .background(Color.Green)
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(all = AppTheme.getMogMaxDimens.tenDp),
                    text = "Transform your face, one smile at a time. Unleash the power of facial fitness with our innovative exercise app, sculpting confidence and radiance through every expression." +
                            "Elevate your natural beauty – because a healthy smile is the ultimate workout!",
                    fontSize = AppTheme.getMogMaxDimens.fifteenSp,
                    style = TextStyle(fontFamily = segoeFont),
                    color = colorResource(id = R.color.grey_text),
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ContinueButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = AppTheme.getMogMaxDimens.twentyDp, vertical = AppTheme.getMogMaxDimens.twentyDp),
                    onClick = {
                        onClick()
                    }
                )
                Box(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        text = "@Copyright MogMax. All rights reserved.",
                        fontSize = AppTheme.getMogMaxDimens.tenSp,
                        textAlign = TextAlign.Center,
                        color = colorResource(id = R.color.white)
                    )
                }
            }
        }
    }
}