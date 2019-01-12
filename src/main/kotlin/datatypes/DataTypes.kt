package datatypes

import javacode.DummyClass

fun main(args: Array<String>) {

    // long
    var myLong = 21L
    var myInt = 65
    var myByte: Byte = 111
    var myShort: Short

    // kotlin does not automatically widen numbers
    // i.e. an int cannot be assigned to a long typed variable
    // need to use conversion helper methods
    myLong = myInt.toLong()
    myShort = myByte.toShort()

    var myFloat = 65.34
    // actually a double
    println("DataType of myFloat is actually a ${myFloat.javaClass}")
    var myFloat2 = myFloat.toFloat()

    // character at 65 is 'A'
    val myCharInt = myInt.toChar()
    println("myCharInt corresponds to $myCharInt")
    val myBoolean = true

    val vacation = false
    val vacationTime = DummyClass().isVacationTime(vacation)
    println(vacationTime)

    /*
    Array
     */
    val names = arrayOf("John", "Joe", "James", "Jessica")
    val ints = arrayOf(123, 234, 345, 456)
    println("ints is array of long ${ints is Array<Int>}")

    val longs = arrayOf<Long>(123, 234, 345, 456)
    println("ints is array of long ${longs is Array<Long>}")

    val longs2 = arrayOf(123L, 234L, 345L, 456L)
    println("ints is array of long ${longs is Array<Long>}")

    // Array indexing
    println(longs[2])

    // initialize an array of even numbers of size 16
    val evenNumbers = Array(16) { i -> i * 2 }
    evenNumbers.forEach { print("$it,") }

    val allZeros = Array(100) { 0 }

    var someArray: Array<Int>
    someArray = arrayOf(1, 3, 5, 7)
    someArray.forEachIndexed { i, v ->
        print("${i + v},")
    }

    // init an array with incrementing 10s
    val tens = Array(10) { i ->
        (i + 1) * 10
    }

    println()
    tens.forEach {
        print("$it,")
    }

    println()
    val mixedArray = arrayOf("string", 10.5, 'c')
    mixedArray.forEach { print("$it,") }

    val intArray = arrayOf(1, 2, 3, 4, 5, 6)
    // need to use intArray or intArrayOf()
    DummyClass().printsAnArray(intArray.toIntArray())

    // at declaration time cant say size
    // var anotherArray = Array<Int>(5);

    var someOtherArray = intArrayOf(5)

    intArray.toIntArray().toTypedArray()
}