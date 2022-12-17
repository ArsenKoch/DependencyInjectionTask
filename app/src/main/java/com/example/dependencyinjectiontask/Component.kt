package com.example.dependencyinjectiontask

class Component {

    private fun getComputerValues(): Computer {
        val monitor = Monitor()
        val keyboard = Keyboard()
        val mouse = Mouse()
        val computerTower = ComputerTower(
            Storage(),
            Processor(),
            Memory()
        )
        return Computer(
            monitor,
            keyboard,
            mouse,
            computerTower
        )
    }

    fun inject(activity: Activity) {
//        activity.keyboard = Keyboard()
//        activity.mouse = Mouse()
//        activity.monitor = Monitor()
    }
}