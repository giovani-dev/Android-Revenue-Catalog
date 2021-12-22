package com.giovani.androidrevenuecatalog.login

class Login(
    var email: String?,
    var password: String?
) {

    fun auth(): Boolean {
//        return email == "giovanilzanini@hotmail.com" && password == "123"
        return true
    }
}