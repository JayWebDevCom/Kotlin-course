package com.collections

fun main(args: Array<String>) {

    // mutable and immutable maps
    val car1 = Car("green", "Toyota", 2015)
    val car2 = Car("red", "Ford", 2016)
    val car3 = Car("silver", "Honda", 2013)

    val immutableMap = mapOf(1 to car1, 2 to car2, 3 to car3)

    println(immutableMap)
    println(immutableMap.javaClass) // class java.util.LinkedHashMap

    val mutableMap = mutableMapOf<String, Car>(
            "john's" to Car("red", "Range", 2010),
            "jane's" to Car("blue", "Hyundai", 2016)
    )

    val hashMap = hashMapOf(
            "john's" to Car("red", "Range", 2010),
            "jane's" to Car("blue", "Hyundai", 2016)
    )

    println(mutableMap)
    println(mutableMap.javaClass) // class java.util.LinkedHashMap

    println(mutableMap)
    println(hashMap.javaClass) // class java.util.HashMap

    mutableMap["mary's"] = Car("red", "Corvette", 1965)
    mutableMap.put("bob's", Car("yellow", "Hyundai", 2016))

    // Pair destructuring declaration - distributed public member values to different variables
    val pair1 = Pair(10, "ten")
    val (first, second) = pair1

    println(first); println(second)

    // destructure and iterate - implements 'component functions'
    for((k, v) in mutableMap) {
        println(k)
        println(v)
    }

    val (col, mod, yr) = car1

    println(col); println(mod); println(yr)


    var mutableBikeMap = mapOf<String, Bike>(
            "john's" to Bike("red", "Range", 2010),
            "jane's" to Bike("blue", "Hyundai", 2016)
    )

    val year = mutableBikeMap.filter { it.value.year == 2016 } // filter returns a new map

    println(year)

    // instantiate a predicate
    val isRed: (Map.Entry<String, Bike>) -> Boolean = { it.value.colour == "red" }

    val colour = mutableBikeMap.filter(isRed)

    println("filtered to red colour is $colour")

    // add 10 to every element
    val ints = arrayOf(2, 3, 4, 5, 6)
    val add20List: MutableList<Int> = ints.map { it.plus(20) }.toMutableList()
    println(add20List)
    println(add20List.javaClass) // class java.util.ArrayList

    // extract the years of bikes
    val years: List<Int> = mutableBikeMap.map { it.value.year }
    println(years)

    val bikes = mapOf<String, Bike>(
            "john's" to Bike("red", "Range", 2010),
            "jane's" to Bike("blue", "Hyundai", 2010),
            "janet's" to Bike("blue", "Honda", 2010),
            "james's" to Bike("yellow", "Tesla", 2011),
            "jorah's" to Bike("orange", "Lamborghini", 2012)
    )

    val output = bikes.filter {
        it.value.year == 2010 // should leave 3 left
        it.value.colour == "blue" // should have 2 left
    }.map {
        it.value.colour
    }

    println(output) // list of String

    // do all match?
    val all: Boolean = bikes.all {
        it.value.year >= 2020
    }
    println("do all match year at least 2020?: $all")

    // do any match?
    val any = bikes.any {
        it.value.year == 2012
    }
    println("do any match year as 2012?: $any")

    val count = bikes.count {
        it.value.year == 2010 // should be 3
    }
    println("how many were manufactured in 2010: $count")

    val carValues = bikes.values
    // returns first car that satisfies condition or null
    println("Cars 2014 or after ${carValues.find { it.year > 2011 }}")

    // return in a grouped map
    println(carValues.groupBy { it.year })
    println(carValues.sortedBy { it.year }.reversed())



}

// deconstructable class - automatically available in data classes
class Car(val colour: String, val model: String, val year: Int) {
    operator fun component1() = colour
    operator fun component2() = model
    operator fun component3() = year
}



data class Bike(val colour: String, val model: String, val year: Int)