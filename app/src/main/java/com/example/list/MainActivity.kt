package com.example.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var listView = findViewById<ListView>(R.id.items)
        var list = mutableListOf<Model>()
        addButton.setOnClickListener {
            list.add(Model(typeText.text.toString()))
            listView.adapter = MyAdapter(this,R.layout.row,list)
            listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->}
        }
    }
}
