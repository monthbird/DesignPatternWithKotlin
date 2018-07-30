package com.example.designpattern.visitor

fun main(args: Array<String>) {
    var computer = Computer()
    computer.accept(ComputerPartDisplayVisitor())
}