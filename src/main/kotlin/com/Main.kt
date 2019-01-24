package com

import com.electronics.LaserPrinter
import com.electronics.SomethingElse
import com.electronics.SpecialLaserPrinter
import com.electronics.SomeClass

fun main(args: Array<String>) {

    val laser = LaserPrinter("Xerox 101", 200)

    laser.printModel()
    println(laser.bestSellingPrice())

    val specialLaser = SpecialLaserPrinter("Xerox 109", 300)

    specialLaser.printModel()
    println(specialLaser.bestSellingPrice())

    println()

    // parent ctor runs before subclass ctor
    SomethingElse("Some other parameter", 4321)

    println("Interfaces")

    SomeClass().name("some string")
}