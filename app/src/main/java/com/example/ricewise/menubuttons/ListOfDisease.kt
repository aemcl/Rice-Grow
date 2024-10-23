package com.example.ricewise.menubuttons

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ricewise.CameraIcon
import com.example.ricewise.Routes

@Composable
fun ListOfDisease(navController: NavController) {

    val diseaseList = listOf(
        "Whitehead" to Routes.whitehead,
        "Bacterial leaf streak" to Routes.streak,
        "Bacterial blight infected leaf" to Routes.blight,
        "Bakanae infected plant in rice" to Routes.bakanae,
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

        Text(text = "DISEASES", fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(start = 10.dp, top = 10.dp, bottom = 30.dp))
        diseaseList.forEach { (diseaseName, route) ->
            MenuButton(
                text = diseaseName,
                navController = navController,
                destinationRoute = route
            )
            Spacer(modifier = Modifier.height(30.dp))
        }
    }
    CameraIcon(navController)
}
