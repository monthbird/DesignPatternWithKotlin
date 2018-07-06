package com.example.designpattern.prototype

fun main(args: Array<String>) {
    ShapeCache.loadCache()
    var clonedShape1 = ShapeCache.getShape("1")
    println("Shape: " + clonedShape1.type)
    var clonedShape2 = ShapeCache.getShape("2")
    println("Shape: " + clonedShape2.type)
}