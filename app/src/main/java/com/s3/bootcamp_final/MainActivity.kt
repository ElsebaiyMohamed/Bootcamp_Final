package com.s3.bootcamp_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val i = Intent(this,Login::class.java)

        Handler().postDelayed({
            startActivity(i)
            finish()
        },3000)
    }
}