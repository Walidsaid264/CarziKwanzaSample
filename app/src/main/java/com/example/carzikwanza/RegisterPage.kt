package com.example.carzikwanza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.carzikwanza.databinding.ActivityMainBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

@Suppress("DEPRECATION")
class RegisterPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page)
        supportActionBar?.hide()



        val button2: Button = findViewById(R.id.btnsignup)
        button2.setOnClickListener {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

    }


}




















