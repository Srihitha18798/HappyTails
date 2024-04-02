package com.example.happytails.view

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.happytails.data.FakeDatabase
import com.example.happytails.navigation.Screen

@Composable
fun Main(toggleTheme:()->Unit){
    val navController=rememberNavController()

    NavHost(navController = navController, startDestination = Screen.Home.route) {
        composable(Screen.Home.route
            ){
            Home(navController= navController,dogList = FakeDatabase.dogList,toggleTheme)
        }
        composable("${Screen.Detail.route}/{id}/{title}/{location}", arguments = listOf(navArgument("id"){type=
            NavType.IntType})){
            Detail(navController = navController, id = it.arguments?.getInt("id")?:0)
        }

    }
}