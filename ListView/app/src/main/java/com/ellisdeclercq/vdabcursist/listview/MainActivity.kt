package com.ellisdeclercq.vdabcursist.listview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var countryname:Array<String> = arrayOf("België", "Frankrijk", "Spanje", "Duitsland", "Nederland")
        var countryAdapter:ArrayAdapter<String> = ArrayAdapter(this, android.R.layout.simple_list_item_1,countryname)
        listview7.adapter=countryAdapter
    }
       
}
