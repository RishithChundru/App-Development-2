package com.example.android

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout


class StaticFragment_color_Extwo : Fragment() {
    private lateinit var parent:LinearLayout
    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v:View= inflater.inflate(R.layout.fragment_static_color__extwo, container, false)
        parent=v.findViewById(R.id.frag2)
        return v
    }
    fun updateColor(c:Int){
        parent.setBackgroundColor(c)
    }
}