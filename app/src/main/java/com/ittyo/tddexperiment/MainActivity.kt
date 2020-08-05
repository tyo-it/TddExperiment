package com.ittyo.tddexperiment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ittyo.tddexperiment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.apply {
            btnLogin.setOnClickListener { fullName.text = "${firstName.text} ${lastName.text}" }
        }

        setContentView(binding.root)
    }
}