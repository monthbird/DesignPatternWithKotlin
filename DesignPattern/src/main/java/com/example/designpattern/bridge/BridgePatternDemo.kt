package com.example.designpattern.bridge

fun main(args: Array<String>) {
    var redCircle = Circle(100, 100, 10, RedCircle())
    var greenCircle = Circle(100, 100, 10, GreenCircle())

    redCircle.draw();
    greenCircle.draw();
}