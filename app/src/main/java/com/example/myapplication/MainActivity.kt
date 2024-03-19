package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var editTextName: EditText
    private lateinit var buttonWelcome: Button
    private lateinit var textViewWelcomeMessage: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextName = findViewById(R.id.editTextName)
        buttonWelcome = findViewById(R.id.buttonWelcome)
        textViewWelcomeMessage = findViewById(R.id.textViewWelcomeMessage)

        buttonWelcome.setOnClickListener {
            val name = editTextName.text.toString()
            val welcomeMessage = "Welcome, $name!"
            textViewWelcomeMessage.text = welcomeMessage
        }
    }
}