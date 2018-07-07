package com.example.designpattern.bridge

class GreenCircle : DrawAPI {
    override fun drawCircle(radius: Int, x: Int, y: Int) {
        println("Drawing Circle[ color: green, radius: ${radius}, x: ${x}, y: ${y}]")
    }
}