package com.example.recetas.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.recetas.components.Spacers
import com.example.recetas.components.TitleBody
import com.example.recetas.components.TitleRecipe
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.TextField
import androidx.compose.ui.Alignment
import androidx.navigation.NavController
import com.example.recetas.R
import com.example.recetas.components.ImagenRecetas
import com.example.recetas.components.MainButton
import com.example.recetas.components.MainButtonRecetas
import com.example.recetas.components.SpacerRow

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
    Column {
        Spacers(50.dp)
        ImagenRecetas("Aguachiles", R.drawable.receta1,Color(0,153,204))
        Text(
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
                    "    Licúa el cilantro, el limón, la sal, la\n"+
                    "    pimienta y la mitad de los chiles\n" +
                    "    Pica la cebolla en rodajas\n" +
                    "    delgaditas y mézclalo \n"+
                    "    con el preparado de tu licuadora\n"+
                    "    y el pepino en cubitos\n" +
                    "    Agrega los camarones y la otra mitad\n"+
                    "    de chiles picados\n" +
                    "    Deja marinar por una hora\n" +
                    "    Decora con el aguacate\n",
            modifier = Modifier.padding(75.dp, 10.dp).background(Color.LightGray,
                RoundedCornerShape(10)
            )
        )
        Row {
            SpacerRow()
            MainButtonRecetas("Regresar", Color(0,153,204), Color.White) {
//                Log.d(
//                    "Home",
//                    "Soy un boton generico"
//                )
                navController.popBackStack()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun GreetingPreview(){
      //Receta1()
}

