package com.example.android

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ScrollView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Scroll_up_down : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_scroll_up_down)
        val scrollview=findViewById<ScrollView>(R.id.scrollview)
        val scrollup=findViewById<Button>(R.id.button6)
        val scrolldown=findViewById<Button>(R.id.button7)
        scrollup.setOnClickListener{
            scrollview.smoothScrollBy(0,-50)
        }
        scrolldown.setOnClickListener{
            scrollview.smoothScrollBy(0,50)
        }
    }
}