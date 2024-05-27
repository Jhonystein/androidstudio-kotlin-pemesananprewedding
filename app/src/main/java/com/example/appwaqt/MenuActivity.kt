package com.example.appwaqt

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MenuActivity : AppCompatActivity() {
    lateinit var cardView: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val cd1 = findViewById<CardView>(R.id.cd1)
        cd1.setOnClickListener {
            Intent(this, PaketList:: class.java).also {
                startActivity(it)
            }
        }

        cardView = findViewById(R.id.cd2)

        cardView.setOnClickListener{
            openUrl("https://docs.google.com/forms/d/e/1FAIpQLSe6k8q4c9aZm0UIGotALgbx2uy2Uc5zFLZThNPbfX__C42wZQ/viewform")
        }

        val cd3 = findViewById<CardView>(R.id.cd3)
         cd3.setOnClickListener {
             Intent(this, ContactActivity:: class.java).also {
                 startActivity(it)
             }
         }

        val cd4 = findViewById<CardView>(R.id.cd4)
        cd4.setOnClickListener {
            Intent(this, GalleryActivity:: class.java).also {
                startActivity(it)
            }
        }

    }

    private fun openUrl(link:String) {
        val uri = Uri.parse(link)
        val intent = Intent(Intent.ACTION_VIEW, uri)
        startActivity(intent)
    }
}