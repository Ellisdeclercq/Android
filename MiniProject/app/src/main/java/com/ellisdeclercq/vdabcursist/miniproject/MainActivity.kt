package com.ellisdeclercq.vdabcursist.miniproject

import android.content.ClipData
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.ellisdeclercq.vdabcursist.miniproject.R.id.about

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when(item?.itemId) {

            R.id.about -> { Toast.makeText(this,"Let's go to about", Toast.LENGTH_LONG).show()
                setContentView(R.layout.activity_about)
                return super.onOptionsItemSelected(item) }

            R.id.settings -> { Toast.makeText(this,"Let's go to settings", Toast.LENGTH_LONG).show()
                setContentView(R.layout.activity_settings)
                return super.onOptionsItemSelected(item) }

            R.id.main -> { Toast.makeText(this,"Let's go to main", Toast.LENGTH_LONG).show()
                setContentView(R.layout.activity_main)
                return super.onOptionsItemSelected(item) }
            else -> return super.onOptionsItemSelected(item)
        }
    }

}