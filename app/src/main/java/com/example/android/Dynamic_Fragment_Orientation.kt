package com.example.android

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class Dynamic_Fragment_Orientation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_dynamic_fragment_orientation)
//        val btn1=findViewById<Button>(R.id.button9)
//        val btn2=findViewById<Button>(R.id.button10)
//        btn1.setOnClickListener {
//            onClickFirst(btn1)
//        }
//        btn2.setOnClickListener {
//            onClickSecond(btn2)
//        }
        val fm: FragmentManager = supportFragmentManager
        val fragmentTransaction: FragmentTransaction = fm.beginTransaction()
        val displaymode = resources.configuration.orientation
        if (displaymode == 1) { // it portrait mode
            val f1 = Dynamic_Fragment_Orientation_ExOne()
            fragmentTransaction.replace(android.R.id.content, f1)
        }
        else { // its landscape
            val f2 = Dynamic_Fragment_Orientation_ExTwo()
            fragmentTransaction.replace(android.R.id.content, f2)
        }
        fragmentTransaction.commit()
    }
//    fun onClickFirst(view:View){
//        val fm: FragmentManager=supportFragmentManager
//        val fragmentTransaction1: FragmentTransaction=fm.beginTransaction()
//        val f1=Dynamic_Fragment_Orientation_ExOne()
//        fragmentTransaction1.replace(R.id.framelayout, f1)
//        fragmentTransaction1.commit()
//    }
//    fun onClickSecond(view:View){
//        val fm: FragmentManager=supportFragmentManager
//        val fragmentTransaction1: FragmentTransaction=fm.beginTransaction()
//        val f1=Dynamic_Fragment_Orientation_ExTwo()
//        fragmentTransaction1.replace(R.id.framelayout, f1)
//        fragmentTransaction1.commit()
//    }
}