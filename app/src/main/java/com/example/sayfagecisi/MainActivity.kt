package com.example.sayfagecisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPageA.setOnClickListener {
            val intent =Intent(this@MainActivity,PageA::class.java)
            startActivity(intent)
        }

        buttonPageX.setOnClickListener {
            val intent =Intent(this@MainActivity,PageX::class.java)
            startActivity(intent)

        }
    }
}