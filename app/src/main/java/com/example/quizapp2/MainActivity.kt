package com.example.quizapp2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.quizapp2.QuestionsActivity
import com.example.quizapp2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.name)
        val startButton = findViewById<Button>(R.id.button_start)

        startButton.setOnClickListener {
            val userName = editTextName.text.toString().trim()

            if (userName.isEmpty()) {
                Toast.makeText(
                    this@MainActivity,
                    "Veuillez saisir votre nom pour commencer le quiz",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                val intent = Intent(this, QuestionsActivity::class.java)
                intent.putExtra("user_name", userName)
                startActivity(intent)

            }
        }
    }
}
