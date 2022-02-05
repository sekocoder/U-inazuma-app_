package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)
        supportActionBar?.hide()
    }

    fun backyoichoice(view: android.view.View) {
        val intent = Intent(this,Homractivity::class.java)
        startActivity(intent)
    }
}