package com.example.designpattern.mediator

class User(private var name: String) {
    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name;
    }

    fun sendMessage(msg: String) {
        ChatRoom.showMessage(this, msg)
    }
}