package com.example.designpattern.adapter

class VlcPlayer : AdvancedMediaPlayer {
    override fun playVlc(filename: String) {
        println("Playing vlc file. Name: ${filename}")
    }

    override fun playMp4(filename: String) {
        // do nothing
    }
}