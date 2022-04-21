package com.example.responsibaper2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnmath : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnmath = findViewById(R.id.imgmath)

        btnmath.setOnClickListener {
            val intent = Intent(this, MathActivity::class.java)
            intent.putExtra("", "")
            startActivity(intent)
        }
    }
}