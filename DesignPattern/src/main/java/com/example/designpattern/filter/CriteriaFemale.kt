package com.example.designpattern.filter

class CriteriaFemale : Criteria {
    override fun meetCriteria(persons: MutableList<Person>): MutableList<Person> {
        var p = ArrayList<Person>()
        for (person in persons) {
            if (person.gender.equals("Female", true)) {
                p.add(person)
            }
        }
        return p;
    }
}