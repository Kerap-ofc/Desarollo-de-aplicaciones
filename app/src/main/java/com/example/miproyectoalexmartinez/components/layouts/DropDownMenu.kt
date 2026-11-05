package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
@Composable
fun MiDropDownMenu(modifier: Modifier = Modifier) {
    var expandido by rememberSaveable { mutableStateOf(false) }
    Box(modifier = modifier) {
        Button(onClick = { expandido = true }) {
            Text("Ver opciones")
        }
        DropdownMenu(
            expanded = expandido,
            onDismissRequest = { expandido = false },
            offset = DpOffset(16.dp, 16.dp),
            properties = PopupProperties(
                focusable = true,
                dismissOnClickOutside = false,
                dismissOnBackPress = false,
                clippingEnabled = false
            )
        ) {
            DropdownMenuItem(text = { Text("Opción 1") }, onClick = { expandido =
                false })
            DropdownMenuItem(text = { Text("Opción 2") }, onClick = { expandido =
                false })
            DropdownMenuItem(text = { Text("Opción 3") }, onClick = { expandido =
                false })
            DropdownMenuItem(text = { Text("Opción 4") }, onClick = { expandido =
                false })
        }
    }
}