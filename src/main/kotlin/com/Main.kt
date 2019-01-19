package com

import dataclasses.Car

fun main(args: Array<String>) {

    val car1 = Car("blue", "volvo asd", 1999)
    val car2 = Car("blue", "volvo asd", 1999)

    println(car1)

    // structural equality out of the box
    println("two cars: ${car1 == car2}")

    // false as expected
    println("with copy: ${car1 == car1.copy(year = 2015)}")

    // false as expected
    println("two employees: ${Employee("J") == Employee("J")}")

    println("referential equality car: ${car1 === car2}")
}