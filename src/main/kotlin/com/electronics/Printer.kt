package com.electronics

/*
open keyword for extendable classes
abstract classes open by default
abstract functions open by default

override keyword need to operate on open functions
final methods cannot be overridden

can't call a 2o constructor in parent from subclass
every ctor must delegate to primary ctor

dataclasses cant be extended
 */

abstract class Printer(val modelName: String) {

    open fun printModel() = println("From superclass: The model of this printer is $modelName")

    abstract fun bestSellingPrice(): Double
}

open class LaserPrinter(modelName: String, val pagesPerMin: Int) : Printer(modelName) {


    final override fun printModel() = println("From final subclass:The model of this printer is $modelName" +
            " printing rate: $pagesPerMin")

    override fun bestSellingPrice(): Double = 129.99
}

class SpecialLaserPrinter(modelName: String, pagesPerMin: Int) : LaserPrinter(modelName, pagesPerMin) {

}