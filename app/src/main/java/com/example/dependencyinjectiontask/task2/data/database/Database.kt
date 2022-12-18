package com.example.dependencyinjectiontask.task2.data.database

import android.content.Context
import android.util.Log
import com.example.dependencyinjectiontask.R
import javax.inject.Inject

class Database @Inject constructor(
    private val context: Context
) {

    fun method() {
        Log.d(LOG_TAG, "Database ${context.getString(R.string.app_name)}")
    }

    companion object {
        const val LOG_TAG = "Test"
    }
}