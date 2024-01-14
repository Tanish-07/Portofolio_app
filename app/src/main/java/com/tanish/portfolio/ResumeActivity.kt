package com.tanish.portfolio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class ResumeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resume)


        val resumeButton =findViewById<Button>(R.id.resumehead)
        resumeButton.isEnabled =false

        val card = findViewById<CardView>(R.id.resumecard)
        card.setOnClickListener {
            intent = Intent(this,FullScreenActivity::class.java)
            startActivity(intent)
        }
    }
}