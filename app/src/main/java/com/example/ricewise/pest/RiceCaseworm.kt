package com.example.ricewise.pest

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.ricewise.R
import com.example.ricewise.descriptions.PestDescription

@Composable
fun RiceCaseworm(navController: NavController){
    PestDescription(
        pestName = "Rice Caseworm Nymphula depunctalis (Guenee)",
        pestDescription = "The damaged leaf tissue looks like ladder. Case worm larvae scraps chlorophyll from leaves. Another important symptom is the larvae cuts off leaf tips and make cylindrical tubes around them. " +
                "In infected field you can see cylindrical tubes attached to plants or floating on water surface.",
        pestImage = R.drawable.caseworm,
        management = "Drain water to remove floating larvae from field. Follow proper cultivation practices like nitrogen application and spacing. " +
                "Encourage biological control agents like snails, spiders, lady bird beetles, dragon flies in rice field."
    )
}