package com.example.designpattern.prototype

class ShapeCache {

    companion object {
        private var shapeMap = HashMap<String, Shape>()
        fun getShape(shapeId: String): Shape {
            var cachedShape = shapeMap[shapeId]
            return cachedShape!!.clone() as Shape
        }

        fun loadCache() {
            var rectangle = Rectangle()
            rectangle.setId("1")
            shapeMap[rectangle.getId()!!] = rectangle
            var square = Square()
            square.setId("2")
            shapeMap[square.getId()!!] = square
        }
    }
}