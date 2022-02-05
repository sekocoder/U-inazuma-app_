package com.example.uinazuma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main13)
        supportActionBar?.hide()
    }

    fun fiftytwochoice(view: android.view.View) {

        var a6: Int =intent.getIntExtra("a5",0)
        var k6: Int =intent.getIntExtra("k5",0)
        var b6: Int =intent.getIntExtra("b5",0)
        var y6: Int =intent.getIntExtra("y5",0)
        var s6: Int =intent.getIntExtra("s5",0)

        val intent = Intent(this,MainActivity5::class.java)

        var a7=a6+3;var k7=k6;var b7=b6;var y7=y6;var s7=s6;
        intent.putExtra("a7",a7)
        intent.putExtra("k7",k7)
        intent.putExtra("b7",b7)
        intent.putExtra("y7",y7)
        intent.putExtra("s7",s7)
        startActivity(intent)
    }
    fun fiftythreechoice(view: android.view.View) {
        var a6: Int =intent.getIntExtra("a5",0)
        var k6: Int =intent.getIntExtra("k5",0)
        var b6: Int =intent.getIntExtra("b5",0)
        var y6: Int =intent.getIntExtra("y5",0)
        var s6: Int =intent.getIntExtra("s5",0)

        val intent = Intent(this,MainActivity5::class.java)
        var a7=a6;var k7=k6+2;var b7=b6;var y7=y6+2;var s7=s6+2;
        intent.putExtra("a7",a7)
        intent.putExtra("k7",k7)
        intent.putExtra("b7",b7)
        intent.putExtra("y7",y7)
        intent.putExtra("s7",s7)
        startActivity(intent)
    }
}