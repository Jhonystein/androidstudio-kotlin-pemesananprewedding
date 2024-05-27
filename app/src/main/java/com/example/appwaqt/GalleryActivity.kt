package com.example.appwaqt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class GalleryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery)

        val images = listOf<Image>(
            Image("", R.drawable.img1),
            Image("", R.drawable.img2),
            Image("", R.drawable.img3),
            Image("", R.drawable.img5),
            Image("", R.drawable.img6),
            Image("", R.drawable.img7),
            Image("", R.drawable.img8),
            Image("", R.drawable.img9),
            Image("", R.drawable.img10),
            Image("", R.drawable.img11),
            Image("", R.drawable.img12),
            Image("", R.drawable.img4)

        )

        val recyclerView = findViewById<RecyclerView>(R.id.imagesRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, images)

    }
}