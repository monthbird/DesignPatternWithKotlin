package com.example.designpattern.flyweight

class ShapeFactory {

    companion object {
        private var circleMap = HashMap<String, Shape>()
        fun getCircle(name: String): Shape {
            var circle = circleMap.get(name)
            if (circle == null) {
                circle = Circle(name)
                circleMap.put(name, circle)
                println("Creating circle of color : ${name}")
            }
            return circle
        }
    }
}