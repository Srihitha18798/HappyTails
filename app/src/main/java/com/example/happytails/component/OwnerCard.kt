package com.example.happytails.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.happytails.R

@Composable
fun OwnerCard(name:String,bio:String,image:Int){
    
    Row(modifier = Modifier
        .fillMaxWidth()
        .padding(16.dp)) {
        
        val personImage:Painter= painterResource(id = image)
        
        Image(
            modifier = Modifier
                .size(60.dp, 60.dp)
                .clip(RoundedCornerShape(16.dp)),
            painter = personImage, contentDescription = "",
            alignment = Alignment.CenterStart,
            contentScale = ContentScale.Crop
        )
        
        Spacer(modifier = Modifier.width(16.dp))
        
        Column(modifier = Modifier) {
            Text(text = name,
                color = colorResource(id = R.color.text),
                style = MaterialTheme.typography.headlineMedium,
                fontWeight = FontWeight.W600,
                textAlign = TextAlign.Start
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = bio,
                color = colorResource(id = R.color.text),
                style = MaterialTheme.typography.labelSmall
            )
            
        }
        Row(modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.End) {
            FloatingActionButton(
                modifier = Modifier.size(40.dp),
                onClick = { /*TODO*/ },
                containerColor = colorResource(id = R.color.blue)
                ) {
                
                val owner:Painter= painterResource(id = R.drawable.ic_messanger)
                Icon(
                    modifier = Modifier.size(20.dp),
                    painter = owner, contentDescription = "",
                    tint = Color.White
                )
                
            }

        }
        
    }
    
}