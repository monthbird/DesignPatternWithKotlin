package com.example.designpattern.abstractfactory.factory

import com.example.designpattern.abstractfactory.color.Color
import com.example.designpattern.abstractfactory.shape.Circle
import com.example.designpattern.abstractfactory.shape.Rectangle
import com.example.designpattern.abstractfactory.shape.Shape
import com.example.designpattern.abstractfactory.shape.Square

class ShapeFactory : AbstractFactory() {
    override fun getShape(shape: String): Shape? {
        when (shape.toUpperCase()) {
            "CIRCLE" -> return Circle()
            "SQUARE" -> return Square()
            "RECTANGLE" -> return Rectangle()
        }
        return null;
    }

    override fun getColor(color: String): Color? {
        return null;
    }
}