package com.rut.promptapp.utilities

import android.util.Log
import org.slf4j.LoggerFactory
import timber.log.Timber.DebugTree

class FileLoggingTree : DebugTree() {

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        val logger = LoggerFactory.getLogger(tag)

        if (t != null) {
            when (priority) {
                Log.VERBOSE -> logger.trace(message, t)
                Log.DEBUG -> logger.debug(message, t)
                Log.INFO -> logger.info(message, t)
                Log.WARN -> logger.warn(message, t)
                Log.ERROR -> logger.error(message, t)
                Log.ASSERT -> logger.error("[Assert] $message", t)
            }
        } else {
            when (priority) {
                Log.VERBOSE -> logger.trace(message)
                Log.DEBUG -> logger.debug(message)
                Log.INFO -> logger.info(message)
                Log.WARN -> logger.warn(message)
                Log.ERROR -> logger.error(message)
                Log.ASSERT -> logger.error("[Assert] $message")
            }
        }
    }
}
