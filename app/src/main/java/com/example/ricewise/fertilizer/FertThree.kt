package com.example.ricewise.fertilizer

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.ricewise.R
import com.example.ricewise.descriptions.FertilizerDescription

@Composable
fun FertThree(navController: NavController) {
    FertilizerDescription(
        fertilizerName = "46-0-0 + 0-0-60",
        fertilizerDescription = " Provides aids in the development of strong root systems, enhances drought tolerance, and improves nutrient uptake." ,
        fertilizerImage = R.drawable.fertthree,
        usage = "• 45-55 Days(Conception/Pregnant)\n" +
                "•  for the 46-0-0 it takes 1.5-2 sacks\n" +
                "    for the 0-0-60 it takes 1-2 sacks"
    )
}