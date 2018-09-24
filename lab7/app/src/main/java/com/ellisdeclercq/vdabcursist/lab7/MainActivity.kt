package com.ellisdeclercq.vdabcursist.lab7

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.ellisdeclercq.vdabcursist.lab7.data.PlaceListAdapter
import com.ellisdeclercq.vdabcursist.lab7.model.Place
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var adapter:PlaceListAdapter?=null
    private var countryList:ArrayList<Place>?=null
    private var layoutManager:RecyclerView.LayoutManager?=null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countryList=ArrayList<Place>()
        layoutManager=LinearLayoutManager(this)
        adapter= PlaceListAdapter(countryList!!,this)

        myRecyclerView.layoutManager=layoutManager
        myRecyclerView.adapter=adapter

        var countryNameList:Array<String> = arrayOf("Canada","USA", "Mexico","Columbia","Malaysia","Singapore","Turkey","Nicaragua","India","Italy","Tunisia","Chile","Argentina","Spain","Peru")
        var citiesNameList:Array<String> = arrayOf("Ottawa","Washington","Mexico City","Bogota","Kuala Lumpur","Singapore","Ankara","Mangua","New Delhi","Rome","Tunis","Santiago","Buenos Aires","Madrid","Lima")

        for(i in 0..14){
            var place=Place()
            place.CountryName = countryNameList[i]
            place.CityName = citiesNameList[i]
            countryList?.add(place)
        }
        adapter!!.notifyDataSetChanged()
    }
}
