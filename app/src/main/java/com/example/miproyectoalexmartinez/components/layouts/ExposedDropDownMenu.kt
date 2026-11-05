package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MiExposedDropDownMenu(modifier: Modifier = Modifier) {
    var expandido by rememberSaveable { mutableStateOf(false) }
    var seleccionado by rememberSaveable { mutableStateOf("") }
    ExposedDropdownMenuBox(modifier = modifier, expanded = expandido,
        onExpandedChange = { expandido = !expandido }) {
        TextField(
            value = seleccionado,
            onValueChange = {},
            readOnly = true,
            label = { Text("Módulos") },
            modifier = Modifier
                .menuAnchor()
                .fillMaxWidth(),
            trailingIcon = {
                ExposedDropdownMenuDefaults.TrailingIcon(expandido)
            }
        )
        DropdownMenu(
            expanded = expandido, onDismissRequest = { expandido = false }) {
            sDropdownMenuItem(text = { Text("Bases de datos") }, onClick = {
                seleccionado = "Bases de datos"
                expandido = false
            })
            DropdownMenuItem(text = { Text("Desarrollo de interfaces") }, onClick
            = {
                    seleccionado = "Desarrollo de interfaces"
                    expandido = false
                })
            DropdownMenuItem(text = { Text("Programación") }, onClick = {
                seleccionado = "Programación"
                expandido = false
            })
            DropdownMenuItem(text = { Text("Entornos de desarrollo") }, onClick =
                {
                    seleccionado = "Entornos de desarrollo"
                    expandido = false
                })
        }
    }
}