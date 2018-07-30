package com.example.designpattern.strategy

fun main(args: Array<String>) {
    var context = Context(OperationAdd())
    println("10 + 5 = " + context.executeStrategy(10, 5));
    context = Context(OperationSubstract())
    println("10 - 5 = " + context.executeStrategy(10, 5));

}