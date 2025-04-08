package com.example.android

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SharedPreference : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    private lateinit var editTextName: EditText
    private lateinit var editTextEmail: EditText

    private val myPreference = "myPref"
    private val nameKey = "nameKey"
    private val emailKey = "emailKey"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shared_preference)

        editTextName = findViewById(R.id.edittext4)
        editTextEmail = findViewById(R.id.edittext5)
        val btnSave: Button = findViewById(R.id.button12)
        val btnRetrieve: Button = findViewById(R.id.button13)
        val btnClear: Button = findViewById(R.id.button11)
        sharedPreferences = getSharedPreferences(myPreference, Context.MODE_PRIVATE)

        loadData()

        btnSave.setOnClickListener { saveData() }
        btnRetrieve.setOnClickListener { loadData() }
        btnClear.setOnClickListener { clearData() }
    }

    private fun saveData() {
        val name = editTextName.text.toString()
        val email = editTextEmail.text.toString()

        val editor = sharedPreferences.edit()
        editor.putString(nameKey, name)
        editor.putString(emailKey, email)
        editor.apply()
    }
    private fun loadData() {
        val name = sharedPreferences.getString(nameKey, "")
        val email = sharedPreferences.getString(emailKey, "")

        editTextName.setText(name)
        editTextEmail.setText(email)
    }

    private fun clearData() {
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()

        editTextName.setText("")
        editTextEmail.setText("")
    }
}
