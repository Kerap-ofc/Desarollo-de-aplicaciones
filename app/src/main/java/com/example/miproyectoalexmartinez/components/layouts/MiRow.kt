package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

val colorrow = Color(0xFF6200EE)
@Composable
fun Mirow(modifier: Modifier = Modifier) {
    Column(modifier = Modifier) {
        Row() {
            Box(modifier = Modifier.background(Color.Cyan).fillMaxWidth().height(310.dp), contentAlignment = Alignment.Center)
            { Text(text = "Fila2, primera columna") }
        }
        Row() {
            Box(modifier = Modifier.background(Color.Red).width(210.dp).height(310.dp), contentAlignment = Alignment.Center)
            { Text(text = "Fila2, primera columna") }
            Box(modifier = Modifier.background(Color.Green).width(210.dp).height(310.dp), contentAlignment = Alignment.Center)
            { Text(text = "Fila2, Segunda columna") }
        }
        Row() {
            Box(modifier = Modifier.background(color = colorrow).fillMaxWidth().height(310.dp), contentAlignment = Alignment.Center)
            { Text(text = "Fila 3") }
        }
    }
}