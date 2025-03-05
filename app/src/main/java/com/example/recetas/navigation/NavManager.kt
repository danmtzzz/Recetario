package com.example.recetas.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.recetas.views.HomeView
import com.example.recetas.views.Receta1
import com.example.recetas.views.Receta2
import com.example.recetas.views.Receta3
import com.example.recetas.views.Receta4

@Composable
fun NavManager(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){
            HomeView(navController)
        }
        composable("Receta 1"){
            Receta1(navController)
        }
        composable("Receta 2"){
            Receta2(navController)
        }
        composable("Receta 3"){
            Receta3(navController)
        }
        composable("Receta 4"){
            Receta4(navController)
        }
    }
}