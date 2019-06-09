package com.covariance

fun main(args: Array<String>) {

    /*
    mutable list of Short cant be passed to mutable list of Number
    subclass and subtype are different

    covariant
    we want list short to be a subtyoe of list of number
    type parameter must be covariant

    immutable collections interface is covariant - subtyping is preserved
    mutable collections interface is not covariant - subtyping is not preserved
    mutable ist is invariant

    list of short must be a subtype of list of number
    */

    val shortList = mutableListOf<Short>(1, 2, 3)
    convertToInt(shortList)

    val garden = Garden<Rose>("rose garden")
    tendGarden(garden)
}

// number is upper bound
// out keyword makes method covariant
// but risk adding a wrong type to a list of another type
fun convertToInt(list: MutableList<out Number>) {
    list.forEach {
        println(it.toInt())
    }

//    val s = BigDecimal(34.456).toShort()
//    list.add(s)
}

fun waterGarden(garden: Garden<Flower>) {
    println("Now watering ${garden.name}")
}

// cannot pass Garden<Rose> as arg to Garden<Flower>
// Garden class is invariant
// only Garden<Flower> accepted
// subclasses of lower not accepted
// subtyping not preserved
// can only read covariant instances

fun tendGarden(roseGarden: Garden<Rose>) {
    waterGarden(roseGarden)
}

open class Flower(var name: String)

class Rose(name: String) : Flower(name)

// class is invariant
// `out` makes Garden Covariant
// covariant classes can only be used in the out position
// func parameters are in position, return type is out position
class Garden<out T : Flower>(var name: String) {
    val flowers: List<T> = listOf()

    fun pickFlower(num: Int): T = flowers[num]

// cannot use out as in position
// restriction exists to stop subtype mismatch - e.g. lilly into rosegarden
//    fun plantFlower(flower: T) {
//        return flowers.find { it is flower }
//    }
}