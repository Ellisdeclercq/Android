package com.ellisdeclercq.vdabcursist.lesson_8_dialogs

import android.app.Dialog
import android.content.DialogInterface
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var progressBarStatus = 0
    var rate = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        download.setOnClickListener { view ->
            Thread(Runnable {
                while (progressBarStatus < 100){
                    try {
                        rate += 10
                        Thread.sleep(500)
                    }
                catch (e: InterruptedException){
                    e.printStackTrace()
                }

                progressBarStatus = rate
                    progressBar.progress = progressBarStatus
                }
                progressBar.setVisibility(ProgressBar.INVISIBLE)
            }).start()
        }
    }
        /*fun save (view: View) {
            var saveAlert = AlertDialog.Builder(this)
            saveAlert.setTitle("Save")
            saveAlert.setMessage("Are you sure you want to save the changes?")
            saveAlert.setPositiveButton("Yes"){
               dialogInterface: DialogInterface, i: Int -> Toast.makeText(applicationContext,"Saved",Toast.LENGTH_LONG).show()}
            saveAlert.setNegativeButton("No") {
                dialogInterface: DialogInterface, i:Int -> Toast.makeText(applicationContext,"Not Saved",Toast.LENGTH_LONG).show()
            }
            saveAlert.show()
            }*/

    }

