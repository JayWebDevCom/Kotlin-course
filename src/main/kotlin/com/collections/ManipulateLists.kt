package com.collections

fun main(args: Array<String>) {

    val immutableStrings = listOf("a", "b", "c", "d") // immutable
    val mutableStrings = arrayListOf("1", "2", "3", "4") // mutable

    println(immutableStrings.first())
    println(mutableStrings.last())

    println(immutableStrings.reversed())

//    val orNull: String? = mutableStrings.getOrNull(7)

    val ints = listOf(1,2,3,4,5)
    println(ints.max())

    println(immutableStrings.zip(mutableStrings)) // makes pairs
    val combined = mutableStrings + immutableStrings
    println(combined)

    val letList = combined.let { it.plus("-added") } // adds at end of list
    println(letList)

    val a = arrayListOf("d", "e", "f")
    val b = arrayListOf("e", "f", "g")
    val noDuplicates = a.union(b) // no duplicates
    println(noDuplicates)

//    val nowMutable = immutableStrings.toMutableList()

}