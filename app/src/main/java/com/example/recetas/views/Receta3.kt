package com.example.recetas.views

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults.centerAlignedTopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.recetas.R
import com.example.recetas.components.ImagenRecetas
import com.example.recetas.components.MainButtonRecetas
import com.example.recetas.components.SpacerRow
import com.example.recetas.components.Spacers
import com.example.recetas.components.TitleRecipe

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Receta3(navController: NavController){
    Scaffold (
        topBar = {
            CenterAlignedTopAppBar(
                title = { TitleRecipe("Hot Cakes clásicos") },
                colors = centerAlignedTopAppBarColors(containerColor= Color(255, 102, 153))
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
        ImagenRecetas("Hot Cakes Clásicos", R.drawable.receta3, Color(255, 102, 153))
        Text(
            "     Ingredientes\n" +
                    "    3/4 Taza leche evaporada\n" +
                    "    1 Huevo\n" +
                    "    2 Cucharadas de mantequilla\n" +
                    "    1 Cucharada de vainilla\n" +
                    "    1 Taza de harina hot cakes\n"+
                    "    2 De mantequilla\n" +
                    "    1/2 Taza de moras azules\n" +
                    "    1/2 Taza de fresas\n" +
                    "    1 Envase de leche condensada\n" +
                    "   Elaboración paso a paso\n" +
                    "    Mezcla la leche evaporada\n"+
                    "    con el huevo, mantequilla\n" +
                    "    y harina para hot cakes\n" +
                    "    cocina por ambos lados \n"+
                    "    y repite el procedimiento\n"+
                    "    con el resto\n" +
                    "    de la preapración.\n",
            modifier = Modifier.padding(87.dp, 10.dp).background(
                Color.LightGray,
                RoundedCornerShape(10)
            )
        )
        Row {
            SpacerRow()
            MainButtonRecetas("Regresar", Color(255, 102, 153), Color.White) {
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
    //Receta3()
}