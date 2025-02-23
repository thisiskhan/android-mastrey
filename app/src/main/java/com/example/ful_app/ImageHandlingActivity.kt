package com.example.ful_app

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import  androidx.appcompat.app.AppCompatActivity

class ImageHandlingActivity: AppCompatActivity(){
    private val images = arrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3, R.drawable.image4, R.drawable.image5
    )
    private  var currentIndex  =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.image_handling)

        val imageView = findViewById<ImageView>(R.id.imageView)
        val changeImageButton = findViewById<Button>(R.id.changeImageButton)

        changeImageButton.setOnClickListener {
            currentIndex = (currentIndex + 1) % images.size

            imageView.setImageResource(images[currentIndex])
        }
    }

}