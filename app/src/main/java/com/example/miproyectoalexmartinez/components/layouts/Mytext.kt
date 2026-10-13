package com.example.miproyectoalexmartinez.components.layouts

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp

@Composable
fun MiText(modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = "Alex"
        )
        Text(
            text = "Alex",
            color = Color.Red
        )
        Text(
            text = "Alex",
            color = Color.Blue,
            fontSize = 80.sp,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = "Alex",
            color = Color.Blue,
            fontSize = 80.sp,
            fontWeight = FontWeight.ExtraBold
        )
        Text(
            text = "Alex",
            color = Color.Blue,
            fontSize = 80.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic
        )
        Text(
            text = "Alex",

            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            letterSpacing = 50.sp
        )
        Text(
            text = "Alex",
            color = Color.Blue,
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.Underline
        )
        Text(
            text = "Alex",
            color = Color.Blue,
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.LineThrough
        )
        Text(
            text = "Alex",
            color = Color.Green,
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.combine(listOf(TextDecoration.Underline, TextDecoration.LineThrough))
        )
        Text(
            modifier = modifier.fillMaxWidth(),
            text = "Alex",
            color = Color.Green,
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            textDecoration = TextDecoration.combine(listOf(TextDecoration.Underline, TextDecoration.LineThrough)),
            textAlign = TextAlign.Center
        )
    }
}