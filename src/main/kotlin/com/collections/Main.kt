package com.collections

fun main(args: Array<String>) {

    val immutableStrings = listOf("a", "b", "c") // immutable
    val mutableStrings = arrayListOf("a", "b", "c") // mutable

    println(immutableStrings.javaClass) // class java.util.Arrays$ArrayList
    println(mutableStrings.javaClass) // class java.util.ArrayList

    val emptyList: List<String> = emptyList()
    println(emptyList.javaClass) // class kotlin.collections.EmptyList

    val emptyList2 = emptyList<String>() // immutable
    println(emptyList2.javaClass) // class kotlin.collections.EmptyList

    val listOfNotNull = listOfNotNull("A", null, "B")
    println(listOfNotNull) // discards nulls

    val mutableList = mutableListOf(1, 2, 3)
    println(mutableList)
    println(mutableList.javaClass) // class java.util.ArrayList

    val array = arrayOf("black", "white", "green")
    val colourList = listOf(array)
    println(colourList) // list or Array<String> with 1 element

    val colourListSpread = listOf(*array) // or array.toList()
    println(colourListSpread) // immutable list of String
    println(colourListSpread.javaClass) // class java.util.Arrays$ArrayList

}