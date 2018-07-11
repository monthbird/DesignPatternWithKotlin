package com.example.designpattern.composite

class Employee(private var name:String, private var dept:String, private var sal:Int) {

    private var employees =  ArrayList<Employee>()
    fun add( employee: Employee) {
        employees.add(employee)
    }
    fun remove(employee: Employee) {
        employee.remove(employee)
    }
    fun getSubordinates() : MutableList<Employee> {
        return employees
    }
    override fun toString() :String {
        return "Employee:[name:${name} dept:${dept} sal:${sal}]"
    }
}