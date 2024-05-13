package com.dicoding.gameniteapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Stars
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dicoding.gameniteapp.data.DummyData
import com.dicoding.gameniteapp.data.Game

@Composable
fun DetailGameContent(newGamesList: List<Game>, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier, verticalArrangement = Arrangement.Center
    ) {
        Image(
            painter = painterResource(id = newGamesList[0].image),
            contentDescription = "Detail Image",
            modifier = Modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(10.dp))
        Column(
            modifier = Modifier.padding(
                paddingValues = PaddingValues(
                    start = 16.dp, end = 16.dp
                )
            )
        ) {
            Text(text = newGamesList[0].title, fontWeight = FontWeight.Bold, fontSize = 24.sp)
            Spacer(modifier = Modifier.height(4.dp))
            Row {
                Icon(
                    imageVector = Icons.Default.Stars,
                    contentDescription = "Icon Rating",
                    tint = Color.Magenta
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = newGamesList[0].rating.toString(),
                    fontWeight = FontWeight.Normal,
                    fontSize = 16.sp
                )
            }

            Spacer(modifier = Modifier.height(20.dp))
            Text("Description", fontWeight = FontWeight.Bold, fontSize = 20.sp)
            Spacer(modifier = Modifier.height(10.dp))
            Text(
                text = newGamesList[0].description, fontWeight = FontWeight.Normal, fontSize = 16.sp
            )
        }
    }
}

//@Preview
//@Composable
//private fun DetailGamePrev() {
//    DetailGameContent(newGamesList = DummyData.listGames)
//}