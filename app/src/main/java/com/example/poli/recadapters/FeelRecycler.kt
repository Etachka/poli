package com.example.poli.recadapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.poli.R

class FeelRecycler(val context: Context, val list: ArrayList<Data>) : RecyclerView.Adapter<FeelRecycler.MyVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeelRecycler.MyVH {
        val root = LayoutInflater.from(context).inflate(R.layout.feel_adapter,parent,false)
        return MyVH(root)
    }

    class MyVH(itemView: View): RecyclerView.ViewHolder(itemView){
        val textView: TextView = itemView.findViewById(R.id.text_ID)
    }

    override fun onBindViewHolder(holder: FeelRecycler.MyVH, position: Int) {
        holder.textView.text = MyData().list[position].idname.toString()
    }

    override fun getItemCount(): Int {
        return list.size
    }

}