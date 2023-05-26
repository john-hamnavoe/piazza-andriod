package com.hamnavoepartners.piazza

class Api {
    companion object {
        private val baseUrl = if(BuildConfig.DEBUG)
            "http://10.0.2.2:3000"
        else
            "https://piazza-web-5iv7.onrender.com"
        val rootUrl = "$baseUrl/"
        val loginUrl = "$baseUrl/login"
    }
}