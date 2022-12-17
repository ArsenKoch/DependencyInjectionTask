package com.example.dependencyinjectiontask.task2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.dependencyinjectiontask.R
import com.example.dependencyinjectiontask.task2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var viewModel: ViewModel

    private val component = DaggerApplicationComponent.create()

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}