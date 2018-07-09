package com.example.designpattern.filter

class AndCriteria(var criteria: Criteria, var otherCriteria: Criteria) : Criteria {
    override fun meetCriteria(persons: MutableList<Person>): MutableList<Person> {
        var firstCriteriaPersons = criteria.meetCriteria(persons)
        return otherCriteria.meetCriteria(firstCriteriaPersons)
    }
}