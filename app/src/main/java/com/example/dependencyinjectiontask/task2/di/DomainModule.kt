package com.example.dependencyinjectiontask.task2.di

import com.example.dependencyinjectiontask.task2.data.repository.RepositoryImpl
import com.example.dependencyinjectiontask.task2.domain.Repository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(repositoryImpl: RepositoryImpl): Repository
}