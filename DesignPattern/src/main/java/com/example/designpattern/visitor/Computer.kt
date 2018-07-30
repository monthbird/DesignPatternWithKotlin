package com.example.designpattern.visitor


class Computer : ComputerPart {

    private var parts: Array<ComputerPart>

    init {
        parts = arrayOf<ComputerPart>(Mouse(), Keyboard())
    }


    override fun accept(computerPartVisitor: ComputerPartVisitor) {
        for (i in parts.indices) {
            parts[i].accept(computerPartVisitor)
        }
        computerPartVisitor.visit(this)
    }
}