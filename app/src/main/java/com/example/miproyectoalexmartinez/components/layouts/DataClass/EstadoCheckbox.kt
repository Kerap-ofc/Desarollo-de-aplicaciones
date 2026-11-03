package com.example.miproyectoalexmartinez.components.layouts.DataClass

import androidx.compose.ui.graphics.Color

data class EstadoCheckbox(
    val id: String,
    val label: String,
    val checked: Boolean = false,
    val color: Color = Color.Red
)