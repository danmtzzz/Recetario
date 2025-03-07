package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recetas.components.Spacers
import com.example.recetas.components.TitleRecipe
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.ui.layout.VerticalAlignmentLine
import androidx.navigation.NavController
import com.example.recetas.R
import com.example.recetas.components.ImagenRecetas
import com.example.recetas.components.MainButtonRecetas
import com.example.recetas.components.SpacerRow
import com.example.recetas.components.TextRecipe

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Receta1(navController: NavController){
Scaffold (
      topBar = {
            CenterAlignedTopAppBar(
                  title = { TitleRecipe("Aguachiles") },
                  colors = centerAlignedTopAppBarColors(containerColor= Color(0,153,204))
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
    ImagenRecetas("Aguachiles", R.drawable.receta1, Color(0, 153, 204))
}
        item {
            TextRecipe(
                "     Ingredientes\n" +
                        "    1 kg camarón crudo\n" +
                        "    1 ½ taza jugo de limón\n" +
                        "    1 cebolla morada\n" +
                        "    1 pepino\n" +
                        "    sal al gusto\n" +
                        "    pimienta al gusto\n" +
                        "    5 chiles serranos o habaneros\n" +
                        "    1 manojito cilantro\n" +
                        "    1 aguacate\n" +
                        "   Elaboración paso a paso\n" +
                        "    Licúa el cilantro, el limón, la sal, la\n" +
                        "    pimienta y la mitad de los chiles\n" +
                        "    Pica la cebolla en rodajas\n" +
                        "    delgaditas y mézclalo \n" +
                        "    con el preparado de tu licuadora\n" +
                        "    y el pepino en cubitos\n" +
                        "    Agrega los camarones\n" +
                        "      y la otra mitad\n" +
                        "    de chiles picados\n" +
                        "    Deja marinar por una hora\n" +
                        "    Decora con el aguacate\n", Color.LightGray, 60.dp, 25.dp
            )
        }
        item {
            Row {
                SpacerRow()
                MainButtonRecetas("Regresar", Color(0, 153, 204), Color.White) {
                    navController.popBackStack()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun GreetingPreview(){
      //Receta1()
}

