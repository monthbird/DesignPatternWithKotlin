package com.example.designpattern.observer

abstract class Observer {
    protected var subject: Subject? = null
    abstract fun update()
}