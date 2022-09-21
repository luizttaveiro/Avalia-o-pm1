package com.example.exercicolayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.exercicolayout.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val resultTextView: TextView = findViewById(R.id.textView)
            val rollButton: Button = findViewById(R.id.button)
            rollButton.setOnClickListener {
                rollDice()
            }
            resultTextView.text = "6"
        }


        }
    fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            rollButton
        }
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
    }
class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()


    }
}

