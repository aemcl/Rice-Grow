package com.example.ricewise

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ricewise.disease.DiseasesInfo
import com.example.ricewise.fertilizer.FertOne
import com.example.ricewise.fertilizer.FertThree
import com.example.ricewise.fertilizer.FertTwo
import com.example.ricewise.menubuttons.ListOfDisease
import com.example.ricewise.menubuttons.ListOfFertilizer
import com.example.ricewise.menubuttons.ListOfPest
import com.example.ricewise.menubuttons.TypeOfRice
import com.example.ricewise.pest.GreenLeafhoppers
import com.example.ricewise.pest.RiceBug
import com.example.ricewise.pest.RiceCaseworm
import com.example.ricewise.pest.RiceMealyBugs
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
                    Menu(navController)
                }

                composable(Routes.camera) {
                    CameraIdentifier(navController)
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

                composable(Routes.listfertilizer) {
                    ListOfFertilizer(navController)
                }

                composable(Routes.fertOne) {
                    FertOne(navController)
                }

                composable(Routes.fertTwo) {
                    FertTwo(navController)
                }

                composable(Routes.fertThree) {
                    FertThree(navController)
                }

                composable(Routes.listpest) {
                    ListOfPest(navController)
                }

                composable(Routes.greenleafhoppers) {
                    GreenLeafhoppers(navController)
                }

                composable(Routes.ricebug) {
                    RiceBug(navController)
                }

                composable(Routes.ricemealy) {
                    RiceMealyBugs(navController)
                }

                composable(Routes.caseworm) {
                    RiceCaseworm(navController)
                }

                composable(Routes.listdiseases) {
                    ListOfDisease(navController)
                }
            })

        }
    }
}

