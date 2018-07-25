package com.example.designpattern.iterator

fun main(args: Array<String>) {
    var namesRepository = NameRepository()
    val iter = namesRepository.getIterator()
    while (iter.hasNext()) {
        println("Name : " + iter.next())
    }
}