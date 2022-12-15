package com.example.dependencyinjectiontask

class Activity {

    val monitor = Monitor()
    val keyboard = Keyboard()
    val mouse = Mouse()
    val computerTower = ComputerTower(
        Storage(),
        Processor(),
        Memory()
    )

    val computer = Computer(
        monitor,
        keyboard,
        mouse,
        computerTower
    )
}