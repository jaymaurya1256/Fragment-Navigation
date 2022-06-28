package com.example.fragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import com.example.fragment.databinding.ActivityMainBinding
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment)
                as NavHostFragment
        navController = navHostFragment.navController

        binding.f1.isEnabled = false
        binding.f1.setOnClickListener{
            binding.f1.isEnabled = false
            binding.f2.isEnabled = true
            val action = Fragment2Directions.actionFragment2ToFragment1()
            navController.navigate(action)
        }
        binding.f2.setOnClickListener{
            binding.f2.isEnabled = false
            binding.f1.isEnabled = true
            val action = Fragment1Directions.actionFragment1ToFragment2()
            navController.navigate(action)
        }
    }
}