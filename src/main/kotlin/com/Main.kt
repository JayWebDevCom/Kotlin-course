package com

import com.bicyclechallenge.Bicycle
import com.bicyclechallenge.MountainBike
import com.bicyclechallenge.RoadBike

fun main(args: Array<String>) {

    val bicycle = Bicycle(3, 4, 5)
    bicycle.cadence
    bicycle.printDescription()
    println()

    val bicycle2 = Bicycle(3, 4)
    bicycle2.cadence
    bicycle2.printDescription()
    println()

    val mountainBike = MountainBike(2, 3, 4, 5)
    mountainBike.seatHeight
    mountainBike.printDescription()
    println()

    val mountainBike2 = MountainBike(2, 3, 4)
    mountainBike2.seatHeight
    mountainBike2.printDescription()
    println()

    val mountainBike3 = MountainBike("orange", 2, 3, 4)
    mountainBike3.seatHeight
    mountainBike3.printDescription()
    println()

    MountainBike.availableColours.forEach {
        println(it)
    }

    val roadBike2 = RoadBike(2, 3, 4)
    roadBike2.tyreWidth
    roadBike2.printDescription()
    roadBike2.speedUp(4)
    roadBike2.printDescription()
    println()
}
