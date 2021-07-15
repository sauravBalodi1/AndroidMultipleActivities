package com.example.multipleactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var btn=findViewById<Button>(R.id.btn1)
        btn.setOnClickListener{
            Intent(this,MainActivity2::class.java).also {
                startActivity(it)
            }
        }
    }
}