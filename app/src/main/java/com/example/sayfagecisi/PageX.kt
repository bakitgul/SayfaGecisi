package com.example.sayfagecisi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_page_x.*

class PageX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_page_x)

        button2.setOnClickListener {
            val intent = Intent(this@PageX,PageY::class.java)
            startActivity(intent)
        }
    }
}