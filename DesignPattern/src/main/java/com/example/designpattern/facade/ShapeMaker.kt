package com.example.designpattern.facade

class ShapeMaker {

    private val square = Square()
    private val circle = Circle()

    fun drawCircle() {
        circle.draw()
    }

    fun drawSquare() {
        square.draw()
    }
}