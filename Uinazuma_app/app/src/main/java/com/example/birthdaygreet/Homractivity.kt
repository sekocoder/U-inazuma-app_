package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Homractivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homractivity)
        supportActionBar?.hide()
    }

    fun firstChoice(view: android.view.View) {
        val intent = Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    fun secondChoice(view: android.view.View) {
        val intent2 = Intent(this,MainActivity3::class.java)
        startActivity(intent2)
    }

    fun RosterChoice(view: android.view.View) {
        val intent2 = Intent(this,MainActivity9::class.java)
        startActivity(intent2)
    }
}