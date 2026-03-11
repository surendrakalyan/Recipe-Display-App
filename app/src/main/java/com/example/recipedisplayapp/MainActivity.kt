package com.example.recipedisplayapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var recipeList: ArrayList<Recipe>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)

        recipeList = ArrayList()

        // Pasta Recipe
        recipeList.add(
            Recipe(
                "Pasta",
                R.drawable.pasta,
                listOf("Pasta", "Tomato Sauce", "Salt"),
                listOf("Boil pasta", "Add sauce", "Serve hot")
            )
        )

        // Biryani Recipe
        recipeList.add(
            Recipe(
                "Biryani",
                R.drawable.biryani,
                listOf("Rice", "Chicken", "Spices", "Onion"),
                listOf("Cook rice", "Prepare chicken masala", "Mix and cook together")
            )
        )

        // French Fries Recipe
        recipeList.add(
            Recipe(
                "French Fries",
                R.drawable.frenchfries,
                listOf("Potatoes", "Salt", "Oil"),
                listOf("Cut potatoes", "Deep fry in oil", "Add salt and serve")
            )
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecipeAdapter(recipeList)
    }
}