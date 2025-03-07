package com.example.android

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Toolbar_change_color : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar_change_color)
        val colorDisplay = findViewById<View>(R.id.colorDisplay)
        val colorTeal: View = findViewById(R.id.colorTeal)
        val colorRed: View = findViewById(R.id.colorRed)
        val colorGreen: View = findViewById(R.id.colorGreen)

        colorTeal.setOnClickListener {
            colorDisplay.setBackgroundColor(Color.parseColor("#008080")) // Teal color
        }

        colorRed.setOnClickListener {
            colorDisplay.setBackgroundColor(Color.RED) // Red color
        }

        colorGreen.setOnClickListener {
            colorDisplay.setBackgroundColor(Color.GREEN) // Green color
        }
    }
}