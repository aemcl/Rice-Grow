package com.example.ricewise.rice

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ricewise.R

@Composable
fun Pilit(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color(0xFFF5F5DC)))

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {
        OutlinedCard(
            border = BorderStroke(5.dp, Color.White),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFEBDA98)),
            modifier = Modifier
                .height(400.dp)
                .fillMaxWidth()
                .padding(top = 50.dp)
            // .clip(RoundedCornerShape(50.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.pilit),
                contentDescription = "Black Rice",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }

        Text(
            text = "Pilit (11022)",
            fontSize = 38.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(start = 10.dp,top = 20.dp, bottom = 10.dp)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "Pilit is a rice variety known for its high-quality grains and good cooking properties. " +
                    "It's often cultivated for its resilience to various environmental stresses and is " +
                    "favored in regions where specific taste and texture are desired.",
            fontSize = 20.sp,
            fontWeight = FontWeight.Light,
            modifier = Modifier.padding(start = 10.dp, end = 10.dp)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F5DC))
                .padding(start = 10.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                text = "PLANTING MONTH:", fontWeight = FontWeight.Normal, fontStyle = FontStyle.Italic, fontSize = 18.sp
            )

            Text(
                text = "May" + "\n" +"June" +"\n" + "July" +"\n" + "August",
                fontWeight = FontWeight.Light,
                fontSize = 18.sp
            )

            Spacer(modifier = Modifier.height(20.dp))

            Text(
                text = "HARVESTING MONTH:", fontWeight = FontWeight.Normal, fontStyle = FontStyle.Italic, fontSize = 18.sp
            )

            Text(
                text = "Around 3 to 4 Months (Between September & December)",fontWeight = FontWeight.Light, fontSize = 18.sp
            )
        }
    }
}
