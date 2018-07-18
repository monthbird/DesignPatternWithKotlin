package com.example.designpattern.command

class Broker {

    private var orderList = ArrayList<Order>()

    fun takeOrder(order: Order) {
        orderList.add(order)
    }

    fun placeOrders() {
        for (order in orderList) {
            order.execute()
        }
        orderList.clear()
    }
}