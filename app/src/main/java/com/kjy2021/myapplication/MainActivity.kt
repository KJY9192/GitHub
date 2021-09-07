package com.kjy2021.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title= "GitHub TEST"

        var a:Int=10
        supportActionBar?.subtitle= "sub title : $a"

    }
}