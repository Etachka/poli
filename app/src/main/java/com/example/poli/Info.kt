package com.example.poli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class Info : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
        val button = findViewById<ImageButton>(R.id.imageButton5)
        button.setOnClickListener {
            val intent = Intent(this, List::class.java)
            startActivity(intent)
        }
    }
}