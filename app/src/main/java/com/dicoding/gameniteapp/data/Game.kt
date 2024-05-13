package com.dicoding.gameniteapp.data

import androidx.annotation.DrawableRes

data class Game(
    val id: Int,
    @DrawableRes val image: Int,
    val title: String,
    val rating: Double,
    val description: String
)
