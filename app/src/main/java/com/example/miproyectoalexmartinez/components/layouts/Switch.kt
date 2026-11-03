package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.miproyectoalexmartinez.R

@Composable
fun MiSwitch(modifier: Modifier = Modifier) {

    var StadoDelswitch by rememberSaveable { mutableStateOf(true) }

    Box(modifier = modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Switch(colors = SwitchDefaults.colors(Color.Red,
            uncheckedThumbColor = Color.Blue)
                ,checked = StadoDelswitch,
            onCheckedChange = { StadoDelswitch = it },
            thumbContent = {
            Icon(
                painterResource(R.drawable.baseline_brightness_3_24),
                contentDescription = "jaja"
            )
        })
    }
}