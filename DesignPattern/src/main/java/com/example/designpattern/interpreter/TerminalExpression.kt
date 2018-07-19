package com.example.designpattern.interpreter

class TerminalExpression(private var data: String) : Expression {

    override fun interpret(context: String): Boolean {
        if (context.contains(data)) {
            return true;
        }
        return false;
    }

}