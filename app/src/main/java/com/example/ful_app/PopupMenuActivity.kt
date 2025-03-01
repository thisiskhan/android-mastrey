package com.example.ful_app

import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PopupMenuActivity :AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_pop_up_menu)

        val popupButton = findViewById<Button>(R.id.popupMenuButton)


        popupButton.setOnClickListener { view ->
            showPopUpMenu(view)
        }



    }

    private  fun showPopUpMenu(view : View){
        val popupMenu = PopupMenu(this, view)
        popupMenu.menuInflater.inflate(R.menu.popup_menu, popupMenu.menu)


        popupMenu.setOnMenuItemClickListener { item: MenuItem ->
            when (item.itemId){
                R.id.share_pop_up -> {
                    Toast.makeText(this, "Share Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.favorite_pop_up -> {
                    Toast.makeText(this, "Favorite Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.delete_pop_up -> {
                    Toast.makeText(this, "Delete Clicked", Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }


        }

        popupMenu.show()
    }
}