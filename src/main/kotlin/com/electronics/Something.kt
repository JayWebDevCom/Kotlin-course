package com.electronics

open class Something {

    val someProperty: String
    val someInt: Int

    constructor(someParameter: String, y: Int) {
        someProperty = someParameter
        someInt = y
        println("In parent ctor")
    }
}

class SomethingElse : Something {
    constructor(someOtherParameter: String, z: Int) : super(someOtherParameter, z) {
        println("In subclass ctor")
    }
}