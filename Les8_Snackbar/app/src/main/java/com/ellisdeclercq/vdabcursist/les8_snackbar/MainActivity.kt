package com.ellisdeclercq.vdabcursist.les8_snackbar

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun MgSnack (view: View) {
        var SnackB: Snackbar = Snackbar.make(findViewById(android.R.id.content),"No Internet Connection!!",Snackbar.LENGTH_LONG)
                .setAction("Retry"){}
        SnackB.setActionTextColor(Color.RED)
        SnackB.show()
    }
}
