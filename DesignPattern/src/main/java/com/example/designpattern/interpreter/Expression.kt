package com.example.designpattern.interpreter

interface Expression {
    fun interpret(context: String): Boolean
}