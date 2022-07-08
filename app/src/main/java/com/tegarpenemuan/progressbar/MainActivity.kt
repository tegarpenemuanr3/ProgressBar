package com.tegarpenemuan.progressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tegarpenemuan.progressbar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {
        binding.progressbar.visibility = View.VISIBLE
        }

        binding.btn2.setOnClickListener {
            binding.progressbar.visibility = View.GONE
        }

    }
}