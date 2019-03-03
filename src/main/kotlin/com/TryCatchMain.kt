package com

fun main() {
    // checked and unchecked exceptions are not differentiated in kotlin

    val myInt = getNumber("22.5")

    println("result: $myInt")
    println()

    val myNullableInt = getNumberWithNull("22.5")



    // this will throw
    println("result with null: ${myNullableInt ?: throw IllegalArgumentException("Number was not an int")}")
}

fun getNumber(str: String): Int {

    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    } finally {
        println("In finally block")
    }
}

fun getNumberWithNull(str: String): Int? {

    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        null
    } finally {
        println("In finally block")
    }
}