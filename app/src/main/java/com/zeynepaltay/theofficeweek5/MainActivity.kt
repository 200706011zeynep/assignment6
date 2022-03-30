package com.zeynepaltay.theofficeweek5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ImageView
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val setImageButton = findViewById<Button>(R.id.button)
        val image = findViewById<ImageView>(R.id.imageView2)

        val button: Button = findViewById(R.id.button2)
        setImageButton.setOnClickListener {
            image.setImageResource(R.drawable.pic)
        }
        button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)


        }
        val users = arrayOf(
            "Meetings", "To-do Lists", "Notes",
            "Reminders", "Calendar"
        )

        var mListView = findViewById<ListView>(R.id.userlist)
        val arrayAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1, users
        )
        mListView.adapter = arrayAdapter


    }
}


