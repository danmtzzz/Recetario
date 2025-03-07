package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recetas.R
import com.example.recetas.components.ImagenRecetas
import com.example.recetas.components.MainButtonRecetas
import com.example.recetas.components.SpacerRow
import com.example.recetas.components.Spacers
import com.example.recetas.components.TextRecipe
import com.example.recetas.components.TitleRecipe

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Receta4(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleRecipe("Puré de Papa") },
                colors = centerAlignedTopAppBarColors(containerColor= Color(204, 255, 51))
            )
        }

    ){
        ContentView(navController)
    }


}

@Composable
private fun ContentView(navController: NavController) {
    LazyColumn {
        item {
            Spacers(50.dp)
            ImagenRecetas("Hot Cakes Clásicos", R.drawable.receta4, Color(204, 255, 51))
        }
        item {
            TextRecipe(
                "     Ingredientes\n" +
                        "    6 Papas peladas y cocidas\n" +
                        "    1 Envase de Leche Evaporada\n" +
                        "    2 Cucharadas de mantequilla\n" +
                        "    1 Cucharada consomé de pollo\n" +
                        "    1/2 Cucharada de pimienta negra\n" +
                        "   Elaboración paso a paso\n" +
                        "    Machaca las papas\n" +
                        "    y agrega la leche evaporada\n" +
                        "    con el consomé y pimienta\n" +
                        "    cocina por 5 minutos\n" +
                        "    y sirve como guarnición\n", Color.LightGray, 97.dp, 10.dp
            )
        }
        item {
            Row {
                SpacerRow()
                MainButtonRecetas("Regresar", Color(204, 255, 51), Color.White) {

                    navController.popBackStack()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun GreetingPreview(){
    //Receta4()
}