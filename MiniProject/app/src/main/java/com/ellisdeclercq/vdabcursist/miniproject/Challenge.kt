package com.ellisdeclercq.vdabcursist.miniproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.ellisdeclercq.vdabcursist.miniproject.R.array.ingredients


class Challenge : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge)




        var showitems: ListView?=null
        showitems = findViewById(R.id.listitems)

        showitems.adapter =
                ArrayAdapter(this,android.R.layout.simple_list_item_1,resources.getStringArray(R.array.ingredients))
    }



}

