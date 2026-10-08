package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
@Composable
fun ConstraintBarrier(modifier: Modifier) {
    ConstraintLayout(modifier.fillMaxSize()) {
        val (boxRed, boxYellow, boxCyan, boxGreen) = createRefs()
        val barrier = createEndBarrier(boxYellow, boxRed)
        Box(
            modifier = Modifier
                .width(100.dp)
                .height(50.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(parent.top, margin = 40.dp)
                    start.linkTo(parent.start, margin = 16.dp)
                }
        )
        Box(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    top.linkTo(boxRed.bottom, margin = 50.dp)
                    start.linkTo(parent.start, margin = 16.dp)
                }
        )
        Box(
            modifier = Modifier
                .width(150.dp)
                .height(50.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    top.linkTo(boxRed.bottom, margin = 50.dp)
                    start.linkTo(barrier, margin = 16.dp)
                }
        )
        Box(
            modifier = Modifier
                .width(150.dp)
                .height(50.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    bottom.linkTo(boxGreen.top, margin = 50.dp)
                    start.linkTo(barrier, margin = 16.dp)
                }
        )
    }
}