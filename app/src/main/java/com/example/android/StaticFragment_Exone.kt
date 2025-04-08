package com.example.android

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView


class StaticFragment_Exone : Fragment() {
    var AndroidOS= arrayOf(
        "Cupcake",
        "Donut",
        "Eclair",
        "Froyo",
        "Gingerbread",
        "Honeycomb",
        "Ice Cream Sandwich",
        "Jelly Bean",
        "KitKat",
        "Lollipop",
        "Marshmallow",
        "Nougat",
        "Oreo",
        "Pie"
    )
    lateinit var lv:ListView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view:View= inflater.inflate(R.layout.fragment_static__exone, container, false)
        lv=view.findViewById(R.id.listView) as ListView
        val arrayAdapter=ArrayAdapter(requireActivity(),android.R.layout.simple_list_item_1,AndroidOS)
        lv.setAdapter(arrayAdapter)
        lv.setOnItemClickListener{ adapterView, view,i,l->
            val txtfrag=parentFragmentManager.findFragmentById(R.id.fragment2) as StaticFragment_Extwo
            txtfrag.change("ANDROID OS:- "+AndroidOS[i])
            lv.setSelector(R.color.purple)
        }
        return view
    }
}