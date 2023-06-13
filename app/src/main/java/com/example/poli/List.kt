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
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler
import com.example.poli.recadapters.Data
import com.example.poli.recadapters.FeelRecycler
import com.example.poli.recadapters.MyData

import kotlin.collections.List

lateinit var recyclerView: RecyclerView
lateinit var sqlDBHelper: DBHelper

private var adapter: DBHelper.RecyclerListClasses?=null
private var lst: Llist?=null

class List<T> : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val root: View = findViewById(android.R.id.content)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

        val feel_Recycler : RecyclerView = root.findViewById(R.id.rcl)
        feel_Recycler.adapter = FeelRecycler(this,MyData().list)

        val button = findViewById<Button>(R.id.button5)
        button.setOnClickListener {
            val intent = Intent(this, Info::class.java)
            startActivity(intent)
        }
    }

    fun ccc(view: View) {

    }
}