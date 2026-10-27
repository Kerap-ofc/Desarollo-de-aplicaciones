package com.example.miproyectoalexmartinez.components.layouts

import android.provider.CalendarContract
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.graphics.painter.BrushPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.miproyectoalexmartinez.R
import coil3.compose.AsyncImage

@Preview
@Composable
fun MiImagen(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize(), contentAlignment = Alignment.Center)  {
        Column(){
            Row(modifier.fillMaxWidth()) {
                Image(
                    painter = painterResource(
                        R.drawable.tungtungsalarp
                    ),
                    contentDescription = "foreground",
                    modifier
                        .height(300.dp)
                        .width(100.dp)
                        .clip(
                            RoundedCornerShape(1000.dp)).border(
                            width = 5.dp,
                            brush = Brush.linearGradient(colors = listOf(Color.Red, Color.Yellow, Color.Red)),
                            shape = CircleShape
                        ),
                    contentScale = ContentScale.Crop

                ) }
            Row(modifier.fillMaxWidth(), horizontalArrangement = o) {
                AsyncImage(
                        model = "https://media1.tenor.com/m/LWYkOoCnsJkAAAAd/son-son-meme.gif",
                        contentDescription = "Imagen de Jetpack Compose",
                        modifier = Modifier.size(250.dp),
                        onError = {
                            Log.i("Image", "Ha ocurrido un error ${it.result.throwable.message}")
                        })
        }
    }
}
}