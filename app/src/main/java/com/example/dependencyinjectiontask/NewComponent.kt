package com.example.dependencyinjectiontask

@dagger.Component
interface NewComponent {

    fun inject(activity: Activity)
}