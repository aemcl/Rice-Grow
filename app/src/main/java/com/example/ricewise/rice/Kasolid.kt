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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.ricewise.R
import com.example.ricewise.descriptions.RiceDescription

@Composable

fun Kasolid() {
    RiceDescription(
        riceName = "Kasolid (11026)",
        riceDescription = "Kasolid (11026) is a variety of rice seed known for its high yield" +
                " and adaptability to various growing conditions. It's often used in breeding " +
                "programs due to its desirable traits, such as disease resistance and grain quality." ,
        riceImage = R.drawable.kasolid,
        plantingMonth = "May\nJune\nJuly\nAugust",
        harvestingMonth = "Around 3 to 4 Months (Between September & December)"
    )
}
