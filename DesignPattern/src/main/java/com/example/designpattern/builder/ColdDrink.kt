package com.example.designpattern.builder

abstract class ColdDrink : Item {
    override fun packing(): Packing {
        return Bottle()
    }
}