package com.example.mogmax.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import com.example.mogmax.presentation.onboarding.components.getstartedcomp.GetStartedDimens
import com.example.mogmax.presentation.onboarding.components.getstartedcomp.smallGetStartedDimens

@Composable
fun ProvideAppUtils(
    dimensions: Dimensions,
    getStartedDimens : GetStartedDimens,
    orientation: Orientation,
    content: @Composable () -> Unit
) {
    val dimSet = remember { dimensions }
    val gsDimens = remember {getStartedDimens}
    val orientation = remember { orientation }
    CompositionLocalProvider(
        LocalAppDimens provides dimSet,
        LocalOrientationMode provides orientation,
        LocalGetStartedDimens provides gsDimens,
        content = content
    )

}

//which takes a lambda expression that returns the initial value of the local variable
val LocalAppDimens = compositionLocalOf {
    smallDimensions
}

val LocalOrientationMode = compositionLocalOf {
    Orientation.Portrait
}
val LocalGetStartedDimens = compositionLocalOf {
    smallGetStartedDimens
}