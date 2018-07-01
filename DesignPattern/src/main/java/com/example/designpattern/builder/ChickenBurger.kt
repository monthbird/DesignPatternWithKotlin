package com.example.designpattern.builder

class ChickenBurger : Burger() {
    override fun price(): Float {
        return 50.0f
    }

    override fun name(): String {
        return "ChickenBurger"
    }
}