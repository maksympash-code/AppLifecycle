package com.example.applifecycle

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.applifecycle.databinding.ActivitySecondBinding
import com.example.applifecycle.databinding.ActivityTransparentBinding

class TransparentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTransparentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTransparentBinding.inflate(layoutInflater)

        setContentView(binding.root)
    }
}