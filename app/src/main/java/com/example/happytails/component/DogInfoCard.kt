package com.example.happytails.component

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
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.happytails.R

@Composable
fun DogInfoCard(name:String,gender:String,location:String){
    
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        
        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Text(text = name,
                modifier = Modifier.padding(0.dp,0.dp,12.dp,0.dp),
                color = MaterialTheme.colorScheme.contentColorFor(colorResource(id = R.color.text)),
                fontWeight = FontWeight.Bold,
                style = MaterialTheme.typography.headlineMedium
                )
            Spacer(modifier = Modifier.height(8.dp))
            
            Row(verticalAlignment = Alignment.Bottom) {
                val locationIcon:Painter= painterResource(id = R.drawable.ic_location)

                Icon(painter = locationIcon, contentDescription = null,
                    modifier = Modifier.size(16.dp,16.dp),
                    tint = Color.Red
                    )
                Text(text = location,
                    modifier = Modifier.padding(8.dp,12.dp,12.dp,0.dp),
                    color = MaterialTheme.colorScheme.contentColorFor(colorResource(id = R.color.text)),
                    style = MaterialTheme.typography.labelSmall
                    )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(text = "12 mins ago",
                modifier = Modifier.padding(0.dp,0.dp,12.dp,0.dp),
                color = MaterialTheme.colorScheme.contentColorFor(colorResource(id = R.color.text)),
                style = MaterialTheme.typography.bodySmall
                )
        }
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End
        ) {
            GenderTag(name = gender)

        }
        
    }
    
}