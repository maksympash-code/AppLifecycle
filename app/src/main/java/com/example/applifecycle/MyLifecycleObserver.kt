package com.example.applifecycle

import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner

class MyLifecycleObserver: DefaultLifecycleObserver {
    override fun onCreate(owner: LifecycleOwner) {
        Log.d(TAG1, "onCreate: ${owner::class.simpleName}")
    }

    override fun onDestroy(owner: LifecycleOwner) {
        Log.d(TAG1, "onDestroy: ${owner::class.simpleName}")
    }

    override fun onPause(owner: LifecycleOwner) {
        Log.d(TAG1, "onPause: ${owner::class.simpleName}")
    }

    override fun onResume(owner: LifecycleOwner) {
        Log.d(TAG1, "onResume: ${owner::class.simpleName}")
    }

    override fun onStart(owner: LifecycleOwner) {
        Log.d(TAG1, "onStart: ${owner::class.simpleName}")
    }

    override fun onStop(owner: LifecycleOwner) {
        Log.d(TAG1, "onStop: ${owner::class.simpleName}")
    }

}