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
fun Receta2(navController:NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleRecipe("Medallones en salsa") },
                colors = centerAlignedTopAppBarColors(containerColor= Color(255,153,51))
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
            ImagenRecetas("Aguachiles", R.drawable.receta2, Color(255, 153, 51))
        }
        item {
            TextRecipe(
                "     Ingredientes\n" +
                        "    2 cucharadas de mantequilla\n" +
                        "    2 cucharadas de cebolla picada\n" +
                        "    1/2 pieza de ajo\n" +
                        "    3 Cucharadas Harina de trigo\n" +
                        "    2 Tazas Leche Evaporada\n" +
                        "    CARNATION® CLAVEL®\n" +
                        "    2 Cucharadas Pimienta blanca\n" +
                        "    1 1/2 Cucharada Consomé de\n" +
                        "    pollo en polvo\n" +
                        "    8 Piezas Filete de res\n" +
                        "    medallones fritos\n" +
                        "   Elaboración paso a paso\n" +
                        "    Calienta la mantequilla y\n" +
                        "    sofríe la\n" +
                        "    cebolla con el ajo\n" +
                        "    Licua la leche con\n" +
                        "    la cebolla frita y pimienta \n" +
                        "    ccocina de 10 a 15 minutos\n" +
                        "    retira el fuego y cuela\n" +
                        "    Sirve los medallones con la\n" +
                        "    salsa caliente\n" +
                        "    acompaña con verduras\n", Color.LightGray, 68.dp, 10.dp
            )
        }
        item {
            Row {
                SpacerRow()
                MainButtonRecetas("Regresar", Color(255, 153, 51), Color.White) {

                    navController.popBackStack()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun GreetingPreview(){
    //Receta2()
}