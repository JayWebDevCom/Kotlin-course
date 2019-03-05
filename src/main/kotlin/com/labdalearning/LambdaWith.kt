package com.labdalearning

fun main() {
    // lambdas with receivers
    println(countTo100())
    println(countTo100with())
    println(countTo100with2())
    println(countTo100apply())

    val js = Employee("J", "S", 2015)
    val mj = Employee("M", "J", 2010)
    val pg = Employee("P", "G", 2008)

    val employees = listOf(js, mj, pg)

    val findByLastName = findByLastName(employees, "Q")

    println(findByLastName?.firstName)

}

fun findByLastName(employees: List<Employee>, name: String): Employee? {
    return employees.find { it.lastName == name }
}

fun countTo100(): String {
    val numbers = StringBuilder()
    for (i in 1..99) {
        numbers.append("$i, ")
    }
    numbers.append("100.")
    return numbers.toString()
}


// instance becomes receiver in a with()
fun countTo100with(): String {
    return with(StringBuilder()) {
        for (i in 1..99) {
            append("$i, ")
        }
        append("100.")
        toString()
    }
}

fun countTo100with2() =
        with(StringBuilder()) {
            for (i in 1..99) {
                append("$i, ")
            }
            append("100.")
            toString()
        }

// use an instance and invoke apply on it
fun countTo100apply(): String {
    return StringBuilder().apply {

        for (i in 1..99) {
            append("$i, ")
        }
        append("100.")
    }.toString()
}