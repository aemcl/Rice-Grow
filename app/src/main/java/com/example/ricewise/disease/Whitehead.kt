package com.example.ricewise.disease


import androidx.compose.runtime.Composable
import com.example.ricewise.descriptions.DiseaseDescription
import com.example.ricewise.R

@Composable
fun DiseasesInfo() {
    DiseaseDescription(
        diseaseName = "",
        diseaseDescription = "",
        diseaseImage = R.drawable.d,
        treatment = ""
    )
}
