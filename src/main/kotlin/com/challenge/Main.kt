package com.challenge

fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 45)

}

class Person {
    val firstName: String
    val lastName: String
    val age: Int

    constructor(firstName: String, lastName: String, age: Int) {
        this.firstName = firstName
        this.lastName = lastName
        this.age = age
    }


}