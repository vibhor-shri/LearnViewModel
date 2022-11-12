package com.example.learnviewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.learnviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        binding.tvNumber.text = mainViewModel.number.toString()
        setListeners()
    }

    private fun setListeners() {
        binding.btnIncrement.setOnClickListener {
            mainViewModel.increment()
            binding.tvNumber.text = mainViewModel.number.toString()
        }
    }
}