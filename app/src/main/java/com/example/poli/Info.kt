package com.example.poli

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


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
    }

    fun showToast(view: View?) {
        Toast.makeText(applicationContext, "Функция не работает", Toast.LENGTH_SHORT).show()
    }
}