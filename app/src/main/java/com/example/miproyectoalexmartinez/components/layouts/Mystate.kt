package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
@Composable
fun MiState(modifier: Modifier){
    var number by rememberSaveable { mutableStateOf(0) }
    Text("Púlsame: ${number}", modifier = modifier.clickable{number +=
        1})
}