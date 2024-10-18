package com.example.ricewise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ricewise.disease.DiseasesInfo
import com.example.ricewise.fertilizer.FertilizerInfo
import com.example.ricewise.pest.Adult
import com.example.ricewise.pest.Caseworm
import com.example.ricewise.pest.RiceStemBorer
import com.example.ricewise.pest.Scirpophaga
import com.example.ricewise.rice.BlackRice
import com.example.ricewise.rice.Dinorado
import com.example.ricewise.rice.Kasolid
import com.example.ricewise.rice.Pilit

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = Routes.home, builder = {
                composable(Routes.home){
                    Home(navController)
                }

                composable(Routes.typeOfRice) {
                    TypeOfRice(navController)
                }

                composable(Routes.help) {
                    Help()
                }

                composable(Routes.menu) {
                    RiceMenu(navController)
                }

                composable(Routes.blackrice) {
                    BlackRice()
                }

                composable(Routes.kasolid) {
                    Kasolid()
                }

                composable(Routes.pilit) {
                    Pilit()
                }

                composable(Routes.dinorado) {
                    Dinorado()
                }

                composable(Routes.ricestemborer) {
                    RiceStemBorer()
                }

                composable(Routes.scirpophaga) {
                    Scirpophaga()
                }

                composable(Routes.caseworm) {
                    Caseworm()
                }

                composable(Routes.adult) {
                    Adult()
                }

                composable(Routes.listfertilizer) {
                    ListOfFertilizer(navController)
                }

                composable(Routes.listpest) {
                    ListOfPest(navController)
                }

                composable(Routes.listdiseases) {
                    ListOfDisease(navController)
                }

                composable(Routes.fertInfo) {
                    FertilizerInfo()
                }

                composable(Routes.diseaseInfo) {
                    DiseasesInfo()
                }
            })

        }
    }
}

