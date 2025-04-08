package com.example.android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class StaticFragment_Extwo : Fragment() {
    lateinit var textos: TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        var view1: View = inflater.inflate(R.layout.fragment_static__extwo, container, false)
        textos = view1.findViewById(R.id.textview1)
        return view1
    }
    fun change(txt:String){
        textos.setText(txt)
    }
}