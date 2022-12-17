package com.example.dependencyinjectiontask.task2.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dependencyinjectiontask.R
import com.example.dependencyinjectiontask.task1.Activity

class MainActivity : AppCompatActivity() {

    lateinit var viewModel: ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}