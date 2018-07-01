package com.example.designpattern.builder

fun main(vars:Array<String>) {
    var builder = MealBuilder()
    var vegMeal = builder.prepareVegMeal()
    println("Veg Meal: ")
    vegMeal.showItems()
    println("Total Cost: " + vegMeal.getPrice())
    var nonVegMeal = builder.prepareNonVegMeal()
    println("Non Veg Meal: ")
    nonVegMeal.showItems()
    println("Total Coast: " + nonVegMeal.getPrice())
}