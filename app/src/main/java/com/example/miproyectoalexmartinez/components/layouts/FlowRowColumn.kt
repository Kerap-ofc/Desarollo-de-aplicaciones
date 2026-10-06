package com.example.miproyectoalexmartinez.components.layouts


import android.R
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.FlowColumn
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

val colorProgramacion = Color(0xFFFF7D6D)
val colorProgramacion2 = Color(0xFFFFC184)
val colorProgramacion3 = Color(0xFFB4A02F)
val colorProgramacion4 = Color(0xFFD094CF)
val colorProgramacion5 = Color(0xFF2D7CB2)
val colorProgramacion6 = Color(0xFF2957BE)
val colorProgramacion7 = Color(0xFFFF7708)
val colorProgramacion8 = Color(0xFFFFF8D2)
val colorProgramacion9 = Color(0xFFFFDA2B)
val colorProgramacion10 = Color(0xFFFFD5C4)


@Composable
fun MyFLowRowColumn(modifier: Modifier = Modifier){

    val scrollStateHorizontal = rememberScrollState()
    val scrollStateVertical = rememberScrollState()

    Box(modifier = modifier.fillMaxSize().horizontalScroll(scrollStateHorizontal).verticalScroll(scrollStateVertical)){
    FlowRow(maxItemsInEachRow = 6, modifier = Modifier.height(1200.dp).width(800.dp)) {
        FlowColumn(maxItemsInEachColumn = 9, modifier = Modifier.weight(0.8f)) {
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.White).weight(0.5f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("14:10")
                Text("15:05")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("15:05")
                Text("16:00")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("16:00")
                Text("16:55")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(0.4f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("17:15")
                Text("18:10")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("18:10")
                Text("19:05")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("19:05")
                Text("20:00")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("20:00")
                Text("20:55")
            }
        }
        FlowColumn(maxItemsInEachColumn = 7, modifier = Modifier.weight(1f).fillMaxHeight()
        ) {
            Column(modifier = Modifier.fillMaxWidth().background(color = Color.White).weight(0.5f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Lunes",
                    fontSize = 11.sp,
                    textAlign = TextAlign.Center,
                    overflow = TextOverflow.Ellipsis,
                    maxLines = 1
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorProgramacion3)
                    .weight(2f)
                    .clipToBounds(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Programacion de servicios y procesos",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 3
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorProgramacion2)
                    .weight(1f)
                    .clipToBounds(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Accesso a datos",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 2
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = Color.LightGray)
                    .weight(0.4f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("")
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorProgramacion2)
                    .weight(1f)
                    .clipToBounds(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Accesso a datos",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    maxLines =2
                )
            }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(color = colorProgramacion)
                    .weight(3f)
                    .clipToBounds(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Desarollo de interfaces",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    maxLines = 2
                )
            }
        }
        FlowColumn(maxItemsInEachColumn = 7, modifier = Modifier.weight(1f)) {
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.White).weight(0.5f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text(text = "Martes", fontSize = 11.sp, textAlign = TextAlign.Center, overflow = TextOverflow.Ellipsis)
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.White).weight(0.6f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text(text = "", fontSize = 11.sp, textAlign = TextAlign.Center, overflow = TextOverflow.Ellipsis)

            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion4).weight(2.4f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("access")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(0.4f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion5).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("access")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color =  colorProgramacion9).weight(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("access")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion8).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("inter")
            }
        }
        FlowColumn(maxItemsInEachColumn = 6, modifier = Modifier.weight(1f)) {
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.White).weight(0.5f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text(text = "Miercoles", fontSize = 11.sp, textAlign = TextAlign.Center, overflow = TextOverflow.Ellipsis)
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.White).weight(0.6f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text(text = "", fontSize = 11.sp, textAlign = TextAlign.Center, overflow = TextOverflow.Ellipsis)

            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion8).weight(2.4f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("access")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(0.4f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion5).weight(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text("access")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.Blue).weight(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text("access")
            }
        }
        FlowColumn(maxItemsInEachColumn = 7, modifier = Modifier.weight(1f)) {
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.White).weight(0.5f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text(text = "Jueves", fontSize = 11.sp, textAlign = TextAlign.Center, overflow = TextOverflow.Ellipsis)
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion4).weight(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text(text = "pro", fontSize = 11.sp, textAlign = TextAlign.Center, overflow = TextOverflow.Ellipsis)

            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion7).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("access")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(0.4f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion6).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text("access")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion10).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text("access")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion).weight(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text("access")
            }
        }
        FlowColumn(maxItemsInEachColumn = 6, modifier = Modifier.weight(1f)) {
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.White).weight(0.5f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text(text = "Viernes", fontSize = 11.sp, textAlign = TextAlign.Center, overflow = TextOverflow.Ellipsis)
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.Cyan).weight(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text(text = "pro", fontSize = 11.sp, textAlign = TextAlign.Center, overflow = TextOverflow.Ellipsis)

            }
            Column (modifier = Modifier.fillMaxWidth().background(color =  colorProgramacion9).weight(1f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("access")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.LightGray).weight(0.4f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text("")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = colorProgramacion2).weight(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
                Text("access")
            }
            Column (modifier = Modifier.fillMaxWidth().background(color = Color.White).weight(2f), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center){
                Text(text = "", fontSize = 11.sp, textAlign = TextAlign.Center, overflow = TextOverflow.Ellipsis)

            }
        }
    }


}
}