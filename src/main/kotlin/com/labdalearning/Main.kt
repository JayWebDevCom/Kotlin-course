package com.labdalearning

fun main() {
    run {
        println("This is in a lambda")
    }


    val js = Employee("J", "S", 2015)
    val mj = Employee("M", "J", 2010)
    val pg = Employee("P", "G", 2008)

    val employees = listOf(js, mj, pg)

    val minBy = employees.minBy { it.startYear }
    val minBy2 = employees.minBy(Employee::startYear)
    val minBy3 = employees.minBy { e -> e.startYear }

    println(minBy?.firstName)
    println(minBy2?.firstName)
    println(minBy3?.firstName)

    // scope of variables
    var num = 0
    run {
        num += 1
    }
    println(num)




}

data class Employee(val firstName: String, val lastName: String, val startYear: Int)