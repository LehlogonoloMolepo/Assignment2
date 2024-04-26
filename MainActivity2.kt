package com.example.myassignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AlphaAnimation
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {

    private var petHealth = 100
    private var petHunger = 50
    private var petCleanliness = 50


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnFeed = findViewById<Button>(R.id.btn_feed)
        val btnClean = findViewById<Button>(R.id.btn_clean)
        val btnHappy = findViewById<Button>(R.id.btn_happy)
        val txtHunger =findViewById<EditText>(R.id.pethungry)
        val txtClean = findViewById<EditText>(R.id.petClean)
        val txtHappy = findViewById<EditText>(R.id.pethappy)
        val petImage = findViewById<ImageView>(R.id.pet_image)

        txtHunger.setText(petHunger. toString())
        txtClean.setText(petCleanliness.toString())
        txtHappy.setText(petHealth.toString()
        )
        btnFeed.setOnClickListener{
            petHunger-=10
            petHealth+=10
            petHunger+=5
            txtHunger.setText(petHunger.toString())
            animateImageChange(petImage, R.drawable.eat_eating_icon)
        }

        btnClean.setOnClickListener{
            petCleanliness-=10
            petHealth+=10

            txtClean.setText(petCleanliness.toString())
            animateImageChange(petImage, R.drawable.dog_cleaning_icon)
        }

        btnHappy.setOnClickListener{
            petHealth+=10
            petHunger+=5
            petCleanliness-=5
            txtHappy.setText(petHealth.toString())
            animateImageChange(petImage, R.drawable.happy_dog_icon)
        }

    }
    private fun animateImageChange(imageView: ImageView, newImageResource: Int) {
       val animation = AlphaAnimation(0.0f, 1.0f)
       animation.duration = 500
       animation.fillAfter = true
       imageView.startAnimation(animation)
       imageView.setImageResource(newImageResource)

    }
}