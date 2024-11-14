package com.rut.promptapp

import android.app.Application
import com.rut.promptapp.utilities.FileLoggingTree
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {

    override fun onCreate() {
        super.onCreate()

        setupLogging()
    }

    private fun setupLogging() {
        Timber.d("setupLogging called")

        Timber.plant(tree = FileLoggingTree())
    }
}
