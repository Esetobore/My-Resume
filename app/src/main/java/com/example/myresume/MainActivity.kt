package com.example.myresume

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.transition.Transition
import android.transition.TransitionInflater
import android.transition.TransitionManager
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    private lateinit var aboutPage : ImageView
    private lateinit var myWorkPage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aboutPage = findViewById(R.id.about_me)
        myWorkPage = findViewById(R.id.my_work)
        aboutPage.setOnClickListener {
            startActivity(Intent(this, AboutPage::class.java))
        }
        myWorkPage.setOnClickListener {
            startActivity(Intent(this, ProjectPage::class.java))
        }
    }
}