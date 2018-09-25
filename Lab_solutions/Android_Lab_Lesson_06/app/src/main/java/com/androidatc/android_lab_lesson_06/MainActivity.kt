package com.androidatc.android_lab_lesson_06

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun display(view: View){

        info.text="Android Application Development ,Android Security Essentials and Monetize Android Applications"

    }
}
