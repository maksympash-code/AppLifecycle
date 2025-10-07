package com.example.applifecycle

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ProcessLifecycleOwner

class CustomApplication: Application() {

    // adb shell ps -o PID,NAME | grep com.example.applifecycle

    class MyActivityLifecycleCallbacks: ActivityLifecycleCallbacks{
        override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
            Log.d(TAG2, "onActivityCreated: ${activity::class.simpleName}")
        }

        override fun onActivityDestroyed(activity: Activity) {
            Log.d(TAG2, "onActivityDestroyed: ${activity::class.simpleName}")
        }

        override fun onActivityPaused(activity: Activity) {
            Log.d(TAG2, "onActivityPaused: ${activity::class.simpleName}")
        }

        override fun onActivityResumed(activity: Activity) {
            Log.d(TAG2, "onActivityResumed: ${activity::class.simpleName}")
        }

        override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {
            Log.d(TAG2, "onActivitySaveInstanceState: ${activity::class.simpleName}")
        }

        override fun onActivityStarted(activity: Activity) {
            Log.d(TAG2, "onActivityStarted: ${activity::class.simpleName}")
        }

        override fun onActivityStopped(activity: Activity) {
            Log.d(TAG2, "onActivityStopped: ${activity::class.simpleName}")
        }

    }

    override fun onCreate() {
        super.onCreate()

        Log.d(TAG2, "onCreate: ${this::class.simpleName}")

        registerActivityLifecycleCallbacks(MyActivityLifecycleCallbacks())

        ProcessLifecycleOwner.get().lifecycle.addObserver(MyLifecycleObserver())

//        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks{
//            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
//                Log.d(TAG, "onActivityCreated: ${activity::class.simpleName}")
//            }
//
//            override fun onActivityDestroyed(activity: Activity) {
//                Log.d(TAG, "onActivityDestroyed: ${activity::class.simpleName}")
//            }
//
//            override fun onActivityPaused(activity: Activity) {
//                Log.d(TAG, "onActivityPaused: ${activity::class.simpleName}")
//            }
//
//            override fun onActivityResumed(activity: Activity) {
//                Log.d(TAG, "onActivityResumed: ${activity::class.simpleName}")
//            }
//
//            override fun onActivitySaveInstanceState(
//                activity: Activity,
//                outState: Bundle
//            ) {
//                Log.d(TAG, "onActivitySaveInstanceState: ${activity::class.simpleName}")
//            }
//
//            override fun onActivityStarted(activity: Activity) {
//                Log.d(TAG, "onActivityStarted: ${activity::class.simpleName}")
//            }
//
//            override fun onActivityStopped(activity: Activity) {
//                Log.d(TAG, "onActivityStopped: ${activity::class.simpleName}")
//            }
//
//        }) // dangerous
    }

    override fun onTerminate() {
        super.onTerminate()

        Log.d(TAG2, "onTerminate: ${this::class.simpleName}")
    }

}