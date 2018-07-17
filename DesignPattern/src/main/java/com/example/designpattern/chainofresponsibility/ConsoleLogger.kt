package com.example.designpattern.chainofresponsibility

class ConsoleLogger(private var l: Int) : AbstractLogger() {
    init {
        super.level = l
    }

    override fun write(msg: String) {
        println("Standard Console::Logger: $msg")
    }
}