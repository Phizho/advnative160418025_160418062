package com.ubaya.week1advnatv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(MainActivity(), "This is my Toast message!",
            Toast.LENGTH_LONG).show();
    }
}