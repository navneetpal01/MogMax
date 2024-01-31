package com.example.mogmax.presentation.onboarding.components.introcomp


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.mogmax.R

@Composable
fun PageIndicator(
    modifier : Modifier = Modifier,
    pageSize : Int,
    selectedPage : Int,
    selectedColor : Color = colorResource(id = R.color.button_green),
    unSelectedColor : Color = colorResource(id = R.color.system_gray_5)
){
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        repeat(pageSize){page->
            Box(modifier = Modifier.size(14.dp).clip(CircleShape).background(color = if(page == selectedPage) selectedColor else unSelectedColor))
        }
    }
}

