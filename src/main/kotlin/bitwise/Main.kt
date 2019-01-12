package bitwise

import company.StoreEmp
import company.StoreEmployee

fun main(args: Array<String>) {

    val x = 0x00101101
    val y = 0x11011011

    // spell out operator in Kotlin rather than using symbol
    x or y
    x and y

    // use 'is' rather than instanceof
    val something: Any = StoreEmp("jay", 4)
    if (something is StoreEmployee) {
        println("val something is a StoreEmployee")

        // cast with 'as'
        // no cast needed because 'is' has already done a smart cast inside this block after use of 'is'
        // fields become available
        val newEmployee = something as StoreEmployee
        println(something.id)
    }
}



