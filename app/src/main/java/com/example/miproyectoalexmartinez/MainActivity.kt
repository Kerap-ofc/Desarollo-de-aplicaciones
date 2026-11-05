package com.example.miproyectoalexmartinez

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.ui.Modifier
import com.example.miproyectoalexmartinez.components.layouts.Calculadora
import com.example.miproyectoalexmartinez.components.layouts.CheckBoxConText
import com.example.miproyectoalexmartinez.components.layouts.MiButton
import com.example.miproyectoalexmartinez.components.layouts.MiDropDownMenu
import com.example.miproyectoalexmartinez.components.layouts.MiExposedDropDownMenu
import com.example.miproyectoalexmartinez.components.layouts.MiImagen
import com.example.miproyectoalexmartinez.components.layouts.MiListaRadioButton
import com.example.miproyectoalexmartinez.components.layouts.MiRangeSlider
import com.example.miproyectoalexmartinez.components.layouts.MiSlider
import com.example.miproyectoalexmartinez.components.layouts.MiSliderAvanzado
import com.example.miproyectoalexmartinez.components.layouts.MiSwitch
import com.example.miproyectoalexmartinez.components.layouts.MiTextFieldPadre
import com.example.miproyectoalexmartinez.components.layouts.MyConstraintLayout
import com.example.miproyectoalexmartinez.components.layouts.MyFLowRowColumn
import com.example.miproyectoalexmartinez.components.layouts.MyPasswordTextField
import com.example.miproyectoalexmartinez.components.layouts.PadreCheckBoxes
import com.example.miproyectoalexmartinez.components.layouts.Progressobar
import com.example.miproyectoalexmartinez.components.layouts.TercerEstadoCheckBox
import com.example.miproyectoalexmartinez.ui.theme.MiproyectoAlexMartinezTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiproyectoAlexMartinezTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MiExposedDropDownMenu(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
