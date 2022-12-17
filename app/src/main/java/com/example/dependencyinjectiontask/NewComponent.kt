package com.example.dependencyinjectiontask

import  dagger.Component

@Component
interface NewComponent {

//    fun inject(activity: Activity)

    fun getMonitor(): Monitor

    fun getKeyboard(): Keyboard

    fun getMouse(): Mouse
}