package com.example.mogmax.presentation.getstarted.components

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.ColorMatrix
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.mogmax.R
import kotlinx.coroutines.delay

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GetStartedImage(
    modifier: Modifier = Modifier
) {
    val imageList = listOf(
        R.drawable.image_first,
        R.drawable.image_second,
        R.drawable.image_third
    )

    val pagerState = rememberPagerState(initialPage = 0) {
        imageList.size
    }
    val isScrolling by remember { mutableStateOf(true) }
    HorizontalPager(
        state = pagerState,
        userScrollEnabled = false,
    ) { image ->
        Image(
            modifier = Modifier
                .fillMaxHeight(fraction = 0.6f)
                .fillMaxWidth(),
            painter = painterResource(id = imageList[image]),
            colorFilter = ColorFilter.colorMatrix(
                colorMatrix = ColorMatrix().apply {
                    setToSaturation(0f)
                }
            ),
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
    }
    LaunchedEffect(isScrolling) {
        while (isScrolling) {
            delay(2000)
            if (pagerState.currentPage == 2) {
                pagerState.scrollToPage(0)
            } else {
                pagerState.animateScrollToPage((pagerState.currentPage + 1) % imageList.size)
            }
        }
    }

}