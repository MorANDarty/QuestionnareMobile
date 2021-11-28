package com.example.compose.shgbievi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.compose.jetsurvey.R.layout.activity_main)
        val navView: NavigationView = findViewById(com.example.compose.jetsurvey.R.id.nav_view)
        val navController = findNavController(com.example.compose.jetsurvey.R.id.nav_host_fragment)
        navView.setupWithNavController(navController)
    }
}
