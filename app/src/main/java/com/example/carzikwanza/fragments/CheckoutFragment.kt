package com.example.carzikwanza.fragments

import android.R
import android.app.TimePickerDialog
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.carzikwanza.databinding.FragmentCheckoutBinding
import com.example.carzikwanza.databinding.FragmentDashboardBinding


@Suppress("DEPRECATION")
class CheckoutFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentCheckoutBinding.inflate(layoutInflater)

        bind.button3.setOnClickListener{
            val showPopUp =PopupFragment()
            showPopUp.show((activity as AppCompatActivity).supportFragmentManager,"showPopUp")
        }
        return bind.root
    }

}
