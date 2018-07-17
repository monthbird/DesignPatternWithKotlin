package com.example.designpattern.proxy

class RealImage(private var filename: String) : Image {

    init {
        loadFromDisk(filename)
    }

    override fun draw() {
        println("draw ${filename}")
    }

    fun loadFromDisk(filename: String) {
        println("loading ${filename}")
    }
}