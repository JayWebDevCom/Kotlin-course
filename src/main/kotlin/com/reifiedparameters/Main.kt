package com.reifiedparameters

import java.math.BigDecimal

fun main(args: Array<String>) {

    /*
    at runtime jvm does not know the type of T - type erasure

    inline function parameters can me reified - prevents type from being erased at runtime

    reification if need to check a type inside a function
    
    only works with inline functions
     */

    val mixedList = listOf("string", 1, BigDecimal(23), false)

    val bigDecimalsOnly = getElementsOfType<BigDecimal>(mixedList)
    println(bigDecimalsOnly)

    println()
    val booleans = getElementsOfType<Boolean>(mixedList)
    println(booleans)
}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {

    // unchecked class but filter should check that the class matches
    // so should not get class cast exception

    return list
            .filter { it is T } as List<T>
}
