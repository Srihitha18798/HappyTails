package com.example.happytails.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.happytails.R

@Composable
fun InfoCard(title:String,value:String){

    Box(modifier = Modifier
        .size(90.dp)
        .clip(RoundedCornerShape(12.dp))
        .background(color = colorResource(id = R.color.card))
        .padding(12.dp),
        ){
        Column(verticalArrangement = Arrangement.Center,
            modifier = Modifier.wrapContentWidth()) {
            Text(text = value,
                modifier = Modifier.fillMaxWidth(),
                color = colorResource(id = R.color.text),
                style = MaterialTheme.typography.bodyLarge,
                fontWeight = FontWeight.W600,
                textAlign = TextAlign.Center
                )

            Spacer(modifier = Modifier.height(4.dp))

            Text(text = title,
                modifier = Modifier.fillMaxWidth(),
                color = Color.Gray,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center
                )


        }
    }

}
