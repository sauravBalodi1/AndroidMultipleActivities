package com.example.multipleactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var btn=findViewById<Button>(R.id.frag1btn)
        var bt2=findViewById<Button>(R.id.frag2btn)
        btn.setOnClickListener{
            supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer,FirstFrag()).commit()
        }
        bt2.setOnClickListener{
            Intent(this,MainActivity3::class.java).also{
                startActivity(it)
            }
        }
    }

}