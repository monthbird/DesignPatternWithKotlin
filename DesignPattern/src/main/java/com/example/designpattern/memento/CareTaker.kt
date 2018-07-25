package com.example.designpattern.memento

class CareTaker {
    var mementoList = ArrayList<Memento>()
    fun add(state: Memento) {
        mementoList.add(state)
    }

    fun get(index: Int): Memento {
        return mementoList[index]
    }
}