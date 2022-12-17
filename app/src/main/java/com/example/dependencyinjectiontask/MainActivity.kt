package com.example.dependencyinjectiontask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val activity = Activity()
        activity.keyboard.toString()
        activity.monitor.toString()
        activity.mouse.toString()
    }
}