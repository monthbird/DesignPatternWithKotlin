package com.example.designpattern.abstractfactory.factory

import com.example.designpattern.abstractfactory.color.Blue
import com.example.designpattern.abstractfactory.color.Color
import com.example.designpattern.abstractfactory.color.Green
import com.example.designpattern.abstractfactory.shape.Shape

class ColorFactory : AbstractFactory(){
    override fun getColor(color: String): Color? {
        when(color.toUpperCase()) {
            "BLUE" -> return Blue()
            "GREEN" -> return Green()
        }
        return null;
    }

    override fun getShape(shape: String): Shape? {
        return null;
    }

}