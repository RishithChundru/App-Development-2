package com.example.android

import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RatingBar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_rating_bar)
        val simpleRatingBar=findViewById<RatingBar>(R.id.ratingBar)
        val simpleRating=findViewById<RatingBar>(R.id.ratingBar1)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener{
             val totalstars="Total stars: "+simpleRatingBar.numStars
             val rating="Rating: "+simpleRatingBar.rating
             Toast.makeText(this,""" $totalstars $rating""".trimIndent(),Toast.LENGTH_LONG).show()
        }
        simpleRating.setOnRatingBarChangeListener{ratingBar, rating, fromUser ->
            Toast.makeText(this,"rating $rating, $fromUser",Toast.LENGTH_LONG).show()
        }
    }
}