package com.example.designpattern.flyweight

object FlyweightPatternDemo {
    private val colors = arrayOf("Red", "Green", "Blue", "White", "Black")
    fun getRandomColor(): String {
        return colors[(Math.random() * colors.size).toInt()]
    }

    @JvmStatic
    fun main(args: Array<String>) {

        for (i in 0..19) {
            var circle = ShapeFactory.getCircle(getRandomColor()) as Circle
            circle.x = (Math.random() * 100).toInt()
            circle.y = (Math.random() * 100).toInt()
            circle.draw()
        }
    }

}