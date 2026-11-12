package com.example.miproyectoalexmartinez.components.layouts

import android.R
import android.widget.NumberPicker
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
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
import androidx.constraintlayout.compose.HorizontalAlign

@Composable
fun Mypadre(modifier: Modifier){
    var nombre by rememberSaveable() { mutableStateOf(value = "Nombre") }
    var apellido by rememberSaveable() { mutableStateOf(value = "Apellidos") }
    var contra by rememberSaveable() { mutableStateOf(value = "") }
        Column(modifier = modifier.fillMaxSize().padding(10.dp) ) {
            MitextField3(usu = nombre) {nombre = it}
            MitextField4(usu = apellido) {apellido = it}
            MiListaRadioButton2()
            MyPasswordTextField2(valor = contra) {contra = it}
        }
}

@Composable
fun MitextField3(usu:String, onUserChange:(String) -> Unit){
    TextField(value = usu, onValueChange = {onUserChange(it)},
        modifier = Modifier
            .padding(10.dp),
        singleLine = true)
}
@Composable
fun MitextField4(usu:String, onUserChange:(String) -> Unit){
    TextField(value = usu, onValueChange = {onUserChange(it)},
        modifier = Modifier.padding(start = 10.dp),
        singleLine = true)
}


@Composable
fun MyPasswordTextField2(valor: String, onValueChange: (String) -> Unit) {

    var passwordHidden by rememberSaveable { mutableStateOf(true) }
    TextField(modifier = Modifier.padding(10.dp), value = valor,
        onValueChange = { onValueChange(it) },
        singleLine = true,
        label = { Text("contraseña") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (passwordHidden) PasswordVisualTransformation()
        else VisualTransformation.None,
        trailingIcon = {
            Text(text = if (passwordHidden) "Mostrar" else "Ocultar",
                modifier = Modifier.clickable { passwordHidden = !passwordHidden
                }, Color.Blue)
        })
}
@Composable
fun RadioButtonComponent2(
    nombre: String, NombreSeleccionado: String,
    ItemSeleccionado: (String) -> Unit
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = nombre == NombreSeleccionado, onClick =
                { ItemSeleccionado(nombre) },
            colors = RadioButtonDefaults.colors(
                unselectedColor = Color.Gray,
                selectedColor = Color.Blue
            ))
        Text(nombre)
    }
}
@Composable
fun MiListaRadioButton2(modifier: Modifier = Modifier) {
    var OpcionSeleccionada by rememberSaveable { mutableStateOf("") }
    Column(modifier = modifier.padding(10.dp)) {
        Text("Genero")
        RadioButtonComponent2(
            nombre = "Masculino", NombreSeleccionado =
                OpcionSeleccionada
        ) { OpcionSeleccionada = it }
        RadioButtonComponent2(
            nombre = "Femenino", NombreSeleccionado =
                OpcionSeleccionada
        ) { OpcionSeleccionada = it }
    }
}