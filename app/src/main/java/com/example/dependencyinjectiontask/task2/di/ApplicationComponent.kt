package com.example.dependencyinjectiontask.task2.di

import com.example.dependencyinjectiontask.task2.presentation.MainActivity
import dagger.Component


@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {

    fun inject(activity: MainActivity)
}