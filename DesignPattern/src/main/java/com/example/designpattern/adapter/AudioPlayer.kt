package com.example.designpattern.adapter

class AudioPlayer : MediaPlayer {
    private lateinit var mediaAdapter: MediaAdapter
    override fun play(audioType: String, filename: String) {
        when {
            audioType.equals("mp3") -> println("Playing mp3 file. Name: ${filename}")
            audioType.equals("vlc") || audioType.equals("mp4") -> {
                mediaAdapter = MediaAdapter(audioType)
                mediaAdapter.play(audioType, filename)
            }
            else -> println("Invalid media. ${audioType} format not supported")
        }
    }
}