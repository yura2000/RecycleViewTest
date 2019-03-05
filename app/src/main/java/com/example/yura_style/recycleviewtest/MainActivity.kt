package com.example.yura_style.recycleviewtest

import android.graphics.drawable.Drawable
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val generateFakeValues = listOf(
                Contact("John", 25, getDrawable(R.drawable.john)),
                Contact("Peter", 21, getDrawable(R.drawable.peter)),
                Contact("Nick", 30, getDrawable(R.drawable.nick)),
                Contact("Lizzy", 20, getDrawable(R.drawable.lizzy)),
                Contact("Michael", 31, getDrawable(R.drawable.michael))
        )

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = RecyclerAdapter(generateFakeValues)

    }
}

