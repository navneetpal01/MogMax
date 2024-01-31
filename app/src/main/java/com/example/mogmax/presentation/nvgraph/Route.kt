package com.example.mogmax.presentation.nvgraph

sealed class Route(
    val route : String
){
    object GetStartedScreen : Route(route = "GetStartedScreen")
    object IntroScreen : Route(route = "IntroScreen")
}