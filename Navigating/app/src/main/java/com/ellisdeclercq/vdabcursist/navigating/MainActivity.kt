package com.ellisdeclercq.vdabcursist.navigating

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun go2secondActivity(view: View) {
        var intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("name",FirstName_ID.text.toString())
        startActivity(intent)
    }
}
