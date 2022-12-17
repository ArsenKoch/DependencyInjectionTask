package com.example.dependencyinjectiontask.task2.data.datasource

import com.example.dependencyinjectiontask.task2.data.network.ApiService

class RemoteDataSourceImpl(
    private val apiService: ApiService
): RemoteDataSource {

    override fun method() {
        apiService.method()
    }
}