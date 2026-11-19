package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderState
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.PopupProperties
import androidx.compose.material3.SliderDefaults
import androidx.compose.ui.graphics.Color

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Me(modifier: Modifier = Modifier) {
    var nombre by rememberSaveable { mutableStateOf(value = "") }
    var apellido by rememberSaveable { mutableStateOf(value = "") }
    var sel by rememberSaveable {mutableStateOf("Normal") }
    var pic by rememberSaveable {mutableStateOf("") }
    var cheese by rememberSaveable {mutableStateOf(false)}
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        MiNombre(usu = nombre) { nombre = it }
        MiTelefono(usu = apellido) { apellido = it }
        Mimenu(textpasa = sel) { sel = it}
        picante{pic = it}
        Switch2(valor = cheese) {cheese = it}
        Mimenu2(nom = nombre, ape = apellido, tex = sel, picc = pic, queso = cheese)
    }
}
@Composable
fun Mimenu2(nom: String, ape: String,tex: String, picc: String, queso: Boolean){
    var etx by rememberSaveable {mutableStateOf(false)}
    Text("Nombre del Pedido: "+ nom)
    Text("Telefono del Pedido: "+ ape)
    Text(tex)
    Text(picc)
    if (queso){
        Text("Con queso extra")
    }else{
        Text("Sin queso extra")
    }

    if (nom.isNotEmpty() && ape.isNotEmpty()){
        Button(onClick = {etx = true}, modifier = Modifier,colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFF0E6B13), contentColor = Color.Black)) {
            Text("Realizar pedido")
        }
        if (etx){
            Text("¡Pedido realizado con exito!", color = Color(0xFF038A00))
        }
    }
}

@Composable
fun MiNombre(usu: String, onUserChange: (String) -> Unit) {
    TextField(
        value = usu, onValueChange = { onUserChange(it) }, label = { Text("Nombre") },
        modifier = Modifier.fillMaxWidth(),
        singleLine = true
    )
}

@Composable
fun MiTelefono(usu: String, onUserChange: (String) -> Unit) {
    TextField(
        value = usu, onValueChange = { onUserChange(it) }, label = { Text("Telefono") },
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp),
        singleLine = true
    )
}

@Composable
fun Mimenu(textpasa: (String), onUserChange: (String) -> Unit ) {
    var usu by rememberSaveable { mutableStateOf(false) }
    Text("¿Que hamburguesa quieres?")
    Box(modifier = Modifier.padding(10.dp)) {
        Button(onClick = { usu = true }) {
            Text("Ver opciones")
            DropdownMenu(
                expanded = usu,
                onDismissRequest = {usu},
                offset = DpOffset(10.dp, 10.dp),
                properties = PopupProperties(
                    focusable = false ,
                    dismissOnClickOutside = true,
                    dismissOnBackPress = false,
                    clippingEnabled = false
                )
            ) {
                DropdownMenuItem(text = { Text("Normal") }, onClick = {
                    usu = false
                    onUserChange("Con queso")
                })
                DropdownMenuItem(text = { Text("Sin queso") }, onClick = {
                    usu =
                        false
                    onUserChange("Sin queso")
                })
                DropdownMenuItem(text = { Text("Ultra deluxe") }, onClick = {
                    usu =
                        false
                    onUserChange("Ultra deluxe")

                })
                DropdownMenuItem(text = { Text("Hamburguesa lenguaraz") }, onClick = {
                    usu =
                        false
                    onUserChange("Hamburguesa lenguaraz")
                })

            }
        }
    }
    Text(textpasa)
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun picante(onUserChange: (String) -> Unit){
    var valued by rememberSaveable {mutableStateOf(5f) }
    var colox = Color.LightGray
    var estado = remember {
        SliderState(
            value = valued,
            steps = 9,
            valueRange = 0f..10f)
    }
    if (estado.value.toInt()>=4){
        colox = Color.Red
        onUserChange("Picante")
    };if (estado.value.toInt()>7) {
        colox = Color.Black
        onUserChange("Muy picante")
    };if (estado.value.toInt()<=3){
        colox = Color.White
        onUserChange("Sin picante")
    }

    Column(modifier = Modifier.padding(horizontal = 32.dp)) {
        Slider(estado,
            colors = SliderDefaults.colors(
                thumbColor = Color.Green,
                disabledThumbColor = Color.DarkGray,
                activeTrackColor = colox,
                activeTickColor = Color.Yellow,
            ))

        Text(estado.value.toString())

    }
}
@Composable
fun Switch2(valor: Boolean, onUserChange:(Boolean) -> Unit) {
    Box(modifier = Modifier
        .fillMaxWidth()
        .padding(10.dp)) {
        Row{
            Switch(
                checked = valor,
                onCheckedChange = { onUserChange(it) },
            )
            Text("Extra de queso", Modifier.padding(start = (10.dp), top = 10.dp))}
    }
}