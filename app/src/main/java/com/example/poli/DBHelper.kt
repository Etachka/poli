package com.example.poli

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.HorizontalScrollView
import android.widget.TextView
import androidx.core.content.contentValuesOf
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import java.text.FieldPosition

class DBHelper(context: Context):
    SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION){
    companion object{
        private val DATABASE_NAME = "Rasulchick.db"
        private val DATABASE_VERSION = 1

        private val Llist = "Llist"
        private val listId = "listId"
        private val name = "name"
        private val nnotes = "nnotes"

        private val User = "User"
        private val userId = "userId"
        private val secondName = "secondName"
        private val firstName = "firstName"
        private val patronymic = "patronymic"
        private val phone = "phone"
        private val login = "login"
        private val password = "password"
    }
//Создание таблиц
    override fun onCreate(db: SQLiteDatabase?) {
        val user = ("create table $User (" +
                "userId int primary key, " +
                "secondName varchar(40), " +
                "firstName varchar(40), " +
                "patronymic varchar(40), " +
                "phone string(11), " +
                "login varchar(40), " +
                "password varchar(40))")

        val list = ("create table $Llist (" +
                "listId int primary key, " +
                "name varchar(40), " +
                "nnotes varchar(40))")
    db?.execSQL(list)
    db?.execSQL(user)
    }
//Удаление таблиц если существуют
    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("Drop table if exists $Llist")
        db!!.execSQL("Drop table if exists $User")
        onCreate(db)
    }
//Получение списка дел
    fun getLlist(): ArrayList<Llist> {
    val ListList: ArrayList<Llist> = ArrayList()

    val query = "Select $listId, $name, $nnotes from $Llist"
    val db = this.readableDatabase

    val cursor: Cursor?
    cursor = db.rawQuery(query, null)

    var listId: Int
    var name: String
    var nnotes: String
    if(cursor.moveToFirst())
    {
        do {
            listId = cursor.getInt(0)
            name = cursor.getString(1)
            nnotes = cursor.getString(2)
            val lst = Llist(listId = listId, name = name, nnotes = nnotes)
            ListList.add(lst)
        }while (cursor.moveToNext())
    }
    return ListList
    }
//Добавление нового дела
    fun addLlist(lst:Llist):Long{
    val db = this.writableDatabase
    val values = ContentValues()
    values.put("listId", lst.listId)
    values.put("name", lst.name)
    values.put("notes", lst.nnotes)

    val success = db.insert("$Llist", null, values)
    db.close()
    return success
    }
    class RecyclerListClasses: RecyclerView.Adapter<RecyclerListClasses.MyVH>(){
        private var ListList: ArrayList<Llist> = ArrayList()

        fun addItems(items: ArrayList<Llist>){
            this.ListList = items
            notifyDataSetChanged()
        }
        class MyVH(itemView: View):RecyclerView.ViewHolder(itemView){
            val id: TextView = itemView.findViewById(R.id.)
            val name: TextView = itemView.findViewById(R.id.)
            val nnotes: TextView = itemView.findViewById(R.id.textViewDescription)

            fun bindView(lst:Llist){
                id.text = lst.listId.toString()
                name.text = lst.name
                nnotes.text = lst.nnotes
            }
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyVH{
            val root = LayoutInflater.from(parent.context).inflate(R.layout.activity_info,parent,false)
            return MyVH(root)
        }
        override fun onBindViewHolder(holder: RecyclerListClasses.MyVH,position: Int){
            val info = ListList[position]
            holder.bindView(info)
        }
        override fun getItemCount(): Int{
            return ListList.size
        }
    }
}

