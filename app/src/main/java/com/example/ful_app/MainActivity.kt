package com.example.ful_app

import android.content.Intent
import android.os.Bundle
import android.widget.Button

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar


class MainActivity : AppCompatActivity(){
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)

    setContentView(R.layout.activity_main)

    val toolbar: Toolbar = findViewById(R.id.toolbar)
    setSupportActionBar(toolbar)

    findViewById<Button>(R.id.imageHandlingButton).setOnClickListener{
      startActivity(Intent(this,ImageHandlingActivity::class.java ))
    }
//
//   findViewById<Button>(R.id.listHandlingButton).setOnClickListener {
//     startActivity(Intent(this, ListHandlingActivity::class.java))
//   }

//      findViewById<Button>(R.id.listHandlingButton).setOnClickListener {
//          startActivity(Intent(this, RecyclerViewActivity::class.java))
//      } //SpinnerActivity

    findViewById<Button>(R.id.listHandlingButton).setOnClickListener {
      startActivity(Intent(this, SpinnerActivity::class.java))
    }

    findViewById<Button>(R.id.optionsMenuButton).setOnClickListener {
      startActivity(Intent(this, OptionsMenuActivity::class.java))
    }

    findViewById<Button>(R.id.contextMenuButton).setOnClickListener {
      startActivity(Intent(this, ContextMenuActivity::class.java))
    }

    findViewById<Button>(R.id.popupMenuButton).setOnClickListener {
      startActivity(Intent(this, PopupMenuActivity::class.java))
    }

  }
}