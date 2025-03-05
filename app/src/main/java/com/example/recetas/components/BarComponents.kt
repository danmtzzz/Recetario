package com.example.recetas.components

import android.graphics.drawable.Drawable
import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
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
import com.example.recetas.R

@Composable
fun TitleRecipe(name:String){
    Text(text = name, fontSize = 30.sp, color = Color.White)
}

@Composable
fun ImagenRecetas(descripcion:String, recetas:Int, border:Color){
    Image(
        painter = painterResource(recetas),
        contentDescription = descripcion,
        modifier = Modifier.padding(100.dp,70.dp)
                            ./*size(200.dp)*/fillMaxWidth()
                            .clip(RoundedCornerShape(10))
                            .border(5.dp,border, RoundedCornerShape(10))



    )
}




