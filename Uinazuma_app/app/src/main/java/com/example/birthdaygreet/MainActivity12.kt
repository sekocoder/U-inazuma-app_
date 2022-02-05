package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity12 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
        supportActionBar?.hide()
    }

    fun fiftychoice(view: android.view.View) {

        var a4: Int =intent.getIntExtra("a3",0)
        var k4: Int =intent.getIntExtra("k3",0)
        var b4: Int =intent.getIntExtra("b3",0)
        var y4: Int =intent.getIntExtra("y3",0)
        var s4: Int =intent.getIntExtra("s3",0)

        val intent = Intent(this,MainActivity13::class.java)

        var a5=a4+3;var k5=k4;var b5=b4+3;var y5=y4;var s5=s4;
        intent.putExtra("a5",a5)
        intent.putExtra("k5",k5)
        intent.putExtra("b5",b5)
        intent.putExtra("y5",y5)
        intent.putExtra("s5",s5)
        startActivity(intent)
    }
    fun fiftyonechoice(view: android.view.View) {
        var a4: Int =intent.getIntExtra("a3",0)
        var k4: Int =intent.getIntExtra("k3",0)
        var b4: Int =intent.getIntExtra("b3",0)
        var y4: Int =intent.getIntExtra("y3",0)
        var s4: Int =intent.getIntExtra("s3",0)

        val intent = Intent(this,MainActivity13::class.java)
        var a5=a4;var k5=k4+3;var b5=b4;var y5=y4+3;var s5=s4;
        intent.putExtra("a5",a5)
        intent.putExtra("k5",k5)
        intent.putExtra("b5",b5)
        intent.putExtra("y5",y5)
        intent.putExtra("s5",s5)
        startActivity(intent)

    }
}