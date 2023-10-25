package com.example.lab1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private lateinit var colorText:
            TextInputLayout
    private lateinit var launchButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        colorText = findViewById(R.id.colorText)
        launchButton = findViewById(R.id.launchButton)

        launchButton.setOnClickListener {
            val color = colorText.editText?.text.toString().trim().lowercase()
            val intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("colorName", color)
            startActivity(intent)
        }
    }
}