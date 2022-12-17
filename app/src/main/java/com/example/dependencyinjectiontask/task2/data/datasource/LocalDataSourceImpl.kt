package com.example.dependencyinjectiontask.task2.data.datasource

import com.example.dependencyinjectiontask.task2.data.database.Database
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private val database: Database
): LocalDataSource {

    override fun method() {
        database.method()
    }
}