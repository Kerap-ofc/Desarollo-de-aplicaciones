package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation

@Composable
fun MiTextFieldPadre(modifier: Modifier){
    var usuario by rememberSaveable{mutableStateOf("Alex")}
    var mivalor by rememberSaveable { mutableStateOf("") }
    var mivalor2 by rememberSaveable { mutableStateOf("") }
    Column(modifier = modifier) {
        MiTextField(usu = usuario) {usuario = it}
        MiTextFieldAvanzado(valor = mivalor) {mivalor = it}
        MyPasswordTextField(valor = mivalor2){mivalor2 = it}
    }
}
@Composable
fun MiTextField(usu:String, onUserChange:(String) -> Unit) {
    TextField(usu,onValueChange = {onUserChange(it)},readOnly=usu.isEmpty())
}
@Composable
fun MiTextFieldAvanzado(valor: String, onValueChange: (String) -> Unit) {
    TextField(valor,
        onValueChange = {
            if(it.contains("a")){
                onValueChange(it.replace("a",""))
            }
            else {
                onValueChange(it)
            }
        })
}
@Composable
fun MyPasswordTextField(valor: String, onValueChange: (String) -> Unit) {
    var passwordHidden by rememberSaveable { mutableStateOf(true) }
    TextField(value = valor,
        onValueChange = { onValueChange(it) },
        singleLine = true,
        label = { Text("Introduce tu contraseña") },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
        visualTransformation = if (passwordHidden) PasswordVisualTransformation()
        else VisualTransformation.None,
        trailingIcon = {
            Text(text = if (passwordHidden) "Mostrar" else "Ocultar",
                modifier = Modifier.clickable { passwordHidden = !passwordHidden
                })
        })
}