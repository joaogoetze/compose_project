package com.example.compose_project

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose_project.ui.theme.Compose_projectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Compose_projectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    //CHAMA O COMPONENTE VISUAL
                   App()
                }
            }
        }
    }
}

//Meu componente visual "APLICATIVO"
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App(){
            //Modifier: é o que permite a edição do elemento, no caso: a coluna
    Column(
        Modifier
            .background(color = Color(0xFF6650a4))
            .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
        Column(
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Gasolina ou Alcool?", style = TextStyle(
                    color = Color.White,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(text = "Gasolina", style = TextStyle(
                color = Color.Red,
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            ))
            TextField(value = "2.00", onValueChange = {})
            TextField(value = "2.00", onValueChange = {})
        }
    }

    //Mantem os elementos um em cima do outro
    //Box{
        //Text(text = "Alcool ou Gasolina")
        //Text(text = "Gasolina")
    //}

    //Mantem os iconer um abaixo do outro

    //Mantem os elemntos um ao lado do outro
    //Row{
        //Text(text = "Alcool ou Gasolina")
        //Text(text = "Gasolina")
    //}


}

@Preview
@Composable
fun AppPreview(){
    Compose_projectTheme{
        App()
    }
}