package com.example.picturebook

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Page5Activity : AppCompatActivity() {
    lateinit var btnPrevious5:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page5)
        btnPrevious5=findViewById(R.id.btnPrevious5)
        btnPrevious5.setOnClickListener {
            val intent=Intent(this,Page4Activity::class.java)
            startActivity(intent)
        }
    }
}