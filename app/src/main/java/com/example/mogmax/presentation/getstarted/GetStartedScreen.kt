package com.example.mogmax.presentation.getstarted

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.spring
import androidx.compose.animation.fadeIn
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.mogmax.presentation.getstarted.components.GetStartedImage
import com.example.mogmax.presentation.getstarted.components.OnBoardingCard
import com.example.mogmax.presentation.nvgraph.Route
import com.example.mogmax.ui.theme.ColumnGrad
import com.example.mogmax.util.vibrateOnClick

@Composable
fun GetStartedScreen(navController: NavController) {
    val context = LocalContext.current
    var slideOut by remember { mutableStateOf(true) }
    AnimatedVisibility(
        visible = slideOut,
        enter = fadeIn(),
        exit =   slideOutVertically(
            targetOffsetY = { fullHeight -> -fullHeight },
            animationSpec = spring(dampingRatio = 0.8f, stiffness = 80f)
        )
    ) {
        Box(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .background(Color.Black)
                .navigationBarsPadding()
        ) {
            GetStartedImage(
                modifier = Modifier
                    .fillMaxHeight(fraction = 0.6f)
            )
            Box(
                modifier = Modifier
                    .fillMaxHeight(fraction = 0.6f)
                    .fillMaxWidth()
                    .background(brush = ColumnGrad)
                    .align(Alignment.BottomEnd)
            )
            Box(modifier = Modifier.align(Alignment.BottomEnd)) {
                var visible by remember { mutableStateOf(false) }
                LaunchedEffect(Unit) {
                    visible = true
                }
                AnimatedVisibility(
                    visible = visible,
                    enter = slideInVertically(
                        initialOffsetY = { fullHeight -> fullHeight },
                        animationSpec = spring()
                    )
                ) {
                    OnBoardingCard(
                        onClick = {
                            try {
                                vibrateOnClick(context = context)
                            } catch (e: Exception) {
                                e.printStackTrace()
                            }
                            slideOut = false
                            navController.navigate(Route.IntroScreen.route)
                        }
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun GetStartedScreenPrev() {

}

