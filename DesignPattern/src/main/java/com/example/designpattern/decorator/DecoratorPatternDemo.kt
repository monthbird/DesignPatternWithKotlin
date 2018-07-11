package com.example.designpattern.decorator

fun main(args: Array<String>) {
    var circle = Circle()
    var redCircle = RedShapeDecorator(Circle())
    var redRectangle = RedShapeDecorator(Rectangle())
    println("Circle with normal border")
    circle.draw()
    println("\nCircle of red border")
    redCircle.draw()
    println("\nRectangle of red border")
    redRectangle.draw()
}