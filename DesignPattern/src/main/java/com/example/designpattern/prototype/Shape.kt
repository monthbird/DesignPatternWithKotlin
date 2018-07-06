package com.example.designpattern.prototype

abstract class Shape : Cloneable {

    private var id: String? = null

    fun setId(id: String) {
        this.id = id
    }

    fun getId(): String? {
        return this.id
    }

    internal var type: String? = null
        get() = field
        set(value) {
            field = value
        }

    abstract fun draw()

    override public fun clone(): Any {
        var clone: Any? = null
        try {
            clone = super.clone()
        } catch (e: CloneNotSupportedException) {
            e.printStackTrace();
        }
        return clone!!
    }
}