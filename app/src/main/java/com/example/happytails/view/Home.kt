package com.example.happytails.view

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.happytails.component.ItemDogCard
import com.example.happytails.model.Dog

@Composable
fun Home(dogList: List<Dog>) {
    LazyColumn {
        items(dogList){
            dogList.forEach {
                ItemDogCard(dog = it)
            }

        }
    }
    

}