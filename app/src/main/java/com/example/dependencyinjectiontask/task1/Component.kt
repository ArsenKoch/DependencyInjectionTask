package com.example.dependencyinjectiontask.task1

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
        activity.computer = getComputerValues()
    }
}