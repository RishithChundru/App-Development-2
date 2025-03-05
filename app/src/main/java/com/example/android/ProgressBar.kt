package com.example.android

import android.annotation.SuppressLint
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.widget.ProgressBar
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat

import androidx.core.view.WindowInsetsCompat

class ProgressBar : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_progress_bar)
        val pbar =findViewById<ProgressBar>(R.id.pBar)
        val pbar1 =findViewById<ProgressBar>(R.id.pBarCircular)
        val button=findViewById<Button>(R.id.button)
        val reset=findViewById<Button>(R.id.reset)
        val textview:TextView=findViewById(R.id.textview)
        pbar1.visibility=View.INVISIBLE
        button.setOnClickListener {
            pbar1.visibility = View.VISIBLE
            var i= pbar.progress
            Thread{
                while(i<100){
                    i = i+10
                    Handler(Looper.getMainLooper()).post {
                        pbar.progress = i
                        textview.text = i.toString() + "/" + pbar.max
                        if (i == 100) {
                            pbar1.visibility = View.INVISIBLE
                        }
                    }
                    try {
                        Thread.sleep(1000)
                    }
                    catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
            }.start()
        }

        reset.setOnClickListener {
            //pgsBar.setProgress(0);
            pbar.progress = 0
            textview.text = 0.toString() + "/" + pbar.max
            Toast.makeText(this,"Progress bar Reset Succefully", Toast.LENGTH_SHORT).show()
        }

    }
}