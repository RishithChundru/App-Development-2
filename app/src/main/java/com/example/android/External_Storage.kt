package com.example.android

import android.Manifest
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.File
import java.io.FileOutputStream

class External_Storage : AppCompatActivity() {
    lateinit var uname: EditText
    lateinit var pwd: EditText
    lateinit var savebtn: Button
    lateinit var fstream: FileOutputStream
    private var filename="SampleFile.txt"
    private var filepath="MyFileStorage"
    lateinit var myExternalFile: File
    var mPermission=arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.READ_EXTERNAL_STORAGE)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_external_storage)
        uname=findViewById(R.id.edittext6)
        pwd=findViewById(R.id.edittext7)
        savebtn=findViewById(R.id.button18)
        savebtn.setOnClickListener {
            val username= """
                ${uname.text}
            """.trimIndent()
            val password=pwd.text.toString()

            try {
                if(username.isEmpty() || password.isEmpty())
                    Toast.makeText(this,"Either of Field is empty", Toast.LENGTH_LONG).show()
                else{
                    myExternalFile= File(getExternalFilesDir(filepath),filename)
                    fstream= FileOutputStream(myExternalFile)
                    fstream.write(username.toByteArray())
                    fstream.write(password.toByteArray())
                    fstream.close()
                    Toast.makeText(applicationContext,"Details Saved in "+myExternalFile!!.)
                    intent= Intent(this, External_Details_External_storage::class.java)
                    startActivity(intent)
                }
            }
        }
    }
}