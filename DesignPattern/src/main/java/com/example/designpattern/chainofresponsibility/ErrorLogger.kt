package com.example.designpattern.chainofresponsibility

class ErrorLogger(private var l: Int) : AbstractLogger() {
    init {
        super.level = l
    }

    override fun write(msg: String) {
        println("Error  Console::Logger: $msg")
    }
}