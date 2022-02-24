package com.s3.bootcamp_final

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Home : AppCompatActivity() {
    private lateinit var txt : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        txt = findViewById(R.id.userdata)
        val ss:String = intent.getStringExtra("username").toString()
        txt.text = ss

    }
}