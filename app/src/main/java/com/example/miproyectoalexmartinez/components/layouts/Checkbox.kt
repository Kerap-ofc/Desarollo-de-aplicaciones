package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.miproyectoalexmartinez.components.layouts.DataClass.EstadoCheckbox
@Composable
fun CheckBoxConText(modifier: Modifier = Modifier,
                    miestadoCheckbox: EstadoCheckbox,
                    colorCheckbox: EstadoCheckbox,
                    siCheckedCambia: (EstadoCheckbox) -> Unit

) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.clickable { siCheckedCambia(miestadoCheckbox) }) {
        Checkbox(
            checked = miestadoCheckbox.checked,
            onCheckedChange = { siCheckedCambia(miestadoCheckbox) },
            enabled = true,
            colors = CheckboxDefaults.colors(
                checkedColor = colorCheckbox.color,
                uncheckedColor = colorCheckbox.color
            )
        )
        Spacer(Modifier.width(12.dp))
        Text(miestadoCheckbox.label)
    }
}
@Composable
fun PadreCheckBoxes(modifier: Modifier = Modifier) {
    var estado by rememberSaveable {
        mutableStateOf(
            listOf(
                EstadoCheckbox("ampa", "Es miembro del AMPA", color = Color.Red),
                EstadoCheckbox("repetidor", "Está repitiendo el curso", color = Color.Red),
                EstadoCheckbox("fcts", "Aporta empresa para FCTs", true, color = Color.Red),
            )
        )
    }
    Column(modifier = modifier.fillMaxSize()) {
        estado.forEach { miEstado ->
            CheckBoxConText(colorCheckbox = miEstado, miestadoCheckbox = miEstado) {
                estado = estado.map {
                    if (it.id == miEstado.id) {
                        miEstado.copy(checked = !miEstado.checked)
                    } else {
                        it
                    }
                }
            }
        }
    }
}