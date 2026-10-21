package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import net.objecthunter.exp4j.ExpressionBuilder

@Composable
fun Calculadora(modifier: Modifier = Modifier) {
    var expresion by remember { mutableStateOf("") }
    var resultado by remember { mutableStateOf("") }
    Box(
        Modifier
            .fillMaxSize()
            .background(Color(0xFF101010))
    ) {
        Column(
            modifier
                .fillMaxSize()
                .padding(horizontal = 21.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(8.dp, alignment = Alignment.Bottom)
        ) {

            Row(
                Modifier.fillMaxWidth()
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = expresion.ifEmpty{"0"},
                    color = Color.White,
                    fontSize = 45.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Right
                )
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = { expresion = ""
                                resultado = ""},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFC0C0C0),
                        contentColor = Color.Black
                    ),
                    shape = CircleShape
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "C",
                        color = Color.Black,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)
                }

                Button(
                    onClick = {
                        if (expresion.isNotEmpty()) {
                        expresion = if (expresion.startsWith("-")) {
                            expresion.removePrefix("-")
                    }else{
                        "-$expresion"
                    }}},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFC0C0C0),
                        contentColor = Color.Black
                    ),
                    shape = CircleShape
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "+ -",
                        color = Color.Black,
                        fontSize = 32.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)
                }

                Button(
                    onClick = {if (expresion.isNotEmpty()){
                        val numero = expresion.toDouble()
                        expresion = (numero/100).toString()
                    } },
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFC0C0C0),
                        contentColor = Color.Black
                    ),
                    shape = CircleShape
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "%",
                        color = Color.Black,
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)
                }

                Button(
                    onClick = {expresion += "/"},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFA112),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "/",
                        color = Color.White,
                        fontSize = 40.sp,
                        textAlign = TextAlign.Center)
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = {expresion += 7},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "7",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center) }

                Button(
                    onClick = {expresion += 8},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "8",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center) }

                Button(
                    onClick = {expresion += 9},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "9",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center) }

                Button(
                    onClick = {expresion += "*"},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFA112),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "X",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center) }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = {expresion += 4},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "4",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center)  }

                Button(
                    onClick = {expresion += 5},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "5",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center)  }

                Button(
                    onClick = {expresion += 6},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "6",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center)  }

                Button(
                    onClick = {expresion += "-"},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFA112),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "-",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center)  }
            }

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = {expresion += 1},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "1",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center)  }

                Button(
                    onClick = {expresion += 2},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "2",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center)  }

                Button(
                    onClick = {expresion += 3},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "3",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center)  }

                Button(
                    onClick = {expresion += "+"},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFA112),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) { Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "+",
                    color = Color.White,
                    fontSize = 40.sp,

                    textAlign = TextAlign.Center)  }
            }

            // Última fila
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Button(
                    onClick = {expresion += 0},
                    modifier = Modifier.weight(2f).height(85.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    )
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "0",
                        color = Color.White,
                        fontSize = 40.sp,

                        textAlign = TextAlign.Center)
                }

                Button(
                    onClick = {expresion += "."},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFF343434),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = ".",
                        color = Color.White,
                        fontSize = 40.sp,
                        textAlign = TextAlign.Center)
                }

                Button(
                    onClick = {val elresul = ExpressionBuilder(expresion)
                        .build()
                        .evaluate()
                              expresion = elresul.toString()},
                    modifier = Modifier.weight(1f).aspectRatio(1f),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = Color(0xFFFFA112),
                        contentColor = Color.White
                    ),
                    shape = CircleShape
                ) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "=",
                        color = Color.White,
                        fontSize = 40.sp,

                        textAlign = TextAlign.Center)
                }
            }
        }
    }
}