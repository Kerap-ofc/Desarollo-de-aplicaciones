package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp

@Composable
fun Me(modifier: Modifier = Modifier) {
    var nombre by rememberSaveable { mutableStateOf(value = "") }
    var apellido by rememberSaveable { mutableStateOf(value = "") }
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(10.dp)
            .verticalScroll(rememberScrollState()),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column(modifier = modifier.fillMaxSize().padding(10.dp).verticalScroll(rememberScrollState()), horizontalAlignment = Alignment.CenterHorizontally) {

        }

    }
}
@Composable
fun MiNombre(usu:String, onUserChange:(String) -> Unit){
    TextField(value = usu, onValueChange = {onUserChange(it)}, label = {Text("Usuario")},
        modifier = Modifier.fillMaxWidth(),
        singleLine = true)
}
@Composable
fun MiTelefono(usu:String, onUserChange:(String) -> Unit){
    TextField(value = usu, onValueChange = {onUserChange(it)}, label = {Text("Apellidos")},
        modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
        singleLine = true)
}