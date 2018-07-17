package com.example.designpattern.chainofresponsibility

class FileLogger(private var l: Int) : AbstractLogger() {
    init {
        super.level = l
    }

    override fun write(msg: String) {
        println("File::Logger: $msg")
    }
}