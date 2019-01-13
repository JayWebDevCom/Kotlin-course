package nullreferences

import javacode.NullReferences

fun main(args: Array<String>) {

    // notion of nullable types
    val strNull: String? = "notNull"
    // safe access expression
    println(strNull?.capitalize())

    val strNull2: String? = null
    // safe access expression - no null
    // no NPE - safe operator expression evaluates to null
    println("is it null? ${strNull2?.toUpperCase()}")

    // elvis operator - assign a default value when an expression evaluates to null
    val name = strNull2 ?: "it was null - this is default value"

    println(name)

    val isItNull = NullReferences().someNull ?: "default to this if it's null"
    println("It is null: $isItNull")

    // safe cast
    val something: Any = arrayOf(1,2,3,4)
    val s = something as? String
    println("s?.toUpperCase(): ${s?.toUpperCase()}")

    // not null assertion
    // tell compiler that variable will not be null
    // might want the NPE if variable is null
    // NPE will be thrown on the assertion line not on the use of the null line
    var cNull: String? = "so is not null"
    val upper = cNull!!.toUpperCase()
    println(upper)

    var bNull: String? = "so bNull is not null"
    // if not null use method and print
    bNull?.let {
        printPlease(it)
    }

    // or use elvis operator
    printPlease(bNull ?: "other value 1")
    printPlease(null ?: "other value 2")

    // array of nulls - all elements initialized to null
    println("\n Array of Int?")
    val nullableInts = arrayOfNulls<Int?>(5)
    nullableInts.forEach {
        println(it)
    }
    nullableInts[3].toString() // returns null
}

fun printPlease(text: String): String {
    val message = "$text using let"
    println(message)
    return message
}