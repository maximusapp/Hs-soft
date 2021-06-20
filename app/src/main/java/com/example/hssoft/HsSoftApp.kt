package com.example.hssoft

import android.app.Application
import android.util.Log
import com.orhanobut.logger.AndroidLogAdapter
import com.orhanobut.logger.LogStrategy
import com.orhanobut.logger.Logger
import com.orhanobut.logger.PrettyFormatStrategy
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class HsSoftApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initLogger()
    }

    private fun initLogger() {
        val prefix = Array(2) { ". " }
        prefix[1] = " ."
        var index = 0
        val logStrategy = LogStrategy { priority, tag, message ->
            index = index xor 1
            Log.println(priority, prefix[index] + tag, message)
        }

        val formatStrategy = PrettyFormatStrategy.newBuilder()
            .showThreadInfo(true)
            .methodCount(6)
            .methodOffset(0)
            .logStrategy(logStrategy)
            .tag(LOGGER)
            .build()

        Logger.addLogAdapter(AndroidLogAdapter(formatStrategy))
    }

    companion object {
        private const val LOGGER = "PrettyLogger"
    }

}