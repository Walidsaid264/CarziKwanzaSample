package com.example.carzikwanza.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.carzikwanza.CarService
import com.example.carzikwanza.HomePage
import com.example.carzikwanza.LoginPage
import com.example.carzikwanza.R
import com.example.carzikwanza.databinding.FragmentDashboardBinding
import com.example.carzikwanza.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val bind = FragmentProfileBinding.inflate(layoutInflater)

        bind.button1.setOnClickListener{
            val intent = Intent(this@ProfileFragment.requireContext(), LoginPage::class.java)
            startActivity(intent)
        }
        return bind.root

    }


}