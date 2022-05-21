package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page4Activity : AppCompatActivity() {
    lateinit var btnPrevious4:Button
    lateinit var btnNext4:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page4)
        btnPrevious4=findViewById(R.id.btnPrevious4)
        btnPrevious4.setOnClickListener {
            val intent= Intent(this,Page3Activity::class.java)
            startActivity(intent)

        }
        btnNext4=findViewById(R.id.btnNext4)
        btnNext4.setOnClickListener {
            val intent=Intent(this,Page5Activity::class.java)
            startActivity(intent)
        }
    }
}