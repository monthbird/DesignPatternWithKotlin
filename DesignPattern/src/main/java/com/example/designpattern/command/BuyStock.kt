package com.example.designpattern.command

class BuyStock(private var abcStock: Stock) : Order {

    override fun execute() {
        abcStock.buy()
    }
}