package com.collections


fun main(args: Array<String>) {
    val immutableSetInts = setOf(1, 2, 3, 4, 5, 6, 7, 8)
    immutableSetInts.plus(9)
    immutableSetInts.minus(8)

    val min = immutableSetInts.min()
    val and = min?.and(5)
    println(and)
    println(immutableSetInts.average())
    println(immutableSetInts.drop(3)) // drop first 3 elements from the set

    val mutableSet = mutableSetOf(1, 2, 3, 4, 5)
    mutableSet.plus(6)
    println(mutableSet) // mutable but plus() returns a new set

    println(mutableSet.filter { it % 2 != 0 })

}

