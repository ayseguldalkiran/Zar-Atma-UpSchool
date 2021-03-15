package com.aysegul.zaratma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sayi1: TextView = findViewById(R.id.sayi1)
        val sayi2: TextView = findViewById(R.id.sayi2)
        val buton1: Button = findViewById(R.id.zarAtButton)
        val buton2: Button = findViewById(R.id.temizleButton)
        val zarImage1: ImageView = findViewById(R.id.zarImage1)
        val zarImage2: ImageView = findViewById(R.id.zarImage2)


        buton1.setOnClickListener() {
            val random1 = (1..6).random()
            val random2 = (1..6).random()

            sayi1.text = random1.toString()
            sayi2.text = random2.toString()

            when (random1) {
                1 -> zarImage1.setImageResource(R.drawable.dice_1)
                2 -> zarImage1.setImageResource(R.drawable.dice_2)
                3 -> zarImage1.setImageResource(R.drawable.dice_3)
                4 -> zarImage1.setImageResource(R.drawable.dice_4)
                5 -> zarImage1.setImageResource(R.drawable.dice_5)
                6 -> zarImage1.setImageResource(R.drawable.dice_6)

            }

            when (random2) {
                1 -> zarImage2.setImageResource(R.drawable.dice_1)
                2 -> zarImage2.setImageResource(R.drawable.dice_2)
                3 -> zarImage2.setImageResource(R.drawable.dice_3)
                4 -> zarImage2.setImageResource(R.drawable.dice_4)
                5 -> zarImage2.setImageResource(R.drawable.dice_5)
                6 -> zarImage2.setImageResource(R.drawable.dice_6)

            }
            val text = "Zar atıldı"
            val duration = Toast.LENGTH_SHORT

            val toast = Toast.makeText(applicationContext, text, duration)
            toast.show()


        }

        buton2.setOnClickListener() {

            zarImage1.setImageResource(R.drawable.empty_dice)
            zarImage2.setImageResource(R.drawable.empty_dice)

            sayi1.text = " "
            sayi2.text = " "

        }

    }

}
