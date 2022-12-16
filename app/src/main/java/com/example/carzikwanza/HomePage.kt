package com.example.carzikwanza

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.carzikwanza.fragments.CheckoutFragment
import com.example.carzikwanza.fragments.DashboardFragment
import com.example.carzikwanza.fragments.PackageFragment
import com.example.carzikwanza.fragments.ProfileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
@Suppress("DEPRECATION")
class HomePage : AppCompatActivity() {

    private val dashboardFragment = DashboardFragment()
    private val packageFragment = PackageFragment()
    private val checkoutFragment = CheckoutFragment()
    private val profileFragment = ProfileFragment()

    private lateinit var bottomNav :    BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        supportActionBar?.hide()
        bottomNav= findViewById<BottomNavigationView>(R.id.bottom_navigation)

        replaceFragment(dashboardFragment)

        bottomNav.setOnNavigationItemSelectedListener{
            when(it.itemId){
                R.id.ic_dashboard -> replaceFragment(dashboardFragment)
                R.id.ic_profile-> replaceFragment(profileFragment)
                R.id.checkout-> replaceFragment(checkoutFragment)
                R.id.packages -> replaceFragment(packageFragment)
            };true
        }


    }
    private fun replaceFragment(fragment: Fragment){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()


    }
}