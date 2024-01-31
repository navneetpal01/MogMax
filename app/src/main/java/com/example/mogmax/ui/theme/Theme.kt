package com.example.mogmax.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import com.example.mogmax.presentation.onboarding.components.getstartedcomp.GetStartedDimens
import com.example.mogmax.presentation.onboarding.components.getstartedcomp.bigGetStartedDimes
import com.example.mogmax.presentation.onboarding.components.getstartedcomp.compactGetStartedDimens
import com.example.mogmax.presentation.onboarding.components.getstartedcomp.mediumGetStartedDimens
import com.example.mogmax.presentation.onboarding.components.getstartedcomp.smallGetStartedDimens

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun MogMaxTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    windowSizeClass: WindowSizeClass,
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    val orientation = when{
        windowSizeClass.width.size > windowSizeClass.height.size -> Orientation.Landscape
        else -> Orientation.Portrait
    }

    val sizeThatMaters = when(orientation){
        Orientation.Portrait -> windowSizeClass.width
        else -> windowSizeClass.height
    }

    val dimensions = when(sizeThatMaters){
        is WindowSize.Small -> smallDimensions
        is WindowSize.Compact -> compactDimensions
        is WindowSize.Medium -> mediumDimensions
        else -> largeDimensions
    }

    val typography = when(sizeThatMaters){
        is WindowSize.Small -> typographySmall
        is WindowSize.Compact -> typographyCompact
        is WindowSize.Medium -> typographyMedium
        else -> typographyBig
    }

    val getStartedDimens = when(sizeThatMaters){
        is WindowSize.Small -> smallGetStartedDimens
        is WindowSize.Compact -> compactGetStartedDimens
        is WindowSize.Medium -> mediumGetStartedDimens
        else -> bigGetStartedDimes
    }
    ProvideAppUtils(dimensions = dimensions, orientation = orientation, getStartedDimens = getStartedDimens ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = typography,
            content = content
        )
    }
}
object AppTheme{
    val dimens : Dimensions
        @Composable
        get() = LocalAppDimens.current

    val orientation : Orientation
        @Composable
        get() = LocalOrientationMode.current
    val getStartedDimes : GetStartedDimens
        @Composable
        get() = LocalGetStartedDimens.current
}