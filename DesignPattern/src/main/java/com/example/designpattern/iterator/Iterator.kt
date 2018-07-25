package com.example.designpattern.iterator

interface Iterator {
    fun hasNext(): Boolean
    fun next(): Any?
}