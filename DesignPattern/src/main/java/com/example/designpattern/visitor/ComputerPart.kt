package com.example.designpattern.visitor

interface ComputerPart {
    fun accept(computerPartVisitor: ComputerPartVisitor)
}