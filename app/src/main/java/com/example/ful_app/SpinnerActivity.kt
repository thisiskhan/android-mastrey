package com.example.ful_app

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast

import androidx.appcompat.app.AppCompatActivity


class SpinnerActivity  : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.spinner_latout)

        val spinner: Spinner = findViewById(R.id.spinnerView)

        val items = arrayOf("Android", "iOS", "Flutter", "Kotlin", "Java", "Swift")

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, items)

        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                val selectedItem = items[position]
                Toast.makeText(applicationContext, "selected $selectedItem", Toast.LENGTH_SHORT).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                //Do
            }
        }

    }
}