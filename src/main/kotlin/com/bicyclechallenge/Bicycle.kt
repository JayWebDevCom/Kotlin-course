package com.bicyclechallenge


// optional param in superclass needs to be handled in subclass ctor
open class Bicycle(var cadence: Int, var speed: Int, var gear: Int = 10) {

    fun speedUp(inc: Int) {
        speed += inc
    }

    fun applyBreak(dec: Int) {
        speed -= dec
    }

    open fun printDescription() {
        println("Bike is in gear $gear" +
                " with a cadence of $cadence" +
                " travelling at a speed of $speed")
    }
}

class MountainBike(var seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) :
        Bicycle(cadence, speed, gear) {

    companion object {
        val availableColours: List<String> = listOf("brown", "red", "white")
    }

    constructor(colour: String, seatHeight: Int, cadence: Int, speed: Int, gear: Int = 10) :
            this(seatHeight, cadence, speed, gear) {
        println("colour is $colour")
    }

    override fun printDescription() {
        super.printDescription()
        println("Mountainbike has a seatheight of $seatHeight")
    }
}

class RoadBike(val tyreWidth: Int, cadence: Int, speed: Int, gear: Int = 10)
// val tyreWidth because don't want to change it
    : Bicycle(cadence, speed, gear) {

    override fun printDescription() {
        super.printDescription()
        println("Roadbike has a tyrewidth of $tyreWidth")
    }
}