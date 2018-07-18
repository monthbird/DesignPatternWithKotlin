package com.example.designpattern.command

class SellStock(private var abcStock: Stock) : Order {
    override fun execute() {
        abcStock.sell()
    }
}