package com.example.designpattern.filter

interface Criteria {
    fun meetCriteria(persons: MutableList<Person>): MutableList<Person>
}