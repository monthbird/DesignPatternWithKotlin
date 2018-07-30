package com.example.designpattern.observer

class HexaObserver(subject: Subject) : Observer() {
    init {
        this.subject = subject
        this.subject!!.attach(this)
    }

    override fun update() {
        println("Hex String: ${Integer.toHexString(this.subject!!.state)}");
    }
}