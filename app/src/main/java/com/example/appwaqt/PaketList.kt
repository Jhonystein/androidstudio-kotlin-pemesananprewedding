package com.example.appwaqt

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class PaketList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_paket_list)

        val card1 = findViewById<CardView>(R.id.card1)
        card1.setOnClickListener {
            val intent = Intent(this, Paket1::class.java)
            startActivity(intent)
        }

        val card2 = findViewById<CardView>(R.id.card2)
        card2.setOnClickListener {
            val intent = Intent(this, Paket2::class.java)
            startActivity(intent)
        }
    }
}