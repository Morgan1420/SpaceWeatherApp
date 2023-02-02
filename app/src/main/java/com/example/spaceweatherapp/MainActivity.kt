package com.example.spaceweatherapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.Animation
import android.view.animation.Transformation
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

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