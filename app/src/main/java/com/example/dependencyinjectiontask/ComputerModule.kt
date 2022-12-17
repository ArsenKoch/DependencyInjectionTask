package com.example.dependencyinjectiontask

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor {
        return Monitor()
    }

    @Provides
    fun provideMouse(): Mouse {
        return Mouse()
    }

    @Provides
    fun provideKeyboard(): Keyboard {
        return Keyboard()
    }

    @Provides
    fun provideStorage(): Storage {
        return Storage()
    }

    @Provides
    fun provideProcessor(): Processor {
        return Processor()
    }

    @Provides
    fun provideMemory(): Memory {
        return Memory()
    }

    @Provides
    fun provideComputerTower(
        storage: Storage,
        processor: Processor,
        memory: Memory
    ): ComputerTower {
        return ComputerTower(storage, processor, memory)

    }

    @Provides
    fun provideComputer(
        monitor: Monitor,
        keyboard: Keyboard,
        mouse: Mouse,
        computerTower: ComputerTower
    ): Computer {
        return Computer(monitor, keyboard, mouse, computerTower)
    }
}