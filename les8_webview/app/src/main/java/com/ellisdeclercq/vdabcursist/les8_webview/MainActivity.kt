package com.ellisdeclercq.vdabcursist.les8_webview


import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MyWebView.setBackgroundColor(Color.TRANSPARENT)

        MyWebView.settings.javaScriptEnabled =true

        MyWebView.settings.loadsImagesAutomatically =true

        MyWebView.scrollBarStyle= View.SCROLLBARS_INSIDE_OVERLAY

        MyWebView.loadUrl("http://www.androidatc.com")



    }
}
