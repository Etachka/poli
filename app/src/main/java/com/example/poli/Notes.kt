package com.example.poli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import kotlin.collections.List

class Notes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)
        val button = findViewById<ImageButton>(R.id.buttonNotes)
        button.setOnClickListener {
            val intent = Intent(this, Info::class.java)
            startActivity(intent)
        }
    }
}