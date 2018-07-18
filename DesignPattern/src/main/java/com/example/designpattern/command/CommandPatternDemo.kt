package com.example.designpattern.command

fun main(args: Array<String>) {
    var stock = Stock()

    var buyStock = BuyStock(stock)
    var sellStock = SellStock(stock)

    var broker = Broker()
    broker.takeOrder(buyStock)
    broker.takeOrder(sellStock)
    broker.placeOrders()
}