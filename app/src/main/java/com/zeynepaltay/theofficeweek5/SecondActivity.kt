package com.zeynepaltay.theofficeweek5

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            val button5 = findViewById<Button>(R.id.button5)
            button5.setOnClickListener {
                val intent = Intent(this, login::class.java)
                startActivity(intent)

            }
        }

        /*override fun onCreateOptionsMenu(menu: Menu?): Boolean {
            val inflator = MenuInflater(this)
            inflator.inflate(R.menu.menu, menu)
            return super.onCreateOptionsMenu(menu)
        }*/
    }
}