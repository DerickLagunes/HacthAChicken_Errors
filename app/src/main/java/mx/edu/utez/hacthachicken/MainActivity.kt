package mx.edu.utez.hacthachicken

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
import mx.edu.utez.hacthachicken.ui.screens.Pollo
import mx.edu.utez.hacthachicken.ui.screens.PolloViewModel
import mx.edu.utez.hacthachicken.ui.theme.HacthAChickenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        val viewModel = PolloViewModel()
        setContent {
            HacthAChickenTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Pollo(viewModel, Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HacthAChickenTheme {
        Greeting("Android")
    }
}