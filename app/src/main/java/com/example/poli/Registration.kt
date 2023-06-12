package com.example.poli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import kotlin.collections.List

class Registration : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

        // Переход на окно авторизации
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Переход на окно авторизации
        val buttonReg = findViewById<Button>(R.id.button2)
        buttonReg.setOnClickListener {
            validateEditTexts()
        }
    }

    private fun validateEditTexts() {
        val editText1 = findViewById<EditText>(R.id.editTextTextPassword3)
        val editText2 = findViewById<EditText>(R.id.editTextTextPassword6)
        val editText3 = findViewById<EditText>(R.id.editTextTextPassword7)
        val editText4 = findViewById<EditText>(R.id.editTextTextPassword8)
        val editText5 = findViewById<EditText>(R.id.editTextTextPassword9)
        val editText6 = findViewById<EditText>(R.id.editTextTextPassword10)

        val text1 = editText1.text.toString().trim()
        val text2 = editText2.text.toString().trim()
        val text3 = editText3.text.toString().trim()
        val text4 = editText4.text.toString().trim()
        val text5 = editText5.text.toString().trim()
        val text6 = editText6.text.toString().trim()

        if (text1.isEmpty() || text2.isEmpty() || text3.isEmpty() || text4.isEmpty() || text5.isEmpty() || text6.isEmpty()) {
            Toast.makeText(this, "Заполните все поля", Toast.LENGTH_SHORT).show()
        } else {
            // Метод добавления пользователя в базу данных

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}