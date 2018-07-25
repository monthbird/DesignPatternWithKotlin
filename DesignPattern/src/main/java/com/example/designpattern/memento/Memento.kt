package com.example.designpattern.memento

class Memento(private var state: String) {
    fun getState(): String {
        return state
    }
}