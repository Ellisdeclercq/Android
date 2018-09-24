package com.ellisdeclercq.vdabcursist.les8_datetimepicker

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.icu.util.Calendar
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.DatePicker
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        fun setDate(view: View){
            val c = Calendar.getInstance()
            val day=c.get(Calendar.DAY_OF_MONTH)
            val month = c.get(Calendar.MONTH)

            val year:Int =c.get(Calendar.YEAR)
            val DatePD = DatePickerDialog(this,android.R.style.ThemeOverlay,DatePickerDialog.OnDateSetListener{
                DatePicker,Year,Month,Day  -> dateText.text="$Day/ ${Month} /$Year"},year,month,day)

            DatePD.show()
            }

        fun setTime (view: View) {
            val c = Calendar.getInstance()
            val hour =c.get(Calendar.HOUR_OF_DAY)
            val minutes =c.get(Calendar.MINUTE)
            val TimePD= TimePickerDialog(this,TimePickerDialog.OnTimeSetListener{
                TimePicker, hourOfDay, minute ->
                timeText.text="$hourOfDay : $minute"},hour,minutes,true)

            TimePD.show()
            }


        }


