package com.example.dependencyinjectiontask

import  dagger.Component

@Component
interface NewComponent {

    fun inject(activity: Activity)

//    fun getKeyboard(): Keyboard
//
//    fun getMouse(): Mouse
}