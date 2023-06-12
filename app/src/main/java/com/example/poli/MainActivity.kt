package com.example.poli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // hihihi
        val button = findViewById<Button>(R.id.button3)
        button.setOnClickListener {
            validateAndProcessData()
        }

        // Переход на окно регистрации
        val buttonReg = findViewById<Button>(R.id.button4)
        buttonReg.setOnClickListener {
            val intent = Intent(this, Registration::class.java)
            startActivity(intent)
        }
    }

    // Метод проверки данных для входа
    private fun validateAndProcessData() {
        val loginEditText = findViewById<EditText>(R.id.editTextTextPassword)
        val PasswordEditText = findViewById<EditText>(R.id.editTextTextPassword2)

        val login = loginEditText.text.toString()
        val confirmPassword = PasswordEditText.text.toString()

        if (login != "UsEr" && confirmPassword != "1212") {
            val message = "Некорректный ввод"
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(this, List::class.java)
            startActivity(intent)
        }
    }
}