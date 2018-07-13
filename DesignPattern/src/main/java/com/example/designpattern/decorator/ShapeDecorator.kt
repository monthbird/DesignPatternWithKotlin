package com.example.designpattern.decorator

open class ShapeDecorator(private var decorator: Shape) : Shape {
    override fun draw() {
        decorator.draw()
    }
}