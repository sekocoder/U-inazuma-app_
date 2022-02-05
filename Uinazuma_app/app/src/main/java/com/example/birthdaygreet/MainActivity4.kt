package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        supportActionBar?.hide()

    }

    fun baalchoice(view: android.view.View) {

        var a2: Int =intent.getIntExtra("a1",0)
        var k2: Int =intent.getIntExtra("k1",0)
        var b2: Int =intent.getIntExtra("b1",0)
        var y2: Int =intent.getIntExtra("y1",0)
        var s2: Int =intent.getIntExtra("s1",0)

        val intent = Intent(this,MainActivity12::class.java)
        var a3=a2;var k3=k2;var b3=b2+3;var y3=y2;var s3=s2;
        intent.putExtra("a3",a3)
        intent.putExtra("k3",k3)
        intent.putExtra("b3",b3)
        intent.putExtra("y3",y3)
        intent.putExtra("s3",s3)
        startActivity(intent)

    }

    fun fourthchoice(view: android.view.View) {

        var a2: Int =intent.getIntExtra("a1",0)
        var k2: Int =intent.getIntExtra("k1",0)
        var b2: Int =intent.getIntExtra("b1",0)
        var y2: Int =intent.getIntExtra("y1",0)
        var s2: Int =intent.getIntExtra("s1",0)

        val intent = Intent(this,MainActivity12::class.java)

        var a3=a2+3;var k3=k2+3;var b3=b2;var y3=y2;var s3=s2;
        intent.putExtra("a3",a3)
        intent.putExtra("k3",k3)
        intent.putExtra("b3",b3)
        intent.putExtra("y3",y3)
        intent.putExtra("s3",s3)
        startActivity(intent)
    }

    fun ayakachoice(view: android.view.View) {
        var a2: Int =intent.getIntExtra("a1",0)
        var k2: Int =intent.getIntExtra("k1",0)
        var b2: Int =intent.getIntExtra("b1",0)
        var y2: Int =intent.getIntExtra("y1",0)
        var s2: Int =intent.getIntExtra("s1",0)

        val intent = Intent(this,MainActivity12::class.java)
        var a3=a2+3;var k3=k2;var b3=b2;var y3=y2+2;var s3=s2+3;
        intent.putExtra("a3",a3)
        intent.putExtra("k3",k3)
        intent.putExtra("b3",b3)
        intent.putExtra("y3",y3)
        intent.putExtra("s3",s3)
        startActivity(intent)
    }

}