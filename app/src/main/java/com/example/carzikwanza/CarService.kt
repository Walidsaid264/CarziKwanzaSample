package com.example.carzikwanza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class CarService : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_service)
        supportActionBar?.hide()

        val button1 : Button = findViewById(R.id.button1)
        button1.setOnClickListener {
            Toast.makeText(this, "Item added to Cart", Toast.LENGTH_SHORT).show()

        }


    }
}