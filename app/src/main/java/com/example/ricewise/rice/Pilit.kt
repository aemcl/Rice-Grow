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
import com.example.ricewise.descriptions.RiceDescription

@Composable
fun Pilit(){
  RiceDescription(
      riceName = "Pilit (11022)",
      riceDescription = "Pilit (11022) is a rice variety known for its high-quality grains " +
              "and good cooking properties. It's often cultivated for its resilience to various " +
              "environmental stresses and is favored in regions where specific taste and texture are desired.",
      riceImage = R.drawable.pilit,
      plantingMonth = "May\nJune\nJuly\nAugust" ,
      harvestingMonth = "Around 3 to 4 Months (Between September & December)"
  )
}
