package com.example.designpattern.decorator

class RedShapeDecorator(private var decoratedShape:Shape) : ShapeDecorator(decoratedShape) {
    fun setRedBorder(decoratedShape:Shape) {
        println("Border Color: Red")
    }

    override fun draw() {
        decoratedShape.draw()
        setRedBorder(decoratedShape)
    }
}