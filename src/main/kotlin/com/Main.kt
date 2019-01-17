package com

fun main(args: Array<String>) {

    val emp = Employee("John")
    println(emp.name)
    println(emp.fullTime) // intellij predicted

    val emp2 = Employee("Jane", false)
    println(emp2.name)
    println(emp2.fullTime)

    val demo = Demo()
    println(demo.name)

    emp.fullTime = false
    println(emp.fullTime)

    emp.setLocationAsSite()

    var p = emp.getDes()
    println(p)

    emp.designation = "quarry"
    println(emp.designation)

    println()
    println(MY_CONSTANT)
    println(demo.MY_CONSTANT)
}