package com.example.designpattern.observer

class BinaryObserver(subject: Subject) : Observer() {
    init {
        this.subject = subject
        this.subject!!.attach(this);
    }

    override fun update() {
        println("Binary String: ${Integer.toOctalString(this.subject!!.state)}");
    }
}