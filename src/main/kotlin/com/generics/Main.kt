package com.generics

import java.math.BigDecimal

fun main(args: Array<String>) {

    // have to use a generic type with collections in kotlin
    val mutableList = mutableListOf("Some string")
    mutableList[0].toUpperCase()
    mutableList.add("Another string")

    printCollection(mutableList)

    val bigDecimalList = mutableListOf(
            BigDecimal(-33.45),
            BigDecimal(3503.99),
            BigDecimal(0.329)
    )

    println()
    printCollection(bigDecimalList)

    println()
    mutableList.myPrintCollection()

    println()
    bigDecimalList.myPrintCollection()

    println()
    val shorts = listOf<Short>(12, 13, 14, 15)
    val floats = listOf<Float>(1.2f, 1.3f, 1.4f, 1.5f)

    convertToInt(shorts)
    convertToInt(floats)

    println()
    append(StringBuilder("first"), StringBuilder("second"))

    println()
    val nullableShorts = listOf<Short?>(12, 13, 14, 15, null)
    printNullableNumbers(nullableShorts)

    println()
    printNonNullableNumbers(shorts)
}

fun <T> printCollection(collection: List<T>) { // type parameter declaration
    for (item in collection) {
        println(item)
    }
}

// extension function for listOfT
fun <T> List<T>.myPrintCollection() {
    for (item in this) {
        println(item)
    }
}

// restrict generic bounds to number class
// must satisfy upper bound
fun <T : Number> convertToInt(list: List<T>) {
    println(list.first().javaClass.simpleName)
    for (i in list) {
        println("${i.toInt()}")
    }
}

// restrict to CharSequence
// 2 upper bounds
fun <T> append(item1: T, item2: T) where T : CharSequence, T : Appendable {
    println("Result is ${item1.append(item2)}")
}

// Number? means nullable type
fun <T : Number?> printNullableNumbers(collection: List<T>) {
    for (i in collection) {
        println(i)
    }
}

// no Type'?' means non nullable type
fun <T : Number> printNonNullableNumbers(collection: List<T>) {
    for (i in collection) {
        println(i)
    }
}