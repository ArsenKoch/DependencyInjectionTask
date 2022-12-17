package com.example.dependencyinjectiontask.task2.di

import com.example.dependencyinjectiontask.task2.data.datasource.LocalDataSource
import com.example.dependencyinjectiontask.task2.data.datasource.LocalDataSourceImpl
import com.example.dependencyinjectiontask.task2.data.datasource.RemoteDataSource
import com.example.dependencyinjectiontask.task2.data.datasource.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @Binds
    fun bindLocalDataSourceImpl(impl: LocalDataSourceImpl): LocalDataSource

    @Binds
    fun bindRemoteDataSourceImpl(impl: RemoteDataSourceImpl): RemoteDataSource
}