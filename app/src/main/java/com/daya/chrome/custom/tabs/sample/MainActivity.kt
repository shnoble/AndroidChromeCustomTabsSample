package com.daya.chrome.custom.tabs.sample

import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.customtabs.CustomTabsIntent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val url = "https://www.naver.com";
            val customTabsIntentBuilder = CustomTabsIntent.Builder()
            val customTabsIntent = customTabsIntentBuilder.build()
            customTabsIntent.launchUrl(this, Uri.parse(url))
        }
    }
}
