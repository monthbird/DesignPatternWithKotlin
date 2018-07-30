package com.example.designpattern.template

abstract class Game {
    abstract fun initialize()
    abstract fun startPlay()
    abstract fun endPlay()

    fun play() {
        initialize();
        startPlay()
        endPlay()
    }
}