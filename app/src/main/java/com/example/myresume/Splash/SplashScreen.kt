package com.example.myresume.Splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.HandlerCompat.postDelayed
import com.airbnb.lottie.LottieAnimationView
import com.example.myresume.MainActivity
import com.example.myresume.ProjectPage
import com.example.myresume.R
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val lottieImage1 = findViewById<LottieAnimationView>(R.id.lottie)
        val lottieImage2 = findViewById<LottieAnimationView>(R.id.lottie2)

        lottieImage1.animate().translationY(1500f).setDuration(1000).startDelay = 5000
        lottieImage2.animate().translationY(1500f).setDuration(1000).startDelay = 5000

        GlobalScope.launch (Dispatchers.Default){
            intent()
        }
}

    private suspend fun intent(){
        delay(6000)
        startActivity(Intent(this, MainActivity::class.java))
    }
}