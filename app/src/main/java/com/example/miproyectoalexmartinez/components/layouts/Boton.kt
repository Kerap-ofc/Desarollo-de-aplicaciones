package com.example.miproyectoalexmartinez.components.layouts

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun MiButton(modifier: Modifier) {
    Column(modifier = modifier) {
        Button(onClick = { Log.i("Alex", "Botón pulsado")},
            border = BorderStroke(1.dp, Color(0xFF000000)),
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF9A9A),
                contentColor = Color.Black)
        )
        {
            Text("Pulsame", color = Color.Black)
        }
    }
}