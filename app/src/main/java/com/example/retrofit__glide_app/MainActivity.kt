package com.example.retrofit__glide_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.retrofit__glide_app.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding

//--------------------------------------------------------------------------------------------------


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)


        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottom_nav_controller)

        val navController = findNavController(R.id.fragmentContainerView)


        bottomNavigationView.setupWithNavController(navController)

    }


//--------------------------------------------------------------------------------------------------

}