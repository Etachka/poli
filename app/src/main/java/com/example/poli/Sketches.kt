package com.example.poli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlin.collections.List

class Sketches : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sketches)
        val button = findViewById<ImageButton>(R.id.imageButton9)
        button.setOnClickListener {
            val intent = Intent(this, Info::class.java)
            startActivity(intent)

        }
    }
}