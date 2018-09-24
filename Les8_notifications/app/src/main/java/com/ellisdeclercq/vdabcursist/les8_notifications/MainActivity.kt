package com.ellisdeclercq.vdabcursist.les8_notifications

import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.app.TaskStackBuilder
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.NotificationCompat
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
        fun courseupdate (view: View) {
            val id = "my_channel_01"

            val name = getString(R.string.abc_action_bar_home_description)

            val description = getString(R.string.abc_action_bar_home_description)
            val importance = NotificationManager.IMPORTANCE_HIGH
            val mChannel = NotificationChannel(id, name, importance)

            mChannel.description = description
            mChannel.enableLights(true)

            mChannel.lightColor = Color.RED
            mChannel.enableVibration(true)

            val cHANNELID = "my_channel_01"

            val mBuilder = NotificationCompat.Builder(this, cHANNELID)
                    .setSmallIcon(R.drawable.notification_icon_background)
                    .setContentTitle("Android ATC Notification")
                    .setContentText("Check Android ATC New Course !!")

            val resultIntent = Intent(this, ResultActivity::class.java)

            val stackBuilder = TaskStackBuilder.create(this)

            stackBuilder.addNextIntent(resultIntent)
            val resultPendingIntent = stackBuilder.getPendingIntent(0,
                    PendingIntent.FLAG_UPDATE_CURRENT)
            mBuilder.setContentIntent(resultPendingIntent)
            val mNotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            mNotificationManager.createNotificationChannel(mChannel)
            mNotificationManager.notify(1, mBuilder.build())

                }
}
