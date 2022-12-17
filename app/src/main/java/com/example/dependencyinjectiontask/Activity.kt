package com.example.dependencyinjectiontask

class Activity {

    val keyboard: Keyboard = DaggerNewComponent.create().getKeyboard()

    val mouse: Mouse = DaggerNewComponent.create().getMouse()

    val monitor: Monitor = DaggerNewComponent.create().getMonitor()


//    init {
//        DaggerNewComponent.create().inject(this)
//    }
}