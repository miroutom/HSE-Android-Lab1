package com.example.lab1

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)

        val secondActivityLayout = findViewById<ConstraintLayout>(R
            .id
            .secondActivityLayout)
        val colorTextView = findViewById<TextView>(R.id.colorTextView)

        when (intent.getStringExtra("colorName")){
            "red" -> {
                colorTextView.text = "Red"
                secondActivityLayout.setBackgroundColor(Color.RED)
            }
            "green" -> {
                colorTextView.text = "Green"
                secondActivityLayout.setBackgroundColor(Color.GREEN)
            }
            "blue" -> {
                colorTextView.text = "Blue"
                secondActivityLayout.setBackgroundColor(Color.BLUE)
            }
            else -> {
                colorTextView.text = "Invalid color"
                secondActivityLayout.setBackgroundColor(Color.WHITE)
            }
        }

        val returnButton = findViewById<Button>(R.id.return_button)
        returnButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}