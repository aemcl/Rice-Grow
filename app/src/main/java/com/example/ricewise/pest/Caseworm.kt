package com.example.ricewise.pest

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ricewise.R

@Composable
fun Caseworm() {

    Box(modifier = Modifier.fillMaxSize().background(Color(0xFFF5F5DC)))

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.Start
    ) {

        Image(
            painter = painterResource(id = R.drawable.blackbug),
            contentDescription = "Black Bug",
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .size(420.dp)
                .clip(RoundedCornerShape(50.dp))
        )

        Text(
            text = "Black Bug",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(start = 10.dp,top = 20.dp, bottom = 10.dp)
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "...............................................................................",
            fontSize = 15.sp,
            fontWeight = FontWeight.ExtraLight,

            modifier = Modifier.padding(start = 10.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF5F5DC))
                .padding(start = 10.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Best Planting Season",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "PLANTING MONTH", fontWeight = FontWeight.Bold,
            )

            Text(
                text = "May, June, July",
            )

            Spacer(modifier = Modifier.height(10.dp))

            Text(
                text = "HARVESTING MONTH", fontWeight = FontWeight.Bold,
            )

            Text(
                text = "Around 3 to 4 months (Between September and December)"
            )
        }
    }
}
