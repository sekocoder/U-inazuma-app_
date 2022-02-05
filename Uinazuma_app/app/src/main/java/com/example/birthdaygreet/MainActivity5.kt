package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        supportActionBar?.hide()


    }

    fun fifthhchoice(view: android.view.View) {
        var a7: Int =intent.getIntExtra("a7",0)
        var k7: Int =intent.getIntExtra("k7",0)
        var b7: Int =intent.getIntExtra("b7",0)
        var y7: Int =intent.getIntExtra("y7",0)
        var s7: Int =intent.getIntExtra("s7",0)


        val intent1 = Intent(this,MainActivity6::class.java)
        val intent2 = Intent(this,MainActivity8::class.java)
        val intent3 = Intent(this,MainActivity7::class.java)
        val intent4 = Intent(this,MainActivity10::class.java)
        val intent5 = Intent(this,MainActivity11::class.java)

        val valuesz = listOf(a7,k7,b7,y7,s7)

        when (valuesz.maxOrNull() ?:0) {
              a7 -> startActivity(intent1)
              k7 -> startActivity(intent2)
              b7 -> startActivity(intent3)
              y7 -> startActivity(intent4)
              s7 -> startActivity(intent5)
         }

    }

}