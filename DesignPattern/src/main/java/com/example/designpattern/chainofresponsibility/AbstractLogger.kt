package com.example.designpattern.chainofresponsibility

abstract class AbstractLogger {

    companion object {
        val INFO = 1
        val DEBUG = 2
        val ERROR = 3
    }

    protected var level = -1
    protected var next: AbstractLogger? = null

    fun setNextLogger(next: AbstractLogger) {
        this.next = next
    }

    fun logMessage(level: Int, msg: String) {
        if (this.level <= level) {
            write(msg)
        }
        if (this.next != null) {
            this.next!!.logMessage(level, msg)
        }
    }

    abstract fun write(msg: String)
}