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
        val buttonSketch = findViewById<ImageButton>(R.id.imageButton)
        buttonSketch.setOnClickListener {
            val intent = Intent(this, Sketches::class.java)
            startActivity(intent)
        }
        val buttonNotes = findViewById<ImageButton>(R.id.imageButton2)
        buttonNotes.setOnClickListener {
            val intent = Intent(this, Notes::class.java)
            startActivity(intent)
        }
        val buttonPhoto = findViewById<ImageButton>(R.id.imageButton3)
        buttonPhoto.setOnClickListener {
            val intent = Intent(this, Photo::class.java)
            startActivity(intent)
        }
        val buttonIdentikit = findViewById<ImageButton>(R.id.imageButton4)
        buttonIdentikit.setOnClickListener {
            val intent = Intent(this, Identikit::class.java)
            startActivity(intent)
        }
    }
}