package com.jyotimoykashyap.meditationapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.jyotimoykashyap.meditationapp.R
import com.jyotimoykashyap.meditationapp.ui.theme.ButtonBlue
import com.jyotimoykashyap.meditationapp.ui.theme.DarkerButtonBlue
import com.jyotimoykashyap.meditationapp.ui.theme.DeepBlue
import com.jyotimoykashyap.meditationapp.ui.theme.TextWhite

@Composable
fun HomeScreen(){
    Box(modifier = Modifier
        .background(DeepBlue)
        .fillMaxSize()){
        Column {
            GreetingSection()
            ChipSection(chips = listOf("Sweet Sleep" , "Depression" , "Insomnia"))
        }
    }
}

@Composable
fun GreetingSection(
    name: String = "Jyotimoy"
){
    Row (
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ){
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Good Morning, $name",
                style = MaterialTheme.typography.h2
            )
            Text(
                text = "We wish you have a good day",
                style = MaterialTheme.typography.body1
            )


        }

        Icon(painter = painterResource(id = R.drawable.ic_search),
            contentDescription = "Search",
            tint = Color.White,
            modifier = Modifier.size(24.dp)
        )
    }
}

@Composable
fun ChipSection(
    chips: List<String>
){
    var selectedChinIndex by remember {
        mutableStateOf(0)
    }

    LazyRow {
        items(chips.size){
            Box(
                modifier = Modifier
                    .padding(start = 15.dp, top = 15.dp, bottom = 15.dp)
                    .clickable {
                        selectedChinIndex = it
                    }
                    .clip(RoundedCornerShape(10.dp))
                    .background(
                        if (selectedChinIndex == it) ButtonBlue
                        else DarkerButtonBlue
                    )
                    .padding(15.dp),
                contentAlignment = Alignment.Center
            ){
                Text(text = chips[it], color = TextWhite)
            }

        }
    }
}
