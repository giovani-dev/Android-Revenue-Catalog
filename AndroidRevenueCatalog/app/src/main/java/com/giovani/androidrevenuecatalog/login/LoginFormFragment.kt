package com.giovani.androidrevenuecatalog.login

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.giovani.androidrevenuecatalog.R
import com.google.android.material.textfield.TextInputEditText
import java.lang.RuntimeException

class LoginFormFragment : Fragment() {
    private lateinit var callBack: LoginFragmentComunication

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_login_form, container, false)
    }

    override fun onStart() {
        super.onStart()
        val emailInput: TextInputEditText? = view?.findViewById(R.id.loginEmailTextField)
        val passwordInput: TextInputEditText? = view?.findViewById(R.id.loginPasswordTextField)
        passwordInput?.onFocusChangeListener = View.OnFocusChangeListener{ view, onFocus ->
            if(!onFocus){
                this.callBack.loginPassword = passwordInput?.text.toString()
            }
        }
        emailInput?.onFocusChangeListener = View.OnFocusChangeListener{ view, onFocus ->
            if(!onFocus){
                this.callBack.loginEmail = emailInput?.text.toString()
            }
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is LoginFragmentComunication) {
            this.callBack = context
        } else {
            throw RuntimeException("Invalid callback in ${this}.")
        }
    }

}