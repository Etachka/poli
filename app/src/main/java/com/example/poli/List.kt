package com.example.poli

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.GridView
import androidx.appcompat.app.AppCompatActivity

import kotlin.collections.List

class List<T> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener {
            val intent = Intent(this, Info::class.java)
            startActivity(intent)
        }
    }

    fun ccc(view: View) {

    }
}