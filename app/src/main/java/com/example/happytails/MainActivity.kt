package com.example.happytails

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.happytails.data.FakeDatabase
import com.example.happytails.ui.theme.HappyTailsTheme
import com.example.happytails.view.Home

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyTailsTheme {
              MyApp()
            }
        }
    }
}

@Composable
fun MyApp(){

    val navController= rememberNavController()

    NavHost(navController = navController, startDestination = "home"){
        composable(route="home"){
            Home(FakeDatabase.dogList)
        }
    }

}