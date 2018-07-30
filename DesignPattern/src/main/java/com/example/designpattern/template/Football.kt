package com.example.designpattern.template

class Football : Game() {
    override fun initialize() {
        println("Football Game Finished!");
    }

    override fun startPlay() {
        println("Football Game Initialized! Start playing.");
    }

    override fun endPlay() {
        println("Football Game Started. Enjoy the game!");
    }

}