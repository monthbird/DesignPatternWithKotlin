package com.example.designpattern.state

fun main(args: Array<String>) {
    var context = Context()
    var startState = StartState()
    startState.doAction(context)
    println(context.state.toString());
    var stopState = StopState()
    stopState.doAction(context)
    println(context.state.toString());
}