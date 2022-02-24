package com.s3.bootcamp_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    private lateinit var login_bt: Button
    private  lateinit var sign: TextView
    private  lateinit var username: EditText
    private  lateinit var pass: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // find view
        login_bt = findViewById(R.id.login)
        username = findViewById(R.id.username)
        pass = findViewById(R.id.password)
        sign = findViewById(R.id.signup)

        // if Username and password Empty
        login_bt.setOnClickListener {
            if(username.toString().trim().length< 0 && pass.toString().trim().length<0 )
            {
                // show toast
                Toast.makeText(this,"Please Enter Full Data",Toast.LENGTH_SHORT).show()
            }
            // if User Enter Data
            else
            {
                val usernamevalue: String = username.text.toString() // or just your string
                val i = Intent(this,Home::class.java)
                i.putExtra("username",usernamevalue)
                startActivity(i)
                finish()
            }

        }

        // If sign up clicked
        sign.setOnClickListener{
        val s = Intent(this,SignUp::class.java)
            startActivity(s)
            finish()
        }

    }
}