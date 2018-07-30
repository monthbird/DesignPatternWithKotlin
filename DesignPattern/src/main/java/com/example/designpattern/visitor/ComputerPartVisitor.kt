package com.example.designpattern.visitor

interface ComputerPartVisitor {
    fun visit(keyboard: Keyboard)
    fun visit(mouse: Mouse)
    fun visit(computer: Computer)
}