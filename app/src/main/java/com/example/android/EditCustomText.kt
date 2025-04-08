package com.example.android

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.text.Editable
import android.view.MotionEvent
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import androidx.core.view.ViewCompat
import android.text.TextWatcher
import androidx.core.view.WindowInsetsCompat



class EditCustomText : AppCompatActivity() {
    private var setHint: String? = null
    private var setText: String? = null
    private var darkButton: Drawable? = null
    private var lightButton: Drawable? = null
    private lateinit var editText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edit_custom_text)
        editText = findViewById(R.id.edittext3)
        init()
    }
    private fun init() {
        darkButton = ResourcesCompat.getDrawable(resources, R.drawable.baseline_ads_click_24, null)
        lightButton = ResourcesCompat.getDrawable(resources, R.drawable.baseline_ads_click_22, null)

        editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                showButton()
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        editText.setOnTouchListener { v, event ->
            if (darkButton == null) return@setOnTouchListener false

            val isClicked: Boolean
            val clearButtonStart = (editText.width - editText.paddingEnd - darkButton!!.intrinsicWidth).toFloat()

            isClicked = event.x > clearButtonStart
            if (isClicked) {
                when (event.action) {
                    MotionEvent.ACTION_DOWN -> editText.text.clear()
                    MotionEvent.ACTION_UP -> hideButton()
                }
                return@setOnTouchListener true
            }
            false
        }
    }

    private fun showButton() {
        editText.setCompoundDrawablesWithIntrinsicBounds(null, null, darkButton, null)
    }

    private fun hideButton() {
        editText.setCompoundDrawablesWithIntrinsicBounds(null, null, null,null)
    }


}



