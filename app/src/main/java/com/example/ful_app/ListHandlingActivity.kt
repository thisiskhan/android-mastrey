package com.example.ful_app

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class ListHandlingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.item_list)

        val listView = findViewById<ListView>(R.id.listView)

        val items = arrayOf("Raza", "Kaif", "Shakeel")

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, items)

        listView.adapter = adapter
    }
}