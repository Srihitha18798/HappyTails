package com.example.happytails.component

import androidx.annotation.ColorRes
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun TopBar(){
    
    Row(modifier = Modifier.fillMaxWidth()) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "Hey Sri,",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.headlineMedium,
                color = MaterialTheme.colorScheme.surface
                )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Text(text = "Adopt a new friend near you!",
                textAlign = TextAlign.Start,
                style = MaterialTheme.typography.titleMedium,
                color = MaterialTheme.colorScheme.surface
                )
            
        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(0.dp, 24.dp, 36.dp, 0.dp),
            horizontalArrangement = Arrangement.End) {
            //WigglesThemeSwitch()
        }
    }

}

//@Composable
//fun WigglesThemeSwitch() {
//    val icon=if(isSystemInDarkTheme())
//        painterResource(id = R.drawable.)
//    else
//        painterResource(id = R.drawable)
//
//    Icon(painter = icon, contentDescription = null,
//        modifier = Modifier.size(24.dp,24.dp),
//        )
//}
