package com.example.android

import android.annotation.SuppressLint
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.DatePicker
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Date_Picker : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_date_picker)
        val datepicker: DatePicker=findViewById(R.id.datePicker)
        val today= Calendar.getInstance()
        datepicker.init (
            today.get(Calendar.YEAR),
            today.get(Calendar.MONTH),
            today.get(Calendar.DAY_OF_MONTH)
        ){view,year,month,day ->
            val msg = "You Selected: $day/${month+1}/$year"
            Toast.makeText(this,msg, Toast.LENGTH_LONG).show()
        }

    }
}