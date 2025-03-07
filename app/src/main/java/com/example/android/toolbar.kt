package com.example.android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class toolbar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_toolbar)
        val toolbar=findViewById<Toolbar>(R.id.toolbar)
        toolbar.setOnClickListener {
            Toast.makeText(this,"Added to cart",Toast.LENGTH_LONG).show()
        }
    }
}