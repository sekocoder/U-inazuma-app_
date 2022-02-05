package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class  MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        supportActionBar?.hide()
    }

    fun guidebackchoice(view: android.view.View) {
        val intent = Intent(this,Homractivity::class.java)
        startActivity(intent)
    }
}