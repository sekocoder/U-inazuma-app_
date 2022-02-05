package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)
        supportActionBar?.hide()
    }

    fun back3choice(view: android.view.View) {
        val intent = Intent(this,Homractivity::class.java)
        startActivity(intent)
    }
}