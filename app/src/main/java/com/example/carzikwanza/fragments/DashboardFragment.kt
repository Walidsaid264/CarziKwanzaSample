package com.example.carzikwanza.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.carzikwanza.*
import com.example.carzikwanza.databinding.FragmentDashboardBinding


class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentDashboardBinding.inflate(layoutInflater)

        bind.button1.setOnClickListener{
           val intent = Intent(this@DashboardFragment.requireContext(),CarService::class.java)
            startActivity(intent)
        }
        bind.button2.setOnClickListener{
            val intent = Intent(this@DashboardFragment.requireContext(),CarBreakdown::class.java)
            startActivity(intent)
        }
        bind.button3.setOnClickListener{
            val intent = Intent(this@DashboardFragment.requireContext(),CarWash::class.java)
            startActivity(intent)
        }
        bind.button4.setOnClickListener{
            val intent = Intent(this@DashboardFragment.requireContext(),TireServices::class.java)
            startActivity(intent)
        }


        // Inflate the layout for this fragment
        return bind.root

    }


}