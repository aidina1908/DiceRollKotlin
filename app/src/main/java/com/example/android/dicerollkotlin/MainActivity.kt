package com.example.android.dicerollkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.diceRoll)
        findViewById<ImageView>(R.id.view1)
        findViewById<ImageView>(R.id.view2)

        diceRoll.setOnClickListener({
            diceRoll1()
            diceRoll2()
        })
    }

    private fun diceRoll2() {
        val randomNumber = Random.nextInt(6)
        val drawableResource = when(randomNumber){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        view2.setImageResource(drawableResource)
    }

    private fun diceRoll1() {
        val randomNumber = Random.nextInt(6)
        val drawableResource = when(randomNumber){
            1 -> R.drawable.dice1
            2 -> R.drawable.dice2
            3 -> R.drawable.dice3
            4 -> R.drawable.dice4
            5 -> R.drawable.dice5
            else -> R.drawable.dice6
        }
        view1.setImageResource(drawableResource)
    }
}
