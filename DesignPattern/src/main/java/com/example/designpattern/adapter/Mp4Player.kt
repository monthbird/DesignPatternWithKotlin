package com.example.designpattern.adapter

class Mp4Player : AdvancedMediaPlayer {
    override fun playVlc(filename: String) {
        // do nothing
    }

    override fun playMp4(filename: String) {
        println("Playing mp4 file. Name: ${filename}")
    }
}