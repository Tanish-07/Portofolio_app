package com.tanish.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SkillsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skills)

        val skillbutton = findViewById<Button>(R.id.skills2)
        skillbutton.isEnabled = false



    }
}