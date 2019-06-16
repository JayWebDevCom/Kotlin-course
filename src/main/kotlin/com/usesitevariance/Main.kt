package com.usesitevariance

fun main(args: Array<String>) {

    // generic types are invariant
    // relax / widen invariant typing
    // assign to list of superclass type

    // Car to Car
    val cars1 = mutableListOf(Car(""), Car(""))
    val cars2 = mutableListOf<Car>()
    copyCars(cars1, cars2)
    println(cars2)

    println()

    // with single subclasses - Ford to Ford
    val lexus = mutableListOf(Lexus(""), Lexus(""), Lexus(""))
    val cars3 = mutableListOf<Lexus>()
    copyCars(lexus, cars3)
    println(cars3)

    println()

    // with mixed subclasses - Ford / Toyota to Car
    val mixedCars = mutableListOf(Lexus(""), Lexus(""), Toyota(""))
    val cars4 = mutableListOf<Car>()
    copyCars(mixedCars, cars4)
    println(cars3)
}

open class Car(val name: String)

// T has to be same at source and destination
// only read original list
// cant write to a covariant instance
// use site co/contra-variance (type projection) because method is covariant, not the classes
fun <T: Car> copyCars(source: MutableList<out T>, destination: MutableList<T>) {
    source.forEach {
        destination.add(it)
    }
}

class Toyota(name: String) : Car(name)

class Lexus(name: String) : Car(name)