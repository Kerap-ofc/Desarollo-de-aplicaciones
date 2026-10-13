package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
@Composable
fun Myguidelines(modifier: Modifier) {
    ConstraintLayout(Modifier.fillMaxSize()) {
        val topGuide = createGuidelineFromTop(0.2f)
        val botomGuide = createGuidelineFromBottom(0.3f)
        val centerGuide = createGuidelineFromStart(0.5f)

        val (boxRed, boxGreen, boxYellow) = createRefs()

        Box(modifier.size(100.dp).background(Color.Red).constrainAs(boxRed){
                top.linkTo(topGuide)
            end.linkTo(centerGuide)
        })
        Box(modifier.size(100.dp).background(Color.Green).constrainAs(boxGreen){
            top.linkTo(topGuide)
            start.linkTo(centerGuide)
        })
        Box(modifier.size(100.dp).background(Color.Yellow).constrainAs(boxYellow){
            top.linkTo(botomGuide)
            start.linkTo(boxRed.start)
            end.linkTo(boxGreen.end)
        })
    }}