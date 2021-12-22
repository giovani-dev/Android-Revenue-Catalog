package com.giovani.androidrevenuecatalog.restaurant

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.giovani.androidrevenuecatalog.R

class RestaurantHolder(
    itemView: View
): RecyclerView.ViewHolder(itemView) {
    val image: ImageView = itemView.findViewById(R.id.restaurantImage)
    val name: TextView = itemView.findViewById(R.id.restaurantName)
    val address: TextView = itemView.findViewById(R.id.restaurantAddress)
    val openingHours: TextView = itemView.findViewById(R.id.restaurantOpeningHours)
}