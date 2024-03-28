package com.example.happytails.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.happytails.component.ItemDogCard
import com.example.happytails.component.TopBar
import com.example.happytails.model.Dog

@Composable
fun Home(dogList: List<Dog>) {
    LazyColumn(
        modifier = Modifier.background(Color.Gray)
    ) {
        item {
            TopBar()
            Spacer(modifier = Modifier.height(8.dp))
        }
        items(dogList) {
            dogList.forEach {
                ItemDogCard(dog = it)
            }

        }
    }


}