package com.giovani.androidrevenuecatalog.login

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.giovani.androidrevenuecatalog.HomeActivity
import com.giovani.androidrevenuecatalog.R
import java.lang.RuntimeException

class LoginButtonFragment : Fragment() {
    private lateinit var callBack: LoginFragmentComunication
    private lateinit var loginView: View
    private lateinit var homeActivity: Intent

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is LoginFragmentComunication) {
            this.callBack = context
        } else {
            throw RuntimeException("Invalid callback in ${this}.")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        loginView = inflater.inflate(R.layout.fragment_login_button, container, false)
        homeActivity = Intent(context, HomeActivity::class.java)
        return loginView
    }

    override fun onStart() {
        super.onStart()
        loginView.findViewById<Button>(R.id.loginButton).setOnClickListener {
            val login = Login(
                email = this.callBack.loginEmail,
                password = this.callBack.loginPassword
            )
            if(login.auth()) {
                startActivity(homeActivity)
            } else {
                Toast.makeText(context, "Login Invalido", Toast.LENGTH_LONG).show()
            }
        }
    }
}