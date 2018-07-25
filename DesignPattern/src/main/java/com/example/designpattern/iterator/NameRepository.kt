package com.example.designpattern.iterator

class NameRepository : Container {

    private val names = arrayOf("Robert", "John", "Julie", "Lora")

    override fun getIterator(): Iterator {
        return NameIterator()
    }

    private inner class NameIterator : Iterator {
        private var index = 0
        override fun hasNext(): Boolean {
            if (index < names.size) {
                return true
            }
            return false;
        }

        override fun next(): Any? {
            if (hasNext()) {
                return names[index++]
            }
            return null
        }
    }
}