package com.example.designpattern.filter


fun printPersons(persons: MutableList<Person>) {
    for (person in persons) {
        println("Person : [ Name : ${person.name}, " +
                "Gender : ${person.gender}, " +
                "Marital Status : ${person.maritalStatus} ]");
    }
}

fun main(args: Array<String>) {
    var persons = ArrayList<Person>()
    persons.add(Person("Robert", "Male", "Single"))
    persons.add(Person("John", "Male", "Married"))
    persons.add(Person("Laura", "Female", "Married"))
    persons.add(Person("Diana", "Female", "Single"))
    persons.add(Person("Mike", "Male", "Single"))
    persons.add(Person("Bobby", "Male", "Single"))


    var male = CriteriaMale();
    var female = CriteriaFemale();
    var none = AndCriteria(male, female);
    var all = OrCriteria(male, female);

    println("Males: ");
    printPersons(male.meetCriteria(persons));

    println("\nFemales: ");
    printPersons(female.meetCriteria(persons));

    println("\nAll: ");
    printPersons(all.meetCriteria(persons));

    println("\nNone: ");
    printPersons(none.meetCriteria(persons));

}

