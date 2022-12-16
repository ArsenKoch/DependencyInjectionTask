package com.example.dependencyinjectiontask

import javax.inject.Inject

class Activity {

    @Inject
    lateinit var keyboard: Keyboard

    init {
        Component().inject(this)
    }
}