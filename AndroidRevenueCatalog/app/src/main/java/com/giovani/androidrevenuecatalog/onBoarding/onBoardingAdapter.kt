package com.giovani.androidrevenuecatalog.onBoarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import java.lang.IllegalArgumentException

class onBoardingAdapter(
    fragmentManager: FragmentActivity,
    private val views: List<Fragment>
): FragmentStateAdapter(fragmentManager) {

    override fun getItemCount(): Int = views.size

    override fun createFragment(position: Int): Fragment {
        return if (views.isEmpty()) {
            throw IllegalArgumentException("The view list is empty.")
        } else {
            views[position]
        }
    }
}