package com.example.recetas.components

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recetas.R

@Composable
fun TitleBody(name:String){
    Text(text=name,fontSize=30.sp,color= Color.Black)
}

@Composable
fun Spacers(height: Dp){
    Spacer(modifier = Modifier.height(height))
}

@Composable
fun MainButton(name:String, backColor:Color,color:Color,onClick:()->Unit){
Button(onClick=onClick, colors=ButtonDefaults.buttonColors(
    contentColor = color,
    containerColor = backColor),
    modifier = Modifier.size(width = 180.dp,height = 50.dp).padding(start = 17.dp, end = 17.dp))
    {Text(text=name) }
}

@Composable
fun SpacerRow(){
    Spacer(modifier = Modifier.width(115.dp))
}
@Composable
fun MainButtonRecetas(name:String, backColor:Color,color:Color,onClick:()->Unit){
    Button(onClick=onClick, colors=ButtonDefaults.buttonColors(
        contentColor = color,
        containerColor = backColor),
        modifier = Modifier.size(width = 180.dp,height = 50.dp))
    {Text(text=name) }
}

@Composable
fun BodyImage(description:String,receta:Int){
    Image(
        painter = painterResource(receta),
        contentDescription = description,
        modifier = Modifier.padding(15.dp)
                            .size(130.dp)
                            .clip(RoundedCornerShape(10))
                            .border(5.dp,Color(0,153,51), RoundedCornerShape(10))
    )
}
