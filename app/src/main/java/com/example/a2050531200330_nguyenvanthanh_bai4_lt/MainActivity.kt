package com.example.a2050531200330_nguyenvanthanh_bai4_lt


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnOpen = findViewById<View>(R.id.btnOpenChildActivity) as Button
        btnOpen.setOnClickListener { doOpenChildActivity() }
    }

    fun doOpenChildActivity() {
        val myIntent = Intent(this@MainActivity, ChildActivity::class.java)
        startActivity(myIntent)
    }
}