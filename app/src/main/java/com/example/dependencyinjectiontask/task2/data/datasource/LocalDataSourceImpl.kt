package com.example.dependencyinjectiontask.task2.data.datasource

import com.example.dependencyinjectiontask.task2.data.database.Database

class LocalDataSourceImpl(
    private val database: Database
): LocalDataSource {

    override fun method() {
        database.method()
    }
}