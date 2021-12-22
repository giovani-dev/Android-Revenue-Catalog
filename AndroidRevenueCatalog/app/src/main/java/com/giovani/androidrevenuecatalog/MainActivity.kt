package com.giovani.androidrevenuecatalog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.giovani.androidrevenuecatalog.onBoarding.OnboardingFragment
import com.giovani.androidrevenuecatalog.onBoarding.onBoardingAdapter

class MainActivity : AppCompatActivity() {
    private val viewPager: ViewPager2 by lazy { findViewById(R.id.onBoarding) }
    private val button: Button by lazy { findViewById(R.id.onBoardingButton) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentList: List<Fragment> = listOf(
            OnboardingFragment(
                imageName = "@drawable/ic_ilustra1",
                title = "Os Melhores Restaurantes",
                description = "Coma nos melhores restaurantes da cidade."
            ),
            OnboardingFragment(
                imageName = "@drawable/ic_ilustra2",
                title = "Chefs ilustres",
                description = "Experimente os melhores pratos, feitos por chefs notáveis."
            ),
            OnboardingFragment(
                imageName = "@drawable/ic_ilustra3",
                title = "Receba onde estiver",
                description = "Nossa equipe de entrega leva sua refeição quentinha."
            )
        )

        viewPager.adapter = onBoardingAdapter(
            this,
            fragmentList
        )
        button.setOnClickListener {
            if(viewPager.currentItem == fragmentList.size-1) {
                val loginActivity = Intent(this, LoginActivity::class.java)
                startActivity(loginActivity)
            }
            viewPager.currentItem++
        }
    }
}