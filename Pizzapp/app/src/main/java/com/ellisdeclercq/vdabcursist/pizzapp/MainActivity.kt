package com.ellisdeclercq.vdabcursist.pizzapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onPlaceOrderButtonClicket(view: View) {
        var pizzaSizePrice = 0.0
        var toppingsTotal = 0.0
        when {
            RadioGroup.smallpizza.isChecked -> pizzaSizePrice =5.0
            RadioGroup.mediumpizza.isChecked -> pizzaSizePrice =7.0
            RadioGroup.largepizza.isChecked -> pizzaSizePrice =9.0
        }

        if (onions.isChecked) { toppingsTotal += 1}
        if (olives.isChecked) { toppingsTotal +=2}
        if (tomatoes.isChecked) {toppingsTotal +=3}
    Totalprice.text="Total Order Price = $"+(pizzaSizePrice+toppingsTotal)
    }
}
