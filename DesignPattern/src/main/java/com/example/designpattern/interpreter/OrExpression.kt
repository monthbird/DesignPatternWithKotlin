package com.example.designpattern.interpreter

class OrExpression(private var expr1: Expression, private var expr2: Expression) : Expression {

    override fun interpret(context: String): Boolean {
        return expr1.interpret(context) || expr2.interpret(context);
    }

}