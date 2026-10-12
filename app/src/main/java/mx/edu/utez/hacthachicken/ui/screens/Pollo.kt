package mx.edu.utez.hacthachicken.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.R
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.edu.utez.hacthachicken.ui.theme.HacthAChickenTheme

@Composable
fun Pollo(
    viewModel: PolloViewModel,
){
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize()
    ){
        Text(
            viewModel.titulo,
            style = MaterialTheme.typography.titleLarge,
            color = if (viewModel.estado) Color.Green else Color.Black
        )
        Spacer(Modifier.height(900.dp))
        Image(
            painter = painterResource(if (viewModel.estado) R.drawable.pollito else R.drawable.huevo),
            contentDescription = ""
        )
        Spacer(Modifier.height(20.dp))
        Text("${viewModel.counter} / 100")
        Spacer(Modifier.height(900.dp))
        if(viewModel.estado){
            Button({viewModel.reiniciar()}){
                Text("Reiniciar juego")
            }
        }else{
            Button({viewModel.incubar()}) {
                Text("Incubar")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PolloPreview(){
    HacthAChickenTheme() {
        Pollo(PolloViewModel())
    }
}