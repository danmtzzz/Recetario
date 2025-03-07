package com.example.recetas.views

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
import com.example.recetas.components.BodyImage
import com.example.recetas.components.MainButton
import com.example.recetas.components.RecipeDescription
import com.example.recetas.components.RecipeName
import com.example.recetas.components.Spacers
import com.example.recetas.components.TitleRecipe
import java.lang.reflect.Modifier

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeView(navController: NavController){
    Scaffold(
        topBar ={
            CenterAlignedTopAppBar(
                title = { TitleRecipe("Inicio") },
                colors = centerAlignedTopAppBarColors(
                    containerColor = Color(0,153,51)
                )
            )
        }
    )
        { ContentView(navController) }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun ContentView(navController: NavController){
Column  (modifier = androidx.compose.ui.Modifier.verticalScroll(rememberScrollState())){
    Spacers(120.dp)
    Row{
        BodyImage("Aguachiles", R.drawable.receta1)
       Column {
           RecipeName("Aguachiles",50.dp,8.dp)
            RecipeDescription(
                "Receta de aguachiles\n" + "con chiles picados y aguacate.",
                          24.dp,Color.White)
            MainButton("Ir a la receta", Color(0,153,51), Color.White) {
                navController.navigate("Receta 1")
            }
       }
 }
    Spacers(20.dp)

    Row {
        BodyImage("Medallones", R.drawable.receta2)
        Column {
            RecipeName("Medallones", 50.dp,5.dp)
            RecipeDescription(
                "Receta de medallones\n" + "con salsa de pimienta y verduras.",
                            24.dp
                            ,Color.White
            )
            MainButton("Ir a la receta", Color(0,153,51), Color.White) {

                navController.navigate("Receta 2")
            }
        }
    }
    Spacers(20.dp)

    Row {
        BodyImage("Hot Cakes", R.drawable.receta3)
        Column {
            RecipeName("Hot Cakes", 50.dp, 5.dp)
            RecipeDescription("Receta de hot cakes clásicos\n" + "con leche evaporada y fresas.",
                           24.dp,Color.White
            )
            MainButton("Ir a la receta", Color(0,153,51), Color.White) {
                navController.navigate("Receta 3")
            }
        }
    }
    Spacers(20.dp)
    Row {
        BodyImage("Puré", R.drawable.receta4)
        Column {
            RecipeName("Puré de papa", 35.dp, 5.dp)
            RecipeDescription("Receta puré de papa\n" + "con mantequilla y pimienta.",
                                        24.dp, Color.White)
            MainButton("Ir a la receta", Color(0,153,51), Color.White) {
                navController.navigate("Receta 4")
            }
        }
    }

}

}

@Preview(showBackground = true)

@Composable
private fun GreetingPreviewHome(){
    //HomeView()
}

