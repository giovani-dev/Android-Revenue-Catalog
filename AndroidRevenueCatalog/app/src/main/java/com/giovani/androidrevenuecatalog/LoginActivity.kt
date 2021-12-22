package com.giovani.androidrevenuecatalog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.giovani.androidrevenuecatalog.login.LoginButtonFragment
import com.giovani.androidrevenuecatalog.login.LoginFormFragment
import com.giovani.androidrevenuecatalog.login.LoginFragmentComunication

class LoginActivity : AppCompatActivity(), LoginFragmentComunication {
    override var loginEmail: String? = null
    override var loginPassword: String? = null
    private var buttonFragment = LoginButtonFragment()
    private var formFragment = LoginFormFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        supportFragmentManager
            .beginTransaction()
            .add(R.id.loginFormFragment, this.formFragment)
            .add(R.id.loginButtonFragment, this.buttonFragment)
            .commit()
    }
}