package com.example.compose.shgbievi

import android.net.Uri
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.compose.shgbievi.survey.PickedSurveyRepo
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.compose.jetsurvey.R.layout.activity_main)
        val navView: NavigationView = findViewById(com.example.compose.jetsurvey.R.id.nav_view)
        val navController = findNavController(com.example.compose.jetsurvey.R.id.nav_host_fragment)
        navView.setupWithNavController(navController)

        val data: Uri? = intent?.data
        data?.let { uri ->
            if (uri.toString().contains("good_anime")) {
                Log.e(MainActivity::class.java.name, "good anime handled")
                PickedSurveyRepo.pickedSurvey = 1
            }
            if (uri.toString().contains("bad_anime")) {
                Log.e(MainActivity::class.java.name, "bad anime handled")
                PickedSurveyRepo.pickedSurvey = 2
            }

        }
    }
}
