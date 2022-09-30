package com.example.spaceweatherapp.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Version 1.0.0 \n Created for NASA HACKATHON"
    }
    val text: LiveData<String> = _text
}