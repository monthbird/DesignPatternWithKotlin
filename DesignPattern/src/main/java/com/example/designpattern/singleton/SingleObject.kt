package com.example.designpattern.singleton

class SingleObject private constructor(){

    companion object {

        var mInstance : SingleObject? = null;

        @Synchronized fun getInstance(args: Int) : SingleObject {
            if (mInstance == null) {
                mInstance = SingleObject()
            }
            return mInstance!!;
        }
    }

    fun showMessage() {
        if (mInstance == null) {
            throw IllegalStateException()
        }
        println("Hello World! $mInstance")
    }
}