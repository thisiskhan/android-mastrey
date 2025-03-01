package com.example.ful_app

import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuItem
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ContextMenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_contect_menu) // Context Menu Activity

        val textView = findViewById<TextView>(R.id.longPressText)

        registerForContextMenu(textView)
    }

    override fun onCreateContextMenu(menu: ContextMenu?, v: View?, menuInfo: ContextMenu.ContextMenuInfo?) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.context_menu, menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {

       return  when (item.itemId){
           R.id.action_edit_context ->{
               Toast.makeText(this, "Edit Clicked", Toast.LENGTH_SHORT).show()
               true
           }
           R.id.action_delete_context ->{
               Toast.makeText(this, "Delete Clicked", Toast.LENGTH_SHORT).show()
               true
           }
           else -> super.onContextItemSelected(item)
       }
    }

}