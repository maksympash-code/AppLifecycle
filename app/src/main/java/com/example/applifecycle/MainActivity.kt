package com.example.applifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.applifecycle.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnStartSecondActivity.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        Log.d(TAG, "onCreate: ${this::class.simpleName}")

    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "onStart: ${this::class.simpleName}")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume: ${this::class.simpleName}")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "onPause: ${this::class.simpleName}")
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