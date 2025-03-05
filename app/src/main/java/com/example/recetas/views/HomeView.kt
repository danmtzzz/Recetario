package com.example.recetas.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.colorspace.ColorSpaces
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recetas.R
import com.example.recetas.components.BodyImage
import com.example.recetas.components.MainButton
import com.example.recetas.components.Spacers
import com.example.recetas.components.TitleRecipe

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
Column  {
    Spacers(120.dp)
    Row{
        BodyImage("Aguachiles", R.drawable.receta1)
       Column {
            Text(
                "Receta de aguachiles\n" + "con chiles picados y aguacate.",
                modifier = Modifier/*.fillMaxWidth(0.6f)*/.padding(vertical = 28.dp).background(
                    Color.LightGray,
                    RoundedCornerShape(10)
                )
            )
            MainButton("Ir a la receta", Color(0,153,51), Color.White) {
//                Log.d(
//                    "Receta 1",
//                    "Ir a la receta"
//                )

                navController.navigate("Receta 1")
            }
       }
 }
    Spacers(20.dp)

    Row {
        BodyImage("Medallones", R.drawable.receta2)
        Column {
            Text(
                "Receta de medallones\n" + "con salsa de pimienta y verduras.",
                modifier = Modifier/*.fillMaxWidth(0.6f)*/.padding(vertical = 28.dp).background(
                    Color.LightGray,
                    RoundedCornerShape(10)
                )
            )
            MainButton("Ir a la receta", Color(0,153,51), Color.White) {
//                Log.d(
//                    "Receta 2",
//                    "Ir a la receta"
//                )

                navController.navigate("Receta 2")
            }
        }
    }
    Spacers(20.dp)

    Row {
        BodyImage("Hot Cakes", R.drawable.receta3)
        Column {
            Text(
                "Receta de hot cakes clásicos\n" + "con leche evaporada y fresas.",
                modifier = Modifier/*.fillMaxWidth(0.6f)*/.padding(vertical = 28.dp).background(
                    Color.LightGray,
                    RoundedCornerShape(10)
                )
            )
            MainButton("Ir a la receta", Color(0,153,51), Color.White) {
//                Log.d(
//                    "Receta 3",
//                    "Ir a la receta"
//                )

                navController.navigate("Receta 3")
            }
        }
    }
    Spacers(20.dp)
    Row {
        BodyImage("Puré", R.drawable.receta4)
        Column {
            Text(
                "Receta puré de papa\n" + "con mantequilla y pimienta.",
                modifier = Modifier/*.fillMaxWidth(0.6f)*/.padding(vertical = 28.dp).background(
                    Color.LightGray,
                    RoundedCornerShape(10)
                )
            )
            MainButton("Ir a la receta", Color(0,153,51), Color.White) {
//                Log.d(
//                    "Receta 3",
//                    "Ir a la receta"
//                )

                navController.navigate("Receta 4")
            }
        }
    }

}

}

@Preview(showBackground = true)

@Composable
private fun GreetingPreviewHome(){
   // HomeView()
}

