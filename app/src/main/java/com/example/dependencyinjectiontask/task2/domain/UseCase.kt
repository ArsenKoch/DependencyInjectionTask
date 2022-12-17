package com.example.dependencyinjectiontask.task2.domain

class UseCase(
    private val repository: Repository
) {

    operator fun invoke() {
        repository.method()
    }
}