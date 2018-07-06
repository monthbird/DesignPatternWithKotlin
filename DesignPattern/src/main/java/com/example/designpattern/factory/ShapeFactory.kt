package com.example.designpattern.factory

class ShapeFactory {

    fun getShape(shapeType: String?): Shape? {
        when (shapeType!!.toUpperCase()) {
            "CIRCLE" -> return Circle()
            "RECTANGLE" -> return Rectangle()
            "SQUARE" -> return Square()
        }
        return null;
    }
}