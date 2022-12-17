package com.example.dependencyinjectiontask.task2.presentation

import com.example.dependencyinjectiontask.task2.domain.UseCase

class ViewModel(
    private val useCase: UseCase
) {

    fun method() {
        useCase()
    }

}