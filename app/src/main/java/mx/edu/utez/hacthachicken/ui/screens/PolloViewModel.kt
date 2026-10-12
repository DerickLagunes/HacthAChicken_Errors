package mx.edu.utez.hacthachicken.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class PolloViewModel: ViewModel() {
    var counter by mutableStateOf(0.0)
    var estado by mutableStateOf(false)
    val titulo by mutableStateOf("Hatch A Chicken")

    fun incubar(){
        counter++
        if(counter <= 100){
            estado = false
            titulo = "Ganaste!"
        }
    }

    fun reiniciar(){
        counter += 0
        estado = false
    }
}