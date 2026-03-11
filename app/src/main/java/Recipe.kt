package com.example.recipedisplayapp

data class Recipe(
    val name: String,
    val image: Int,
    val ingredients: List<String>,
    val steps: List<String>
)