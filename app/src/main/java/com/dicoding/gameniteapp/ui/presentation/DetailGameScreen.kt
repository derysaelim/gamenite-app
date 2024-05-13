package com.dicoding.gameniteapp.ui.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBackIosNew
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.dicoding.gameniteapp.data.DummyData
import com.dicoding.gameniteapp.ui.component.DetailGameContent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailGameScreen(modifier: Modifier = Modifier, navController: NavController, id: Int?) {
    Scaffold(topBar = {
        CenterAlignedTopAppBar(colors = TopAppBarDefaults.topAppBarColors(
            containerColor = MaterialTheme.colorScheme.primaryContainer,
            titleContentColor = MaterialTheme.colorScheme.primary,
        ), title = { Text(text = "Detail") }, navigationIcon = {
            IconButton(onClick = { navController.popBackStack() }) {
                Icon(
                    imageVector = Icons.Default.ArrowBackIosNew,
                    contentDescription = "Back Icon"
                )
            }
        })
    }) { contentPadding ->
        val newGamesList = DummyData.listGames.filter { game ->
            game.id == id
        }
        Column(modifier = modifier.padding(contentPadding)) {
            DetailGameContent(newGamesList = newGamesList)
        }
    }
}