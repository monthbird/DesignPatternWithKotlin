package com.example.designpattern.abstractfactory

import com.example.designpattern.abstractfactory.factory.AbstractFactory
import com.example.designpattern.abstractfactory.factory.ColorFactory
import com.example.designpattern.abstractfactory.factory.ShapeFactory

class FactoryProducer {
    companion object {
        fun getFactory(choice: String): AbstractFactory? {
            when (choice) {
                "SHAPE" -> return ShapeFactory()
                "COLOR" -> return ColorFactory()
            }
            return null
        }
    }
}