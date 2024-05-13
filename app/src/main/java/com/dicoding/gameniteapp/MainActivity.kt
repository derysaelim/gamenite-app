package com.dicoding.gameniteapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.dicoding.gameniteapp.ui.presentation.GameniteApp
import com.dicoding.gameniteapp.ui.theme.GameniteAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GameniteAppTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    GameniteApp()
                }
            }
        }
    }
}