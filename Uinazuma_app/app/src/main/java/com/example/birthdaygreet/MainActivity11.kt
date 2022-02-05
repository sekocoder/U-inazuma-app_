package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity11 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main11)
        supportActionBar?.hide()
    }

    fun kokomibackchoice(view: android.view.View) {
        val intent = Intent(this,Homractivity::class.java)
        startActivity(intent)
    }
}