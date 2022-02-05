package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()
    }

    fun new1choice(view: android.view.View) {
        val intent = Intent(this,MainActivity4::class.java)
        var a=3;var k=0;var b=0;var y=0;var s=3;
        intent.putExtra("a1",a)
        intent.putExtra("k1",k)
        intent.putExtra("b1",b)
        intent.putExtra("y1",y)
        intent.putExtra("s1",s)
        startActivity(intent)
    }

    fun thirdchoice(view: android.view.View) {
        val intent = Intent(this,MainActivity4::class.java)
        var a=0;var k=0;var b=3;var y=0;var s=0;
        intent.putExtra("a1",a)
        intent.putExtra("k1",k)
        intent.putExtra("b1",b)
        intent.putExtra("y1",y)
        intent.putExtra("s1",s)
        startActivity(intent)
    }

    fun new2choice(view: android.view.View) {
        val intent = Intent(this,MainActivity4::class.java)
        var a=0;var k=3;var b=0;var y=3;var s=0;
        intent.putExtra("a1",a)
        intent.putExtra("k1",k)
        intent.putExtra("b1",b)
        intent.putExtra("y1",y)
        intent.putExtra("s1",s)
        startActivity(intent)

    }
}