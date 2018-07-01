package com.example.designpattern.builder

interface Item {
    fun name(): String
    fun packing(): Packing
    fun price(): Float
}