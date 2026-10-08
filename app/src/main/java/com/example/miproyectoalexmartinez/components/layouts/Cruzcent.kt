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
fun MyCruzcent(modifier: Modifier = Modifier){
    ConstraintLayout(modifier = modifier.fillMaxSize()) {
        val (boxRed, boxBlue, boxGreen, boxCyan, boxYellow) = createRefs()
        Box(Modifier.size(100.dp).background(Color.Green).constrainAs(boxGreen){
                bottom.linkTo(parent.bottom)
                end.linkTo(parent.end)
                top.linkTo(parent.top)
                start.linkTo(parent.start)
        })
        Box(Modifier.size(100.dp).background(Color.Yellow).constrainAs(boxYellow){
            end.linkTo(boxGreen.start)
            top.linkTo(boxGreen.top)
        })
        Box(Modifier.size(100.dp).background(Color.Red).constrainAs(boxRed){
            end.linkTo(boxGreen.end)
            top.linkTo(boxGreen.bottom)
        })
        Box(Modifier.size(100.dp).background(Color.Blue).constrainAs(boxBlue){
            end.linkTo(boxGreen.end)
            bottom.linkTo(boxGreen.top)
        })
        Box(Modifier.size(100.dp).background(Color.Cyan).constrainAs(boxCyan){
            bottom.linkTo(boxGreen.bottom)
            start.linkTo(boxGreen.end)
        })

    }
}