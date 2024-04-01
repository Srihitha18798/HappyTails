package com.example.happytails.view

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.happytails.data.FakeDatabase
import com.example.happytails.navigation.Screen

@Composable
fun Main(){
    val navController=rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route){
            Home(navController= navController,dogList = FakeDatabase.dogList)
        }
        composable("${Screen.Detail.route}/{id}/{title}/{location}"){
            Detail(navController = navController, id = it.arguments?.getInt("id")?:0)
        }

    }
}