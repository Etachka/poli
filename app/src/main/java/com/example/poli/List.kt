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
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler

import kotlin.collections.List

lateinit var recyclerView: RecyclerView
lateinit var sqlDBHelper: DBHelper

private var adapter: DBHelper.RecyclerListClasses?=null
private var lst: Llist?=null

class List<T> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        sqlDBHelper = DBHelper(this)
        recyclerView = findViewById(R.id.rcl)
        adapter = DBHelper.RecyclerListClasses()
        recyclerView.adapter = adapter

        val lst = sqlDBHelper.getLlist()
        adapter?.addItems(lst)
        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener {
            val intent = Intent(this, Info::class.java)
            startActivity(intent)
        }
    }

    fun ccc(view: View) {

    }
}