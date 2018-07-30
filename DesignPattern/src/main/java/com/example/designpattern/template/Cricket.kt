package com.example.designpattern.template

class Cricket : Game() {
    override fun initialize() {
        println("Cricket Game Finished!");
    }

    override fun startPlay() {
        println("Cricket Game Initialized! Start playing.");
    }

    override fun endPlay() {
        println("Cricket Game Started. Enjoy the game!");
    }

}