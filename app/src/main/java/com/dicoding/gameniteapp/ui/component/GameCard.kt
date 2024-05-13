package com.dicoding.gameniteapp.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Stars
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dicoding.gameniteapp.data.Game

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameCard(modifier: Modifier = Modifier, listGames: Game, onItemClicked: (Int) -> Unit) {
    Card(
        onClick = { onItemClicked(listGames.id) },
        modifier = modifier
            .width(144.dp)
            .height(140.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = listGames.image),
                contentDescription = "Image Game",
                modifier = modifier.height(100.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = listGames.title,
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp,
                modifier = modifier.padding(start = 10.dp, top = 4.dp, end = 10.dp, bottom = 0.dp)
            )
            Row(
                modifier = modifier.padding(start = 10.dp, top = 0.dp, end = 10.dp, bottom = 0.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Stars,
                    contentDescription = "Icon Rating",
                    tint = Color.Magenta,
                    modifier = Modifier.size(14.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = listGames.rating.toString() + "/5",
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameCardHorizontal(
    modifier: Modifier = Modifier,
    listGames: Game,
    onItemClicked: (Int) -> Unit
) {
    Card(
        onClick = { onItemClicked(listGames.id) },
        modifier = modifier
            .width(240.dp)
            .height(180.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = listGames.image),
                contentDescription = "Image Game",
                modifier = modifier.height(120.dp),
                contentScale = ContentScale.Crop
            )
            Text(
                text = listGames.title,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                modifier = modifier.padding(start = 10.dp, top = 10.dp, end = 10.dp, bottom = 0.dp)
            )
            Row(
                modifier = modifier.padding(start = 10.dp, top = 0.dp, end = 10.dp, bottom = 0.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    imageVector = Icons.Default.Stars,
                    contentDescription = "Icon Rating",
                    tint = Color.Magenta,
                    modifier = Modifier.size(14.dp)
                )
                Spacer(modifier = Modifier.width(2.dp))
                Text(
                    text = listGames.rating.toString() + "/5",
                    fontWeight = FontWeight.Medium,
                    fontSize = 12.sp
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameCardFavorite(modifier: Modifier = Modifier, listGames: Game, onItemClicked: (Int) -> Unit) {
    Card(
        onClick = { onItemClicked(listGames.id) },
        modifier = modifier
            .fillMaxWidth()
            .height(80.dp),
        elevation = CardDefaults.cardElevation(10.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(verticalArrangement = Arrangement.Center) {
                Text(
                    text = listGames.title,
                    fontWeight = FontWeight.Bold,
                    fontSize = 14.sp,
                    modifier = modifier.padding(
                        start = 10.dp,
                        top = 10.dp,
                        end = 10.dp,
                        bottom = 0.dp
                    )
                )
                Row(
                    modifier = modifier.padding(
                        start = 10.dp,
                        top = 0.dp,
                        end = 10.dp,
                        bottom = 0.dp
                    ), verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        imageVector = Icons.Default.Stars,
                        contentDescription = "Icon Rating",
                        tint = Color.Magenta,
                        modifier = Modifier.size(14.dp)
                    )
                    Spacer(modifier = Modifier.width(2.dp))
                    Text(
                        text = listGames.rating.toString() + "/5",
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp
                    )
                }
            }
            Image(
                painter = painterResource(id = listGames.image),
                contentDescription = "Image Game",
                modifier = modifier
                    .height(80.dp)
                    .width(170.dp),
                contentScale = ContentScale.Crop
            )
        }
    }
}

//@Preview
//@Composable
//private fun GameCardPrev() {
//    GameCard(
//        listGames = GameItem(1, R.drawable.apex, "Apex", 4.5, "")
//    )
//}
