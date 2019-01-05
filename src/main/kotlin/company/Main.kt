package company

typealias StoreEmp = StoreEmployee

fun main(args: Array<String>) {
    // Structural equality can be checked with == in Kotlin
    // === checks if same instance

    val e1 = StoreEmp("Mary", 1)
    val e2 = StoreEmp("John", 2)
    val e3 = StoreEmp("John", 2)

    // Kotlin  '==' checks for structural equality unlike Java
    // defers to .equals()
    println(e1 == e2)
    println(e2 == e3)
    println(e1.equals(e2))
    println(e2.equals(e3))
    println()

    // check for referential equality with  '==='
    println(e1 === e2)
    println(e2 === e3)
    println(e1.equals(e2))
    println(e2.equals(e3))
    println()

    // should be referentially equal
    val e4 = e2
    println(e4 === e2)
    println()

    // not equals
    println(e4 != e2) // should be false because are same reference
    println(e4 !== e2) // should be false because are same instance
    println(e2 != e3) //  should be false because are structurally equal
    println(e2 !== e3) // should be true because referentially different
}