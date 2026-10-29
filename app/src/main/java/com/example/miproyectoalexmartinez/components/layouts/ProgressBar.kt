package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.rememberLottieComposition
import com.example.miproyectoalexmartinez.R

@Composable
fun Progressobar(modifier: Modifier = Modifier) {
    var progreso by rememberSaveable { mutableIntStateOf(0) }
    val composicion by rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.loadercat))
    Column(
        modifier = Modifier.fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement =
            Arrangement.Center,
        horizontalAlignment =
            Alignment.CenterHorizontally
    ) {
        LottieAnimation(
            composition = composicion,
            iterations = LottieConstants.IterateForever,
            modifier = Modifier.offset(
                x = progreso.dp,

                )
        )
        Row(Modifier.padding(24.dp)) {
            Button(onClick = { progreso -= 10 }) { Text("<-") }
            Spacer(Modifier.width(24.dp))
            Button(onClick = { progreso += 10 }) { Text("->") }
        }
    }

/*
    Column(  modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Button(onClick = {isLoading = !isLoading} ) {
         Text("Visible / Oculto")
        }
        if (isLoading){
            CircularProgressIndicator(
                progress = animatedProgress,
                modifier.size(200.dp),
                color = Color.Red,
                strokeWidth = 10.dp,
                trackColor = Color.Green,
                strokeCap = StrokeCap.Round
            )
        }
        Row(Modifier.padding(24.dp)){
            Button(onClick = {progreso += 0.1f}) {Text("<-")}
            Spacer(Modifier.width(24.dp))
            Button(onClick = {progreso -= 0.1f}) {Text("->")}
        }
    }
*/
    /*
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CircularProgressIndicator()
        Spacer(Modifier.height(24.dp))
        CircularProgressIndicator(
            modifier.size(140.dp),
            color = Color.Blue,
            strokeWidth = 10.dp,
            trackColor = Color.Green,
            strokeCap = StrokeCap.Round
        )
        LinearProgressIndicator(
            color = Color.Red,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Round
        )
        Spacer(Modifier.height(24.dp))
        LinearProgressIndicator(
            progress = { 0.8f },
            color = Color.Red,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Square
        )
        Spacer(Modifier.height(24.dp))
        LinearProgressIndicator(
            progress = {animatedProgress},
            color = Color.Red,
            trackColor = Color.Blue,
            strokeCap = StrokeCap.Square

        )
        Row(Modifier.padding(24.dp)){
            Button(onClick = {progreso -= 0.1f}) {Text("<-")}
            Spacer(Modifier.width(24.dp))
            Button(onClick = {progreso += 0.1f}) {Text("->")}
        }


    }*/
}