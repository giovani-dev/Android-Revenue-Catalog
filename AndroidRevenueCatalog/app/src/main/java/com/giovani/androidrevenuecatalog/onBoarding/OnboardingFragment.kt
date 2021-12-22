package com.giovani.androidrevenuecatalog.onBoarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.fragment.app.FragmentActivity
import com.giovani.androidrevenuecatalog.R

class OnboardingFragment(
    val imageName: String,
    val title: String,
    val description: String
) : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View =  inflater.inflate(R.layout.fragment_onboarding, container, false)
        val imageView = view.findViewById<ImageView>(R.id.onBoardingPagerImage)
        val titleView = view.findViewById<TextView>(R.id.onBoardingPagerTitle)
        val descriptionView = view.findViewById<TextView>(R.id.onBoardingPagerDescription)

        val imageResource = context?.resources?.getIdentifier(imageName, null, context?.packageName)
        val imageDrawable = context?.resources?.getDrawable(imageResource!!)
        imageView.setImageDrawable(imageDrawable)
        titleView.text = title
        descriptionView.text = description

        return view
    }
}