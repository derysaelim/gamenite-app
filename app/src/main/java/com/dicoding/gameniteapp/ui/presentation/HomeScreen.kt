package com.dicoding.gameniteapp.ui.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.dicoding.gameniteapp.data.DummyData
import com.dicoding.gameniteapp.data.Game
import com.dicoding.gameniteapp.navigation.Screen
import com.dicoding.gameniteapp.ui.component.GameCardFavorite
import com.dicoding.gameniteapp.ui.component.GameCardHorizontal

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    games: List<Game> = DummyData.listGames,
    modifier: Modifier = Modifier
) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ), title = { Text(text = "Gamenite App") })
    }) { contentPadding ->
        Column(modifier = Modifier.padding(contentPadding)) {
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                "Most Populer",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 16.dp, bottom = 4.dp)
            )
            LazyRow(
                contentPadding = PaddingValues(16.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                items(games, key = { it.id }) {
                    GameCardHorizontal(listGames = it) { id ->
                        navController.navigate(Screen.Detail.route + "/$id")
                    }
                }
            }

            Text(
                "List Games",
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 16.dp, bottom = 4.dp)
            )
            LazyColumn(
                contentPadding = PaddingValues(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                items(games, key = { it.id }) {
                    GameCardFavorite(listGames = it) { id ->
                        navController.navigate(Screen.Detail.route + "/$id")
                    }
                }
            }
        }
    }
}
