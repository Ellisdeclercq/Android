package com.ellisdeclercq.vdabcursist.navigating

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        var message = intent.getStringExtra("name")
        HelloMessage_ID.text="Hello " + message
    }

    fun go2MainActivity(view: View) {
        var intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }


}
