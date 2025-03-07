package com.example.android

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.media.MediaPlayer
import android.util.Log
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class AlarmBroadcast : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent?) {
        var mp=MediaPlayer.create(context,R.raw.alarm)
        Log.d("Hello","Repeating Alarm")
        mp.start()
        Toast.makeText(context,"Alarm Ringing",Toast.LENGTH_LONG).show()
    }
}