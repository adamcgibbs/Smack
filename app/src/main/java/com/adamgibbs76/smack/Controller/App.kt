package com.adamgibbs76.smack.Controller

import android.app.Application
import com.adamgibbs76.smack.Utilities.SharedPrefs

class App: Application(){

    companion object {
        lateinit var prefs: SharedPrefs
    }

    override fun onCreate() {
        prefs = SharedPrefs(applicationContext)
        super.onCreate()
    }
}