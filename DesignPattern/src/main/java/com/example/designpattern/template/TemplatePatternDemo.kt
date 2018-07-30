package com.example.designpattern.template

fun main(args: Array<String>) {
    var game: Game = Cricket()
    game.play()
    game = Football()
    game.play()
}