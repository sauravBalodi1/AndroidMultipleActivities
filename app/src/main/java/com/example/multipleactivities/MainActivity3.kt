package com.example.multipleactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btn=findViewById<Button>(R.id.frag3btn)
        var GoBackToFirstActivity=findViewById<Button>(R.id.frag3btnFirstActivity)
        btn.setOnClickListener {
            supportFragmentManager.beginTransaction().replace(R.id.fragment3Container,FirstFrag()).commit()//fragment
        }
        GoBackToFirstActivity.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))

        }
//        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,FirstFrag()).commit()
    }


}