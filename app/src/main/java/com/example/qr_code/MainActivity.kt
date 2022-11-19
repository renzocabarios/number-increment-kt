package com.example.qr_code

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var num: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val incBtn = findViewById<Button>(R.id.incBtn)

        incBtn.setOnClickListener {
            num += 1
            Toast.makeText(this, num.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}