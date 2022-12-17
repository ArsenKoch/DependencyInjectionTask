package com.example.dependencyinjectiontask.task2.data.database

import android.util.Log

class Database {

    fun method() {
        Log.d(LOG_TAG, "Database")
    }

    companion object {
        const val LOG_TAG = "Test"
    }
}