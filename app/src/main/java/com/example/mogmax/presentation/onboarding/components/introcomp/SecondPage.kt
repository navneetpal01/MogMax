package com.example.mogmax.presentation.onboarding.components.introcomp

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.spring
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mogmax.R
import com.example.mogmax.presentation.common.getCurrentTime
import kotlinx.coroutines.delay

@Composable
fun NotificationScreen(
    modifier: Modifier = Modifier
) {
    var notificationAnimate by remember { mutableStateOf(false) }
    var currentTime by remember {mutableStateOf(getCurrentTime())}
    Box(
        modifier = modifier
            .fillMaxHeight(0.6f)
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.system_black)),
    ) {
        Box(
            modifier = modifier
                .height(380.dp)
                .width(300.dp)
                .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp))
                .align(Alignment.BottomCenter)
                .background(color = colorResource(id = R.color.phone_color)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(topStart = 40.dp, topEnd = 40.dp)),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = modifier.height(50.dp))
                Text(
                    modifier = modifier,
                    text = currentTime,
                    fontSize = 60.sp,
                    color = colorResource(id = R.color.white)
                )
                Spacer(modifier = modifier.height(25.dp))
                LaunchedEffect(Unit){
                    notificationAnimate = true
                }
                AnimatedVisibility(
                    visible = notificationAnimate,
                    enter = slideInVertically(
                        initialOffsetY = {fullHeight -> fullHeight},
                        animationSpec = spring(dampingRatio = 0.3f, stiffness = 10f)
                    )
                ) {
                    Notification(modifier = modifier)
                }
                Spacer(modifier = modifier.height(25.dp))
                AnimatedVisibility(
                    visible = notificationAnimate,
                    enter = slideInVertically(
                        initialOffsetY = {fullHeight -> fullHeight},
                        animationSpec = spring(dampingRatio = 0.3f, stiffness = 20f)
                    )
                ) {
                    Notification(modifier = modifier)
                }
                LaunchedEffect(true){
                    while(true){
                        delay(1000)
                        currentTime = getCurrentTime()
                    }
                }
            }
        }
    }
}

@Composable
fun Notification(
    modifier : Modifier = Modifier
){
    Row(
        modifier = modifier
            .height(60.dp)
            .width(270.dp)
            .clip(RoundedCornerShape(CornerSize(18.dp)))
            .background(color = colorResource(id = R.color.notification_background)),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ){
        Card(
            modifier = modifier
                .fillMaxHeight(0.8f)
                .fillMaxWidth(0.2f)
                .clip(RoundedCornerShape(CornerSize(10.dp))),
            colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.notification_icon))
        ){

        }
        Spacer(modifier = modifier.fillMaxWidth(0.05f))
        Column(
            modifier = modifier
                .fillMaxHeight(0.8f)
                .fillMaxWidth(0.85f),
            verticalArrangement = Arrangement.SpaceEvenly
        ){
            Box(modifier = modifier
                .fillMaxHeight(0.3f)
                .fillMaxWidth(0.6f)
                .clip(RoundedCornerShape(corner = CornerSize(5.dp)))
                .background(color = colorResource(id = R.color.notification_content))
            )
            Box(modifier = modifier
                .fillMaxHeight(0.2f)
                .fillMaxWidth()
                .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                .background(color = colorResource(id = R.color.notification_content))
            )
            Box(modifier = modifier
                .fillMaxHeight(0.2f)
                .fillMaxWidth()
                .clip(RoundedCornerShape(corner = CornerSize(10.dp)))
                .background(color = colorResource(id = R.color.notification_content))
            )
        }
    }
}



@Preview
@Composable
fun NotificationScreenPrev() {
    NotificationScreen()
}