package com.example.ricewise

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun RiceMenu(navController: NavController) {

    val size = 20.sp
    val height = 50.dp
    val width = 250.dp
    val spacer = 15.dp

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5DC))
            .padding(top = 50.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(5.dp))

        Spacer(modifier = Modifier.height(5.dp))
        Button(
            onClick = {navController.navigate(Routes.typeOfRice)},
            colors = ButtonDefaults.buttonColors(containerColor = Color(red = 0, green = 204, blue = 0)),
            modifier = Modifier
                .height(height)
                .width(width)
        ) {
            Text(text = "TYPE OF RICE", fontSize = size)
        }

        Spacer(modifier = Modifier.height(spacer))

        Button(
            onClick = {navController.navigate(Routes.listfertilizer)},
            colors = ButtonDefaults.buttonColors(containerColor = Color(red = 0, green = 204, blue = 0)),
            modifier = Modifier
                .height(height)
                .width(width)
        ) {
            Text(text = "FERTILIZER",fontSize = size)
        }

        Spacer(modifier = Modifier.height(spacer))

        Button(
            onClick = {navController.navigate(Routes.listpest)},
            colors = ButtonDefaults.buttonColors(containerColor = Color(red = 0, green = 204, blue = 0)),
            modifier = Modifier
                .height(height)
                .width(width)
        ) {
            Text(text = "PESTS",fontSize = size)
        }

        Spacer(modifier = Modifier.height(spacer))

        Button(
            onClick = {navController.navigate(Routes.listdiseases)},
            colors = ButtonDefaults.buttonColors(containerColor = Color(red = 0, green = 204, blue = 0)),
            modifier = Modifier
                .height(height)
                .width(width)
        ) {
            Text(text = "DISEASES", fontSize = size)
        }

    }//Column
}//fun RiceMenu