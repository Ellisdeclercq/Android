package com.androidatc.lesson_07_android_recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.androidatc.lesson_07_android_recyclerview.data.PlaceListAdapter
import com.androidatc.lesson_07_android_recyclerview.model.Place
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
        adapter=PlaceListAdapter(countryList!!,this)

        myRecyclerView.layoutManager=layoutManager
        myRecyclerView.adapter=adapter

        //load data



        var countryNameList:Array<String> = arrayOf("Canada","USA","Mexico","Columbia","Malaysia","Singapore","Turkey","Nicaragua","India","Italy","Tunisia","Chile","Argentina","Spain","Peru")
        var citiesNameList:Array<String> = arrayOf("Ottawa","Washington, D.C.","Mexico City","Bogotá","Kuala Lumpur","Singapore","Ankara","Managua","New Delhi","Rome","Tunis","Santiago","Buenos Aires","Madrid","Lima")



        for (i in 0..14) {
            var place=Place()
            place.CountryName = countryNameList[i]
            place.CityName = citiesNameList[i]
            countryList?.add(place)
        }

         adapter!!.notifyDataSetChanged()


}}
