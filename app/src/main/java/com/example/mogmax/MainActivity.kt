package com.example.mogmax

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.core.view.WindowCompat
import com.example.mogmax.presentation.nvgraph.NavGraph
import com.example.mogmax.presentation.nvgraph.Route
import com.example.mogmax.ui.theme.MogMaxTheme
import com.example.mogmax.ui.theme.rememberWindowSizeClass
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)
        setContent {
            val window = rememberWindowSizeClass()
            MogMaxTheme(windowSizeClass = window) {
                val systemController = rememberSystemUiController()
                val isSystemInDarkMode = isSystemInDarkTheme()
                SideEffect {
                    systemController.setSystemBarsColor(
                        color = Color.Transparent,
                        darkIcons = !isSystemInDarkMode
                    )
                }
                Box(
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth()
                        .background(colorResource(id = R.color.system_gray_6))
                ) {
                    NavGraph(startDestination = Route.GetStartedScreen.route)
                }
            }
        }
    }
}

