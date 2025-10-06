package com.example.applifecycle

import android.app.Application
import android.util.Log

class CustomApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        Log.d(TAG2, "onCreate: ${this::class.simpleName}")

//        registerActivityLifecycleCallbacks()
    }

}