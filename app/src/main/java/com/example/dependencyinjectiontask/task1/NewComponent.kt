package com.example.dependencyinjectiontask.task1

import  dagger.Component

@Component(modules = [ComputerModule::class])
interface NewComponent {

    fun inject(activity: Activity)

//    fun getMonitor(): Monitor
//
//    fun getKeyboard(): Keyboard
//
//    fun getMouse(): Mouse
}