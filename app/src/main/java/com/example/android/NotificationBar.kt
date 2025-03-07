package com.example.android

import android.annotation.SuppressLint
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NotificationBar : AppCompatActivity() {
    private val channelId="My Channel Id"
    private val description="Test Notification"
    private val title="Notification"
    val myKey="Remote Key"
    val notificationId=1234
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_notification_bar)
        var btnNotify=findViewById<Button>(R.id.button5)
        var notificationManager=getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        btnNotify.setOnClickListener{
            val intent=Intent(this,NotificationView::class.java)
            var pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_IMMUTABLE)

        }
    }
}