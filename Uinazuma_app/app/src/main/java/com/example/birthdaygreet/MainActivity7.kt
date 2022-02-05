package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)
        supportActionBar?.hide()
    }

    fun back2choice(view: android.view.View) {
        val intent = Intent(this,Homractivity::class.java)
        startActivity(intent)
    }
}