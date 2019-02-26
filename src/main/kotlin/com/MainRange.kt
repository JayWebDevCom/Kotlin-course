package com

fun main(args: Array<String>) {

    // for loop uses a range
    for (i in 0..10) {
        print("$i ")
    }
    println()

    val intRange = 0..10
    for (i in intRange) {
        print("$i ")
    }
    println()

    for (i in intRange.reversed()) {
        print("$i ")
    }
    println()

    println("3 in intRange ${3 in intRange}")

    val charRange = 'a'..'z'
    println('j' in charRange)

    val stringRange = "abd".."xyz"
    println("jjjj" in stringRange)
    println("z in stringRange: ${"z" in stringRange}")

    val backwardRange = 5.downTo(1)
    println("3 in backwardRange: ${3 in backwardRange}")

    val stepRange = 3..15
    val stepThree = stepRange.step(3)
    stepThree.forEach {
        print("stepThree: $it ")
    }
    println()

    for (num in 1..20 step 5) {
        print("$num ")
    }
    println()

    for (num in 20.downTo(15) ) {
        print("$num ")
    }
    println()

    // exclude the last
    for (i in 10 until 15 ) {
        print("$i ")
    }
}
