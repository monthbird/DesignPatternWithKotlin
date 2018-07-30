package com.example.designpattern.observer

class Subject {

    private var observers = ArrayList<Observer>()
    var state = 0
    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun notifyAllObservers() {
        for (observer in observers) {
            observer.update()
        }
    }
}