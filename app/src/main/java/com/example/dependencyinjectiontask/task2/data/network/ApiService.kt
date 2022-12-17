package com.example.dependencyinjectiontask.task2.data.network

import android.util.Log
import javax.inject.Inject

class ApiService @Inject constructor(){

    fun method() {
        Log.d(LOG_TAG, "ApiService")
    }


    companion object {
        const val LOG_TAG = "Test"
    }
}