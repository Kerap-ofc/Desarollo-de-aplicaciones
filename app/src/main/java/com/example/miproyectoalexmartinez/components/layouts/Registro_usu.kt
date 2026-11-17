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
fun Mypadre(modifier: Modifier){
    var nombre by rememberSaveable { mutableStateOf(value = "") }
    var apellido by rememberSaveable { mutableStateOf(value = "") }
    var contra by rememberSaveable { mutableStateOf(value = "") }
    var stadoDelswitch by rememberSaveable { mutableStateOf(false) }
    var opcionSeleccionada by rememberSaveable { mutableStateOf(value = "") }
        Column(modifier = modifier.fillMaxSize().padding(10.dp).verticalScroll(rememberScrollState()), horizontalAlignment = Alignment.CenterHorizontally){
            MitextField3(usu = nombre) {nombre = it}
            MitextField4(usu = apellido) {apellido = it}
            MiListaRadioButton2(valo =opcionSeleccionada){opcionSeleccionada = it}
            MyPasswordTextField2(valor = contra) {contra = it}
            Switch(valor = stadoDelswitch){stadoDelswitch = it}
            Textomustrato(nom = nombre , ape = apellido, estaswi = stadoDelswitch, contrad = contra, opciosel = opcionSeleccionada)
        }
}
@Composable
fun Textomustrato(nom: String, ape: String, estaswi: Boolean, contrad: String, opciosel: String){
    var butonactive by rememberSaveable {mutableStateOf(false)}
    var textacti by rememberSaveable {mutableStateOf(false)}

    if(nom.isNotEmpty() && ape.isNotEmpty() && estaswi && contrad.isNotEmpty() && opciosel.isNotEmpty()){
        butonactive = true
    }

    Button(onClick = {textacti = true}, modifier = Modifier,colors = ButtonDefaults.buttonColors(
        containerColor = Color(0xFF0E6B13), contentColor = Color.Black), enabled = butonactive) {
        Text("Registrate")
    }
    if (textacti){
        Text("¡Felicidades, te has registrado correctamente!", color = Color(0xFF038A00))
    }


}
@Composable
fun MitextField3(usu:String, onUserChange:(String) -> Unit){
    TextField(value = usu, onValueChange = {onUserChange(it)}, label = {Text("Usuario")},
        modifier = Modifier.fillMaxWidth(),
        singleLine = true)
}
@Composable
fun MitextField4(usu:String, onUserChange:(String) -> Unit){
    TextField(value = usu, onValueChange = {onUserChange(it)}, label = {Text("Apellidos")},
        modifier = Modifier.fillMaxWidth().padding(top = 10.dp),
        singleLine = true)
}
@Composable
fun MyPasswordTextField2(valor: String, onValueChange: (String) -> Unit) {

    var passwordHidden by rememberSaveable { mutableStateOf(true) }
    TextField(modifier = Modifier.padding(top = 10.dp).fillMaxWidth(), value = valor,
        onValueChange = { onValueChange(it) },
        singleLine = true,
        label = { Text("Contraseña") },
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
fun RadioButtonComponent2(nombre: String, nombreSeleccionado: String, itemSeleccionado: (String) -> Unit) {
    Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
        RadioButton(
            selected = nombre == nombreSeleccionado, onClick =
                { itemSeleccionado(nombre) },
            colors = RadioButtonDefaults.colors(
                unselectedColor = Color.Gray,
                selectedColor = Color.Blue
            ))
        Text(nombre)
    }
}
@Composable
fun MiListaRadioButton2( valo: String, onUserChange:(String) -> Unit) {
    Column(modifier = Modifier.fillMaxWidth().padding(top = 10.dp)) {
        Text("Genero")
        RadioButtonComponent2(
            nombre = "Masculino", nombreSeleccionado = valo
        ) { onUserChange(it)}
        RadioButtonComponent2(
            nombre = "Femenino", nombreSeleccionado =valo
        ) { onUserChange(it)}
    }
}
@Composable
fun Switch(modifier: Modifier = Modifier, valor: Boolean, onUserChange:(Boolean) -> Unit) {
        Box(modifier = Modifier.fillMaxWidth().padding(10.dp)) {
            Row{
                Switch(
                    checked = valor,
                    onCheckedChange = { onUserChange(it)},
                )
                Text("Aceptar condiciones de uso ", modifier.padding(start = (10.dp), top = 10.dp))}
        }
    }