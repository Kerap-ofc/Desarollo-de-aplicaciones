package com.example.miproyectoalexmartinez

import com.example.miproyectoalexmartinez.components.layouts.Mirow
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.miproyectoalexmartinez.ui.theme.MiproyectoAlexMartinezTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiproyectoAlexMartinezTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Mirow(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
