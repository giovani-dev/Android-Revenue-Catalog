package com.giovani.androidrevenuecatalog.restaurant

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.giovani.androidrevenuecatalog.HomeActivity
import com.giovani.androidrevenuecatalog.R

class RestaurantCardFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_restaurant_card, container, false)

        startActivity(
            Intent(context, HomeActivity::class.java)
        )
        view.findViewById<CardView>(R.id.restaurant).setOnClickListener {

        }
        return view
    }
}