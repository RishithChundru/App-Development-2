package com.example.android

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CustomToast : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_custom_toast)
        val btnToast = findViewById<Button>(R.id.btnToast)
        btnToast.setOnClickListener {
            //to retrieve a ViewGroup from the layout using its resource ID
            val vg: ViewGroup? = findViewById(R.id.custom_toast)
            val inflater1 = layoutInflater
//The inflate() method reads the p5customtoastlayout.xml file and creates the corresponding View objects.
//(vg) is the parent ViewGroup to which the new view might be attached.
            val layout: View = inflater1.inflate(R.layout.customtoast, vg)

            val tv = layout.findViewById<TextView>(R.id.txtVw)
            tv.text = "Custom Toast Notification"

            val toast = Toast(applicationContext)

            toast.setGravity(Gravity.CENTER_VERTICAL, 0, 100)
            toast.duration = Toast.LENGTH_LONG
            toast.setView(layout)
            toast.show()

        }
    }
}