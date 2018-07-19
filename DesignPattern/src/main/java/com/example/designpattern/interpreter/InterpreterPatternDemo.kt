package com.example.designpattern.interpreter

object InterpreterPatternDemo {
    @JvmStatic
    fun main(args: Array<String>) {
        var isMale = getMaleExpression()
        var isMarriedWoman = getMarriedWomanExpression()
        println("John is male?  ${isMale.interpret("John")}");
        println("Julie is a married women?  ${isMarriedWoman.interpret("Married Julie")}")
    }

    @JvmStatic
    fun getMaleExpression(): Expression {
        var robert = TerminalExpression("Robert")
        var john = TerminalExpression("John")
        return OrExpression(robert, john)
    }

    @JvmStatic
    fun getMarriedWomanExpression(): Expression {
        var julie = TerminalExpression("Julie")
        var married = TerminalExpression("Married")
        return AndExpression(julie, married)
    }
}