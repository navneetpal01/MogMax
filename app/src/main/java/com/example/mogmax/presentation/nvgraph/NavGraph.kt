package com.example.mogmax.presentation.nvgraph

import androidx.compose.runtime.Composable
import androidx.lifecycle.Lifecycle
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mogmax.presentation.onboarding.GetStartedScreen
import com.example.mogmax.presentation.onboarding.IntroScreen

@Composable
fun NavGraph(
    startDestination: String
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        composable(route = Route.GetStartedScreen.route) {
            GetStartedScreen(
                navController = navController
            )
        }
        composable(route = Route.IntroScreen.route) {
            IntroScreen() {
                if (navController.canGoBack) {
                    navController.popBackStack()
                }
            }
        }
    }
}

val NavHostController.canGoBack: Boolean
    get() = this.currentBackStackEntry?.lifecycle?.currentState == Lifecycle.State.RESUMED
