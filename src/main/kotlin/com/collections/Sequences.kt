package com.collections

fun main(args: Array<String>) {

    val bikes = mapOf<String, Bike>(
            "john's" to Bike("red", "Range", 2010),
            "jane's" to Bike("blue", "Hyundai", 2010),
            "janet's" to Bike("blue", "Honda", 2010),
            "james's" to Bike("yellow", "Tesla", 2011),
            "jorah's" to Bike("orange", "Lamborghini", 2012)
    )

    /*
    avoid creation of intermediate instances
     useful for large sized collections
     similar to streams in java
     sequences are continuous streams of objects
     collections in kotlin are already very efficient to sequences may not be needed
     lazy evaluation - no evaluation until terminal operation occurs
     */

    println( // prints a sequence - unterminated
            bikes.asSequence()
                    .filter { it.value.year == 2010 } // intermediate operation
                    .map { it.value.colour } // intermediate operation
    )

    println()
    println("with sequence")
    println(
            listOf("joe", "mary", "jane").asSequence()
                    .filter {
                        println("filtering $it")
                        it[0] == 'j'
                    }
                    .map {
                        println("mapping $it")
                        it.toUpperCase()
                    }
                    .toList()
    )

    println()
    println("without sequence")
    println(
            listOf("joe", "mary", "jane")
                    .filter {
                        println("filtering $it")
                        it[0] == 'j'
                    }
                    .map {
                        println("mapping $it")
                        it.toUpperCase()
                    }
                    .toList()
    )

    println()
    println("find with sequence sequence")
    println(
            listOf("joe", "mary", "jane").asSequence()
                    .filter {
                        println("filtering $it")
                        it[0] == 'j'
                    }
                    .map {
                        println("mapping $it")
                        it.toUpperCase()
                    }
                    .find { it.endsWith('E') }
    )
}