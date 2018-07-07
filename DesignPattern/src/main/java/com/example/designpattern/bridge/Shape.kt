package com.example.designpattern.bridge

abstract class Shape(internal var drawAPI: DrawAPI) {
    abstract fun draw()
}