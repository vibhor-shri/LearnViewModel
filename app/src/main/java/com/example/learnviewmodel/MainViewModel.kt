package com.example.learnviewmodel

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var number: Int = 0

    fun increment() {
        number = number.inc()
    }
}