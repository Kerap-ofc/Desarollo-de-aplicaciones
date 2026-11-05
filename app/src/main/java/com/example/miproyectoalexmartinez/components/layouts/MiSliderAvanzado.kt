package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.setValue

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MiSliderAvanzado(modifier: Modifier = Modifier) {
    var ejemplo by rememberSaveable { mutableStateOf("¿Seguro?") }
    val estado = remember {
        SliderState(
            value = 5f,
            steps = 9,
            onValueChangeFinished = {ejemplo= "SIIIII"},
            valueRange = 0f..10f)

    }
    Column(modifier = modifier.padding(horizontal = 32.dp)) {
        Slider(estado)
        Text(ejemplo)
    }
}