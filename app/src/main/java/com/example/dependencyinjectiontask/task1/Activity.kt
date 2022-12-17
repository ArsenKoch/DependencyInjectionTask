package com.example.dependencyinjectiontask.task1

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var computer: Computer


    init {
        DaggerNewComponent.create().inject(this)
    }
}