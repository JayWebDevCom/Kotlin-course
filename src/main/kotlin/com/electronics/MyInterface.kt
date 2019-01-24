package com.electronics


/*
interfaces can have properties
can use get() to provide a value
implementing classes can have concrete overridden implementation of the property
 */

interface MyInterface {

    val number: Int
    val number2: Int
        get() = 50

    fun name(myVar: String): String

}

interface MySubInterface : MyInterface {
    fun number(myVar: Int): String
}