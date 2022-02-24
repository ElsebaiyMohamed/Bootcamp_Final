package com.s3.bootcamp_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignUp : AppCompatActivity() {
    private lateinit var first : EditText
    private lateinit var last : EditText
    private lateinit var user : EditText
    private lateinit var email : EditText
    private lateinit var pass : EditText
    private lateinit var confirm_pass : EditText
    private lateinit var signUp: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        first = findViewById(R.id.firstname)
        last = findViewById(R.id.lastname)
        user = findViewById(R.id.username)
        email = findViewById(R.id.email)
        pass = findViewById(R.id.password)
        confirm_pass = findViewById(R.id.confirm)
        signUp = findViewById(R.id.signup)



        signUp.setOnClickListener {
            if(first.text.isEmpty() && last.text.isEmpty() && user.text.isEmpty() && email.text.isEmpty() && pass.text.isEmpty() && confirm_pass.text.isEmpty()) {
                Toast.makeText(this,"Please Enter Full Data",Toast.LENGTH_SHORT).show()
            }
            else if (!(pass.text.toString().equals(confirm_pass.text.toString())) )
            {
                Toast.makeText(this,"Password Not Match",Toast.LENGTH_SHORT).show()
            }

            else {
                val i = Intent(this,Login::class.java)
                startActivity(i)
                Toast.makeText(this,"Signed Up Successfully",Toast.LENGTH_SHORT).show()

            }
        }



    }
}