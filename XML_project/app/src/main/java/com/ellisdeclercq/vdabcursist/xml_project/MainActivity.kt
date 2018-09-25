package com.ellisdeclercq.vdabcursist.xml_project

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var showitems: ListView?=null
        showitems = findViewById(R.id.listitems)

        showitems.adapter =
        ArrayAdapter(this,android.R.layout.simple_list_item_1,
                resources.getStringArray(R.array.arrayelements))
    }
}
