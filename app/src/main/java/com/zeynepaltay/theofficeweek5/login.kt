package com.zeynepaltay.theofficeweek5


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class login :AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?)
    {super.onCreate(savedInstanceState)
        setContentView(R.layout.log_in)
        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
    }

}}