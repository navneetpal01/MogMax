package com.example.mogmax.presentation.onboarding.components.getstartedcomp

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import com.example.mogmax.R
import com.example.mogmax.ui.theme.AppTheme


@Composable
fun OnBoardingCard(
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
        shape = RoundedCornerShape(CornerSize(AppTheme.getStartedDimes.cardCornerSize)),
        tonalElevation = 10.dp,
        color = colorResource(id = R.color.system_gray_6),

        ) {
        Column(
            modifier = Modifier
                .clip(shape = RoundedCornerShape(CornerSize(AppTheme.getStartedDimes.cardCornerSize)))
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                //    .background(Color.Cyan)
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 40.dp, start = 10.dp, end = 10.dp, bottom = 10.dp),
                    text = buildAnnotatedString {
                        withStyle(
                            style = SpanStyle(
                                color = colorResource(id = R.color.white),
                                fontSize = AppTheme.getStartedDimes.welcomeTextSize
                            )
                        ) {
                            append(text = "Welcome to,")
                        }
                        append("\n")
                        withStyle(
                            style = SpanStyle(
                                color = colorResource(id = R.color.text_green),
                                fontSize = AppTheme.getStartedDimes.mogMaxTextSize,
                            )
                        ) {
                            append(text = "MogMax")
                        }
                    },
                    style = MaterialTheme.typography.displayMedium,
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
                        .padding(all = AppTheme.getStartedDimes.bothTextPadding),
                    text = "Transform your face, one smile at a time. Unleash the power of facial fitness with our innovative exercise app, sculpting confidence and radiance through every expression." +
                            "Elevate your natural beauty – because a healthy smile is the ultimate workout!",
                    style = MaterialTheme.typography.displaySmall.copy(fontSize = AppTheme.getStartedDimes.descriptionTextSize),
                    color = colorResource(id = R.color.grey_text),
                    overflow = TextOverflow.Ellipsis,
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                //    .background(Color.Yellow)
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                ContinueButton(
                    modifier = Modifier
                        .height(90.dp)
                        .fillMaxWidth()
                        .padding(horizontal = 10.dp, vertical = 20.dp),
                    onClick = {
                        onClick()
                    }
                )
                Box(modifier = Modifier.align(Alignment.CenterHorizontally)) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth(),
                        text = "@Copyright MogMax. All rights reserved.",
                        fontSize = AppTheme.getStartedDimes.copyrightTextSize,
                        textAlign = TextAlign.Center,
                        color = colorResource(id = R.color.white)
                    )
                }
            }
        }
    }
}