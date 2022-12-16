package com.example.carzikwanza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.carzikwanza.databinding.ActivityLoginPageBinding
import com.example.carzikwanza.fragments.ProfileFragment
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth

@Suppress("DEPRECATION")
class LoginPage : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        supportActionBar?.hide()

        val bind = ActivityLoginPageBinding.inflate(layoutInflater)
        bind.button3.setOnClickListener{
            val intent = Intent(this,CarWash::class.java)
            startActivity(intent)
        }
        val button1: Button = findViewById(R.id.btnLogin)
        button1.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }
        val button2: Button = findViewById(R.id.btnSignUp)
        button2.setOnClickListener {
            val intent = Intent(this, RegisterPage::class.java)
            startActivity(intent)
        }




    }


}