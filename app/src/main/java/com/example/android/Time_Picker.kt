package com.example.android

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import android.widget.TimePicker
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Time_Picker : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_time_picker)
        val timePicker: TimePicker=findViewById(R.id.timePicker)
        val textView=findViewById<TextView>(R.id.txtview)
        timePicker.setOnTimeChangedListener { _,hour, minute ->
            var hour1=hour
            var ampm=""
            when{
                hour1==0 -> {
                    hour1+=12
                    ampm="AM"
                }

                hour1 == 12 -> ampm="PM"
                hour1 > 12 -> {
                    hour1 -= 12
                    ampm="PM"
                }
                else -> ampm = "AM"
            }
            val hour2 = if (hour1 < 10) "0$hour1" else hour1
            val min = if (minute < 10) "0$minute" else minute
            // display format of time
            val msg = "Time is: $hour2 : $min $ampm"
            textView.text = msg
            textView.visibility = ViewGroup.VISIBLE

    }
    }
}