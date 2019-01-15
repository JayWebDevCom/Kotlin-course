package nullreferences

import javacode.DummyClass

fun main(args: Array<String>) {
    // declare non-nullable Float - use f even if the type name is provided
    val myFloat1 = -3847.384
    val myFloat2: Float = -3847.384f

    // declare nullable Float
    val myFloat3: Float? = -3847.384f

    // short array
    val shortArray1 = shortArrayOf(1, 2, 3, 4, 5)
    val shortArray2: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    // nullable ints initialized with...
    val intArray: Array<Int?> = Array(40) { i ->
        (i + 1) * 5
    }
    println(intArray[intArray.size -1])

    val charArray1: CharArray = arrayOf('a', 's', 'd').toCharArray()
    val charArray2: CharArray = charArrayOf('f', 'g', 'h')
    DummyClass().printsCharArray(charArray1)
    DummyClass().printsCharArray(charArray2)

    val x: String? = null
    val myString = x?.toLowerCase() ?: "I give up if it is null"
    println(myString)

    val y: String?  = "NOT NULL"
    val myString2 = x?.toLowerCase() ?: "I give up if it is null"
    println(myString2)

    y?.let {
        println(it.toLowerCase().replace("null", "nulllll"))
    }

    // deliberate null
    val myNunNullVariable: Int? = null
    println(myNunNullVariable!! * 2)
}