package com.example.carzikwanza.fragments

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.example.carzikwanza.CarService
import com.example.carzikwanza.MechanicAppointment
import com.example.carzikwanza.R
import com.example.carzikwanza.databinding.FragmentCheckoutBinding
import com.example.carzikwanza.databinding.FragmentPopupBinding


class PopupFragment : DialogFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentPopupBinding.inflate(layoutInflater)
        bind.button2.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({

                Toast.makeText(context, "Payment Successfully", Toast.LENGTH_SHORT).show()
        },3000)
        }

        bind.button3.setOnClickListener {
            Handler(Looper.getMainLooper()).postDelayed({

                Toast.makeText(context, "Wait, Appointing you a mechanic........", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@PopupFragment.requireContext(), MechanicAppointment::class.java)
                startActivity(intent)

            },5000)

        }

        return bind.root
    }


}


