package com.example.designpattern.builder

class MealBuilder {

    fun prepareVegMeal(): Meal {
        var meal = Meal()
        meal.addItem(VegBurger())
        meal.addItem(Coke())
        return meal
    }

    fun prepareNonVegMeal(): Meal {
        var meal = Meal()
        meal.addItem(ChickenBurger())
        meal.addItem(Pepsi())
        return meal
    }
}