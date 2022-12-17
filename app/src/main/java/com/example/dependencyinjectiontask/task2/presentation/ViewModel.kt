package com.example.dependencyinjectiontask.task2.presentation

import com.example.dependencyinjectiontask.task2.domain.UseCase
import javax.inject.Inject

class ViewModel @Inject constructor(
    private val useCase: UseCase
) {

    fun method() {
        useCase()
    }

}