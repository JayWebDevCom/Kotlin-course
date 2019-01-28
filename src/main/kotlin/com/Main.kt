package com

/*
keyword 'object'
Object declarations declares and creates an instance at the same time so no constructors

in kotlin always need an instance of the class to access members of that class or use a companion object

companion objects inside classes can be accessed without an instance of the class
equivalent of static

companion objects can be named - companion object SomeCompanion { // }
can be used to call private constructors
 */
fun main(args: Array<String>) {

    println(CompanyCommunications.getTagLine())
    println(CompanyCommunications.getCopyrightLine())

    // from companion object
    println(SomeClass.accessPrivateVar())

    val upperOrLowerTrue = SomeClass.upperOrLower("this is true", true)
    val upperOrLowerFalse = SomeClass.upperOrLower("this is false", false)
    val justAssign = SomeClass.justAssign("aNyThInG")

    println()
    println(upperOrLowerTrue.someString)
    println(upperOrLowerFalse.someString)
    println(justAssign.someString)

    val multiplier = 20

    // object expression to implement SomeInterface - anonymous instance
    acceptsInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String {
            return "This is from the implementation: ${multiplier * num}"
        }
    })
}

fun acceptsInterface(someInterface: SomeInterface) {
    println("from #acceptsInterface ${someInterface.mustImplement(543)}")
}