package com.example.designpattern.adapter

class MediaAdapter(audioType: String) : MediaPlayer {

    private lateinit var advancedMusicPlayer: AdvancedMediaPlayer

    init {
        when (audioType) {
            "vlc" -> advancedMusicPlayer = VlcPlayer()
            "mp4" -> advancedMusicPlayer = Mp4Player()
        }
    }

    override fun play(audioType: String, filename: String) {
        when (audioType) {
            "vlc" -> advancedMusicPlayer.playVlc(filename)
            "mp4" -> advancedMusicPlayer.playMp4(filename)
        }
    }
}