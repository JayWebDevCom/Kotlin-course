package com

import java.math.BigDecimal

fun main() {
    // expressions can be assigned to a variable

    val num = 9

    when (num) {
        100 -> println("100")
        101 -> println("101")
        102, 103 -> println("102-3")
        in 123..456 -> println("in range")
        else -> println("none")
    }


    val obj: Any = "I'm a string"
    val obj2: Any = BigDecimal(34.56)
    val obj3: Any = 5
    val something = obj2

    // smart casting
    if (something is Int)
        println("It's an int")

    myMethod(obj)
    myMethod(obj2)
    myMethod(obj3)

    val season = Season.SUMMER

    val x = when (season) {
        Season.SUMMER -> season.str
        Season.SPRING -> println("no")
        Season.WINTER -> println("no")
        Season.AUTUMN -> println("no")
        // no need for else with ell possibilities of an enum used
    }

    println(x)

    when {
        1 > 2 -> println("1")
        1 < 2 -> println("2")
        else -> println(3)
    }
}

enum class Season(val str: String) {
    SPRING("it is spring"), SUMMER("it is summer"), AUTUMN("it is autumn"), WINTER("it is winter");
}

fun myMethod(x: Any) {
    when (x) {
        is String -> println("is String")
        is Int -> println("is Int")
        is BigDecimal -> println("is BigDecimal")
        else -> println("none")
    }
}