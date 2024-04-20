package git.overlord.core.controllers

import org.slf4j.Logger
import org.slf4j.LoggerFactory

object Logger {
    private val logger = LoggerFactory.getLogger(Logger::class.java)

    fun info(msg: String) {
        logger.info(msg)
    }

    fun warn(msg: String) {
        logger.warn(msg)
    }

    fun error(msg: String) {
        logger.error(msg)
    }

    fun error(msg: String, throwable: Throwable) {
        logger.error(msg, throwable)
    }
}