package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MiSlider(modifier: Modifier = Modifier) {
    var miValor by rememberSaveable { mutableFloatStateOf(0.5f) }
    Column(modifier = modifier.padding(horizontal = 30.dp)) {
        Slider(value = miValor,
            {miValor = it},
            colors = SliderDefaults.colors(
                thumbColor = Color.Red,
                disabledThumbColor = Color.DarkGray,
                activeTrackColor = Color.Red,
                activeTickColor = Color.Blue,
                disabledActiveTrackColor = Color.Gray,
                disabledActiveTickColor = Color.DarkGray,
                inactiveTickColor = Color.Green,
                inactiveTrackColor = Color.Blue,
                disabledInactiveTickColor = Color.DarkGray,
                disabledInactiveTrackColor = Color.Gray
            ))
        Text(miValor.toString())
    }
}