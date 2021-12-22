package com.giovani.androidrevenuecatalog.restaurant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.giovani.androidrevenuecatalog.R
import com.squareup.picasso.Picasso

class RestaurantAdapter(
    private val content: List<RestaurantData>
): RecyclerView.Adapter<RestaurantHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent.context)
        val view: View = inflater.inflate(R.layout.fragment_restaurant_card, parent, false)
        return RestaurantHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantHolder, position: Int) {
        val restaurant: RestaurantData = this.content[position]
        Picasso.get().load(restaurant.image).into(holder.image)
        holder.address.text = restaurant.address
        holder.name.text = restaurant.name
        holder.openingHours.text = restaurant.openingHours
//        Falta a imagem, vou carregar utilizando a lib Picasso
    }

    override fun getItemCount(): Int = this.content.size
}