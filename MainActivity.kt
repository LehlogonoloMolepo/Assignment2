package com.example.myassignment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val button_next = findViewById<Button>(R.id.btn_next)

        button_next.setOnClickListener{
            intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

        }
    }
}