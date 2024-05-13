@file:OptIn(ExperimentalMaterial3Api::class)

package com.dicoding.gameniteapp.ui.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dicoding.gameniteapp.data.DummyData
import com.dicoding.gameniteapp.data.Game
import com.dicoding.gameniteapp.navigation.Screen
import com.dicoding.gameniteapp.ui.component.GameCard

@Composable
fun FavoriteScreen(
    navController: NavController,
    games: List<Game> = DummyData.listGames,
    modifier: Modifier = Modifier
) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ), title = { Text(text = "Favorite") })
    }) { contentPadding ->
        LazyVerticalGrid(
            modifier = modifier.padding(contentPadding),
            contentPadding = PaddingValues(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp),
            horizontalArrangement = Arrangement.spacedBy(16.dp),
            columns = GridCells.Adaptive(140.dp)
        ) {
            items(games, key = { it.id }) {
                GameCard(listGames = it) { id ->
                    navController.navigate(Screen.Detail.route + "/$id")
                }
            }
        }
    }
}
