package com.example.designpattern.memento

class Originator() {
    var state = ""

    fun saveStateToMemento(): Memento {
        return Memento(state)
    }

    fun getStateFromMemento(memento: Memento) {
        state = memento.getState()
    }
}