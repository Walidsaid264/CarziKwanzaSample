package com.example.carzikwanza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast

class MechanicAppointment : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mechanic_appointment)
        supportActionBar?.hide()

        val button1: Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({

                Toast.makeText(this, "Redirecting to Home", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomePage::class.java)
                startActivity(intent)

            },3000)

        }

    }
}