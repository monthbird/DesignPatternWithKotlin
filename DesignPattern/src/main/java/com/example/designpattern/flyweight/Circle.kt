package com.example.designpattern.flyweight

class Circle(private var color: String) : Shape {

    var x = 0
    var y = 0

    override fun draw() {
        println("Circle draw name: ${color} x: ${x} y: ${y}")
    }
}