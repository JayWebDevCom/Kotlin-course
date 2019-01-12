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
}