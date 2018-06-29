package com.example.designpattern.abstractfactory.factory

import com.example.designpattern.abstractfactory.color.Color
import com.example.designpattern.abstractfactory.shape.Shape

abstract class AbstractFactory {
    abstract fun getColor(color: String) : Color?
    abstract fun getShape(shape: String) : Shape?
}