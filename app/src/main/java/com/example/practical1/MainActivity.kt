package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import android.widget.Toast.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Get the buttom view from the layout and assign a click

        val rollButton: Button = findViewById(R.id.rollBtn)
        rollButton.setOnClickListener{rollDice()}
    }

    private fun rollDice(){
        Toast.makeText( this,"Dice is rolled", LENGTH_SHORT).show()
        val randomInt=(1 .. 6).random()

        val resultText: TextView = findViewById(R.id.rollBtn)
        resultText.text=randomInt.toString()
    }
}