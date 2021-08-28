package com.example.jainterview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var nameInput : EditText
    lateinit var startButton : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nameInput = findViewById(R.id.textInputEditText)
        startButton = findViewById(R.id.main_activity_start)

        startButton.setOnClickListener {
            var inputName = nameInput.text.toString()
            var intent = Intent(this,SecondView::class.java).apply {
                putExtra("name", inputName)
            }

            startActivity(intent)
        }
    }
}