package com.example.android

import android.annotation.SuppressLint
import android.app.PendingIntent
import android.app.AlarmManager
import android.app.PendingIntent.FLAG_IMMUTABLE
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Alarm : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ServiceCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_alarm)
        var text=findViewById<EditText>(R.id.editTextText)
        var start=findViewById<Button>(R.id.button2)
        var cancel=findViewById<Button>(R.id.button3)
        var Rstart=findViewById<Button>(R.id.button4)
        var alarmManager: AlarmManager
        val intent = Intent(this,AlarmBroadcast::class.java)
        val pendingIntent = PendingIntent.getBroadcast(this,0, intent, FLAG_IMMUTABLE)// flag_Update_current


        start.setOnClickListener {
            var i = text.text.toString().toInt()
            alarmManager = getSystemService(Context.ALARM_SERVICE) as AlarmManager
            alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+(i*1000),pendingIntent)
            Toast.makeText(this, "Alarm set in $i seconds", Toast.LENGTH_LONG ).show()
        }

        Rstart.setOnClickListener {
            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
            alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,System.currentTimeMillis(),5000,pendingIntent)
            Toast.makeText(this,"Repeating Alarm 5 Seconds", Toast.LENGTH_LONG).show()
        }

        cancel.setOnClickListener {
            alarmManager = getSystemService(ALARM_SERVICE) as AlarmManager
            alarmManager.cancel(pendingIntent)
            Toast.makeText(this,"Alarm Cancelled", Toast.LENGTH_SHORT).show()
        }
    }
}