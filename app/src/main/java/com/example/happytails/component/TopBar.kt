package com.example.happytails.component

import androidx.annotation.ColorRes
import androidx.compose.foundation.clickable
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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.happytails.R

@Composable
fun TopBar(onToggle:()->Unit){
    
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
            WigglesThemeSwitch(onToggle={onToggle()})
        }
    }

}

@Composable
fun WigglesThemeSwitch(onToggle: () -> Unit) {
    val icon=if(isSystemInDarkTheme())
        painterResource(id = R.drawable.ic_light_off)
    else
        painterResource(id = R.drawable.ic_light_on)

    Icon(painter = icon, contentDescription = null,
        modifier = Modifier
            .size(40.dp, 40.dp)
            .clickable(onClick = onToggle)
        , tint = colorResource(id = R.color.text)
        )
}
