package com.example.ricewise

import android.graphics.drawable.Icon
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign

@Composable
fun ListOfFertilizer(navController: NavController) {

    val h = 40.dp
    val w = 350.dp
    val buttonModifier = Modifier
        .height(h)
        .width(w)
    val defaultTextColor = Color.Black

    val fertilizerList = listOf(
        "21-0-0+24" to Routes.fertOne,
        "46-0-0" to Routes.fertTwo,
        "18-46-0" to Routes.fertThree,
        "14-14-14" to Routes.fertFour,
        "16-20-0" to Routes.fertFive,
        "0-0-60" to Routes.fertSix,

        // Add other rice types and their routes as needed
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5DC))
            .verticalScroll(rememberScrollState())
            .padding(top = 50.dp, bottom = 30.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "FERTILIZERS", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 30.dp))
        fertilizerList.forEach { (item, route) ->
            FertilizerButton(
                text = item,
                textColor = defaultTextColor,
                buttonModifier = buttonModifier,
                navController = navController,
                destinationRoute = route
            )
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
}

@Composable
fun FertilizerButton(
    text: String,
    textColor: Color,
    buttonModifier: Modifier,
    navController: NavController,
    destinationRoute: String
) {
    Button(
        onClick = { navController.navigate(destinationRoute) },
        shape = RoundedCornerShape(30.dp),
        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF5F5B0)),
        modifier = buttonModifier
//            .border(
//                BorderStroke(1.dp, Color.LightGray),
//                shape = RoundedCornerShape(30.dp)
//            )
    ) {
        Row(
            Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            Text(text = text, fontSize = 20.sp, color = textColor, fontWeight = FontWeight.Light)
        }
    }
}
