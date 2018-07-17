package com.example.designpattern.proxy

class ProxyImage(private var filename: String) : Image {

    private var image = RealImage(filename);

    override fun draw() {
        image.draw()
    }


}