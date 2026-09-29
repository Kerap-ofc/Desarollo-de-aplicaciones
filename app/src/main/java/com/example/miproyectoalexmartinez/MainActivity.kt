package com.example.miproyectoalexmartinez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.miproyectoalexmartinez.components.layouts.constraintLayout
import com.example.miproyectoalexmartinez.ui.theme.MiproyectoAlexMartinezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiproyectoAlexMartinezTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    constraintLayout(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
