package com.example.dependencyinjectiontask.task2.data.repository

import com.example.dependencyinjectiontask.task2.data.mapper.Mapper
import com.example.dependencyinjectiontask.task2.data.datasource.LocalDataSource
import com.example.dependencyinjectiontask.task2.data.datasource.RemoteDataSource
import com.example.dependencyinjectiontask.task2.domain.Repository

class RepositoryImpl(
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource,
    private val mapper: Mapper
) : Repository {

    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}