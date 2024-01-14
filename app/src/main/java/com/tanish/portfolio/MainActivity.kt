package com.tanish.portfolio

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonProject = findViewById<Button>(R.id.projectsBtn)
        buttonProject.setOnClickListener {
            intent = Intent(this, ProjectActivity::class.java)
            startActivity(intent)
        }


        val buttonSkills = findViewById<Button>(R.id.skills)
        buttonSkills.setOnClickListener {
            intent = Intent(this,SkillsActivity::class.java)
            startActivity(intent)
        }


        val buttonAboutMe = findViewById<Button>(R.id.aboutMe)
        buttonAboutMe.setOnClickListener {
            intent =Intent(this, AboutMeActivity::class.java)
            startActivity(intent)
        }

        val  buttonResume = findViewById<Button>(R.id.Resume)
        buttonResume.setOnClickListener {
            intent = Intent(this,ResumeActivity::class.java)
            startActivity(intent)
        }

    }
}