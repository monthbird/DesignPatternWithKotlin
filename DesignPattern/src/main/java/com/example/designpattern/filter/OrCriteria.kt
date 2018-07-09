package com.example.designpattern.filter

class OrCriteria(var criteria: Criteria, var otherCriteria: Criteria) : Criteria {
    override fun meetCriteria(persons: MutableList<Person>): MutableList<Person> {
        var firstCriteriaPersons = criteria.meetCriteria(persons)
        var otherCriteriaPersons = otherCriteria.meetCriteria(persons)
        for (person in persons) {
            if (!firstCriteriaPersons.contains(person)) {
                firstCriteriaPersons.add(person)
            }
        }
        return firstCriteriaPersons
    }
}