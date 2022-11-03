package com.example.myresume

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class AboutPage : AppCompatActivity() {
    private lateinit var gmail : ImageView
    private lateinit var phone : ImageView
    private lateinit var linkedin : ImageView
    private lateinit var github : ImageView
    private lateinit var twitter : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)
        gmail = findViewById(R.id.gmail)
        phone = findViewById(R.id.phone)
        linkedin = findViewById(R.id.linkedin)
        github = findViewById(R.id.github)
        twitter = findViewById(R.id.twitter)

        gmail.setOnClickListener {
            emailADD("esetobore1@gmail.com")
        }
        phone.setOnClickListener {
            callIntent("09013998673")
        }
        linkedin.setOnClickListener {
           webInt("https://www.linkedin.com/in/esetobore-akpokiniovo-835075243")
        }
        github.setOnClickListener {
            webInt("https://github.com/Esetobore")
        }
        twitter.setOnClickListener {
           webInt("https://twitter.com/Esetobore?t=NUyaVjKY3NoX_hOZWYA9Cw&s=09")
        }
    }
    private fun webInt (uri : String){
        val webInt = Intent(android.content.Intent.ACTION_VIEW)
        webInt.data = Uri.parse(uri)
        startActivity(webInt)
    }
    private fun callIntent(num :String){
        val callIntent = Intent(Intent.ACTION_DIAL)
        callIntent.data = Uri.parse("tel:$num")
        startActivity(callIntent)
    }
    private fun emailADD(emailId : String){
        val email = Intent(Intent.ACTION_SEND)
        email.type = "text/plain"
        email.putExtra(Intent.EXTRA_EMAIL, arrayOf(emailId))
        startActivity(email)
    }
}
