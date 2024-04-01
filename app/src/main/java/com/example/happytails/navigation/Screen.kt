package com.example.happytails.navigation

import androidx.annotation.StringRes
import com.example.happytails.R

sealed class Screen(val route:String,@StringRes val resourceId:Int){
    object Home:Screen("home", R.string.text_home)
    object Detail:Screen("detail", R.string.text_details)

}