package com.example.applifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.LifecycleOwner
import com.example.applifecycle.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

//    class MyLifecycleObserver: DefaultLifecycleObserver {
//        override fun onCreate(owner: LifecycleOwner) {
//            Log.d(TAG1, "onCreate: ${owner::class.simpleName}")
//        }
//
//        override fun onDestroy(owner: LifecycleOwner) {
//            Log.d(TAG1, "onDestroy: ${owner::class.simpleName}")
//        }
//
//        override fun onPause(owner: LifecycleOwner) {
//            Log.d(TAG1, "onPause: ${owner::class.simpleName}")
//        }
//
//        override fun onResume(owner: LifecycleOwner) {
//            Log.d(TAG1, "onResume: ${owner::class.simpleName}")
//        }
//
//        override fun onStart(owner: LifecycleOwner) {
//            Log.d(TAG1, "onStart: ${owner::class.simpleName}")
//        }
//
//        override fun onStop(owner: LifecycleOwner) {
//            Log.d(TAG1, "onStop: ${owner::class.simpleName}")
//        }
//
//    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySecondBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnTransparentActivity.setOnClickListener{
            val intent = Intent(this, TransparentActivity::class.java)
            startActivity(intent)
        }

        Log.d(TAG, "onCreate: ${this::class.simpleName}")

//        lifecycle.addObserver(MyLifecycleObserver())

        // Якщо не хочемо створювати клас або нам необхідно використати клас одноразово
        // то створюємо анонімний клас
//        lifecycle.addObserver(object : DefaultLifecycleObserver{
//            override fun onCreate(owner: LifecycleOwner) {
//                Log.d(TAG1, "onCreate: ${owner::class.simpleName}")
//            }
//
//            override fun onDestroy(owner: LifecycleOwner) {
//                Log.d(TAG1, "onDestroy: ${owner::class.simpleName}")
//            }
//
//            override fun onPause(owner: LifecycleOwner) {
//                Log.d(TAG1, "onPause: ${owner::class.simpleName}")
//            }
//
//            override fun onResume(owner: LifecycleOwner) {
//                Log.d(TAG1, "onResume: ${owner::class.simpleName}")
//            }
//
//            override fun onStart(owner: LifecycleOwner) {
//                Log.d(TAG1, "onStart: ${owner::class.simpleName}")
//            }
//
//            override fun onStop(owner: LifecycleOwner) {
//                Log.d(TAG1, "onStop: ${owner::class.simpleName}")
//            }
//        })
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ${this::class.simpleName}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ${this::class.simpleName}")

        binding.progressBar.visibility = View.VISIBLE
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ${this::class.simpleName}")

        binding.progressBar.visibility = View.GONE
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop: ${this::class.simpleName}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy: ${this::class.simpleName}")
    }
}