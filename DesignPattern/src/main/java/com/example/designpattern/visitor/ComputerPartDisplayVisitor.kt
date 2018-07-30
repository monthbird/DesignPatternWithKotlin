package com.example.designpattern.visitor

class ComputerPartDisplayVisitor : ComputerPartVisitor {
    override fun visit(keyboard: Keyboard) {
        println("Displaying Keyboard.");
    }

    override fun visit(mouse: Mouse) {
        println("Displaying Mouse.");
    }

    override fun visit(computer: Computer) {
        println("Displaying Computer.");
    }

}