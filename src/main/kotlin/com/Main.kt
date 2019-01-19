package com

import dataclasses.Car


/*
default return type from a member function is always unit
void functions have no return data type
*/

fun main(args: Array<String>) {

    var result = labelMultiply(3, 4)
    println(result)

    result = labelMultiplySimplified(3, 4, "The result is:")
    println(result)

    fun whatever() = 4 * 4

    println(whatever())

    val bob = Employee("Bob")
    println(bob.name)
    println(bob.upperCaseFirstName())

    // using named arguments
    val labelMultiply = labelMultiply(label = "Calculated as", operand2 = 54, operand1 = 43)
    println(labelMultiply)

    println()
    val car = Car("red", "merc", 2018)
    val car1 = Car("yellow", "bmw", 2017)
    val car2 = Car("pink", "tesla", 2016)
    val car3 = Car("blue", "lexus", 2015)
    printColours(car, car1, car2, car3, str = "Colour")

    val many = Array(10) { i ->
        Car("red", "merc", 2010 + i)

    }
    many.forEach {
        print(it.model + it.year + ",")
    }

    // use spread operator to pass array to varargs
    // unpacks the array
    val manyCars = arrayOf(car, car1, car2, car3)
    printColours(*manyCars, str = "Cars")
    arrayOf(car, car1, car2, car3)

    val moreCars = arrayOf(*many, *manyCars, Car("black", "RR", 2020))
    println("Iterating with spread operator")
    moreCars.forEach {
        println(it)
    }



}

fun labelMultiply(operand1: Int, operand2: Int, label: String = "The result is:"): String {
    return ("$label ${operand1 * operand2}")
}

fun labelMultiplySimplified(operand1: Int, operand2: Int, label: String) =
        ("$label ${operand1 * operand2}")

fun printColours(vararg cars: Car, str: String) {
    println(str)
    cars.forEach {
        println(it.colour)
    }
}