package com.example.happytails

import android.app.AppComponentFactory
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatDelegate
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.happytails.data.FakeDatabase
import com.example.happytails.ui.theme.HappyTailsTheme
import com.example.happytails.view.Home
import com.example.happytails.view.Main

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val currentTheme= isSystemInDarkTheme()
            val toggleTheme:()->Unit={
                if(currentTheme) setDayTheme() else setDarkTheme()
            }
            HappyTailsTheme {
              Surface(color = MaterialTheme.colorScheme.background) {
                  Main(toggleTheme)
              }
            }
        }
    }
    private fun setDayTheme(){
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)

    }
    private fun setDarkTheme(){
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)

    }
}



