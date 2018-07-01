package com.example.designpattern.builder

class Meal {
    var items = ArrayList<Item>()
    fun addItem(item: Item) {
        items.add(item)
    }
    fun getPrice() : Float {
        var cost = 0f
        for (item in items) {
            cost += item.price()
        }
        return cost
    }
    fun showItems() {
        for(item in items) {
            print("Item: ${item.name()}")
            print(", Packing: ${item.packing().pack()}")
            println(", price: ${item.price()}")
        }
    }
}