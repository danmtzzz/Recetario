package com.example.recetas.components


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TitleRecipe(name:String){
    Text(text = name, fontSize = 30.sp, color = Color.White)
}

@Composable
fun ImagenRecetas(descripcion:String, recetas:Int, border:Color){
    Image(
        painter = painterResource(recetas),
        contentDescription = descripcion,
        modifier = Modifier.padding(start = 120.dp,top = 70.dp)
                            .size(200.dp)
                            .clip(RoundedCornerShape(10))
                            .border(5.dp,border, RoundedCornerShape(10))



    )
}




