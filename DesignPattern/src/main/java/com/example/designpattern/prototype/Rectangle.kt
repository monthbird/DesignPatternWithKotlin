package com.example.designpattern.prototype

class Rectangle() : Shape() {

    init {
        type = "Rectangle"
    }

    override fun draw() {
        println("Inside Rectangle::draw() method.");
    }
}