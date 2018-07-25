package com.example.designpattern.mediator

fun main(args: Array<String>) {
    var robert = User("Robert")
    var john = User("John")

    robert.sendMessage("Hi, John")
    john.sendMessage("Hi, Robert")
}