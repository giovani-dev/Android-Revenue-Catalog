package com.giovani.androidrevenuecatalog

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.giovani.androidrevenuecatalog.restaurant.Restaurant
import com.giovani.androidrevenuecatalog.restaurant.RestaurantAdapter

class HomeActivity : FragmentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val homeRecyclerView: RecyclerView = findViewById(R.id.homeRestaurants)
        val homeLayoutManager = LinearLayoutManager(this)

        homeRecyclerView.layoutManager = homeLayoutManager
        homeRecyclerView.adapter = RestaurantAdapter(content = Restaurant().getAll())
    }
}