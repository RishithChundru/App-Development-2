package com.example.android

import android.annotation.SuppressLint
import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.media.AudioAttributes
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.RemoteViews
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
//        btnNotify.setOnClickListener{
//            val intent=Intent(this,NotificationView::class.java)
//            var pendingIntent=PendingIntent.getActivity(this,0,intent,PendingIntent.FLAG_IMMUTABLE)
//            soundUri = Uri.parse(contentResolver.SCHEME_ANDROID_RESOURCE+"://"+applicationContext.packageName+"/"+R.raw.alarm)
//            audioAttr=AudioAttributes.Builder()
//                .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
//                .setUsage(AudioAttributes.USAGE_NOTIFICATION)
//                .build()
//            remoteCollapsedViews=RemoteViews(packageName,R.layouy.activity_splash_screen_ex_one)
//            remoteCollapsedViews=RemoteViews(packageName,R.layouy.activity_splash_screen_ex_two)
//            myNotificationChannel()
//            notificationManager.notify(notificationId,builder.build())
//        }
//    }
//    private fun myNotificationChannel(){
//        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
//            notificationChannel=NotificationChannel(channelId,description,NotificationManager.)
//            notificationChannel.enableLights(true)
//            notificationChannel.lightColor=Color.GREEN
//            notificationChannel.enableVibration(false)
//            notificationChannel.setSound(soundUri,audioAttr)
//            notificationManager.createNotificationChannel(notificationChannel)
//
//            builder=Notification.Builder(this,channelId)
//                .setSmallIcon(R.drawable.img_2)
//                .setContentTitle(title)
//        }
    }
}