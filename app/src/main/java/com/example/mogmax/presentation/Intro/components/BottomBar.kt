package com.example.mogmax.presentation.Intro.components

import android.annotation.SuppressLint
import androidx.compose.animation.Crossfade
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.derivedStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp
import androidx.wear.compose.material.ExperimentalWearMaterialApi
import androidx.wear.compose.material.FractionalThreshold
import androidx.wear.compose.material.rememberSwipeableState
import androidx.wear.compose.material.swipeable
import com.example.mogmax.R
import com.example.mogmax.ui.theme.segoeFont
import com.example.mogmax.ui.theme.vigaFont
import kotlin.math.roundToInt

@SuppressLint("UnrememberedMutableState")
@Composable
fun DraggableControl(
    modifier: Modifier = Modifier,
    progress: Float
) {
    Box(
        modifier = modifier
            .padding(4.dp)
            .shadow(
                elevation = 2.dp,
                shape = CircleShape,
                clip = false
            )
            .background(color = colorResource(id = R.color.white), shape = CircleShape),
        contentAlignment = Alignment.Center
    ) {
        val isConfirmed = derivedStateOf { progress >= 0.8f }
        Crossfade(targetState = isConfirmed.value, label = "Crossfade") { Done ->
            if (Done) {
                Icon(
                    imageVector = Icons.Filled.Done,
                    contentDescription = "Confirm Icon",
                    tint = colorResource(id = R.color.system_black)
                )
            } else {
                Icon(
                    imageVector = Icons.Filled.ArrowForward,
                    contentDescription = "Forword Icon",
                    tint = colorResource(id = R.color.system_black)
                )
            }

        }

    }
}

@SuppressLint("UnrememberedMutableState")
@OptIn(ExperimentalWearMaterialApi::class)
@Composable
fun SwipeButton(
    modifier: Modifier = Modifier,
    onConfirmed: () -> Unit
) {
    val width = 350.dp
    val dragSize = 60.dp
    val swipeableState = rememberSwipeableState(initialValue = ScrollState.DEFAULT)
    val sizePx = with(LocalDensity.current) {
        (width - dragSize).toPx()
    }
    val anchors = mapOf(0f to ScrollState.DEFAULT, sizePx to ScrollState.CONFIRMED)
    val progress = derivedStateOf {
        if (swipeableState.offset.value == 0f) 0f else swipeableState.offset.value / sizePx
    }
    LaunchedEffect(swipeableState.currentValue) {
        if (swipeableState.currentValue == ScrollState.CONFIRMED) {
            onConfirmed()
            swipeableState.animateTo(ScrollState.DEFAULT)
        }
    }
    Box(
        modifier = Modifier
            .width(width)
            .padding(bottom = 20.dp)
            .swipeable(
                state = swipeableState,
                anchors = anchors,
                thresholds = { _, _ ->
                    FractionalThreshold(0.5f)
                },
                orientation = Orientation.Horizontal
            )
            .background(
                color = colorResource(id = R.color.system_gray_6),
                shape = RoundedCornerShape(dragSize)
            )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.Center)
                .alpha(1f - progress.value),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Swipe for Next",
                color = colorResource(id = R.color.white),
                fontFamily = segoeFont
            )
        }
        DraggableControl(
            modifier = modifier
                .offset {
                    IntOffset(swipeableState.offset.value.roundToInt(), 0)
                }
                .size(dragSize),
            progress = progress.value
        )
    }


}