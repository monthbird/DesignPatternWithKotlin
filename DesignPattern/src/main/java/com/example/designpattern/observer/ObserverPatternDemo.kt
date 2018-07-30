package com.example.designpattern.observer

fun main(args: Array<String>) {
    var subject = Subject();
    HexaObserver(subject);
    BinaryObserver(subject)
    println("First state change: 15");
    subject.state = 15
    subject.notifyAllObservers()
    println("Second state change: 10");
    subject.state = 10
    subject.notifyAllObservers()
}