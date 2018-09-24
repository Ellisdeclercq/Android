package com.ellisdeclercq.vdabcursist.seekbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var slider:SeekBar
    lateinit var value:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        slider=MyseekBar
        value=Result

        slider.setOnSeekBarChangeListener(object :SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value.text="Release your thumb to select .. "+progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                value.text="Tracking Started ...... "+ slider.progress
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                value.text="Thank you for selecting " + slider.progress
            }
        })
    }
}
