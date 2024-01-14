package com.tanish.portfolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ProjectActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_project)

        val Button2 =findViewById<Button>(R.id.button2)
        Button2.isEnabled = false

    }
}