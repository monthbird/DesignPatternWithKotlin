package com.example.designpattern.builder

abstract class Burger : Item {
    override fun packing(): Packing {
        return Wrapper()
    }
}