package com.example.spaceweatherapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val playButton = findViewById<TextView>(R.id.Inicio)
        playButton.setOnClickListener{
            val intent = Intent(this@MainActivity, NavBarActivity::class.java)
            startActivity(intent)
        }









    }

}