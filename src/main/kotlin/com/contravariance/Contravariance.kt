package com.contravariance


fun main(args: Array<String>) {

    /*
    Widen the generic type to include class and subclasses of class and superclasses

    declaration site variance - in/out keyword used at declaration of class statement

    Contravariance - preserve superclasses up the inheritance tree (covariant types appear at the in position (parameters))
        - can only be parameters - rose can be used as flower
        - can't be used as return types because that would be out position
        - prevents wrong type being returned
        - cannot use flower like as rose
        - used to preserve supertyping - T will match T and all of its superclasses

    Covariance - accept subclasses - down the inheritance tree (covariant types appear at the out position)
        - used to preserve subtyping - T will match T and all of its subclasses
     */

    val generalFlowerTender = object : FlowerCare<Flower> {
        override fun prune(flower: Flower) {
            println("Pruning a daffodil ${flower.name}")
        }
    }

//    val roseTender = object : FlowerCare<Rose> {
//        override fun prune(flower: Rose) {
//            println("Pruning a rose $flower")
//        }
//    }
//
//    val daffodilTender = object : FlowerCare<Daffodil> {
//        override fun prune(flower: Daffodil) {
//            println("Pruning a daffodil $flower")
//        }
//    }

    val roseGarden = Garden<Rose>(listOf(Rose("r one"), Rose("r two"), Rose("r three")), generalFlowerTender)
    roseGarden.tendFlower(0)


    val daffodilGarden = Garden<Daffodil>(listOf(Daffodil("d one"), Daffodil("d two"), Daffodil("d three")), generalFlowerTender)
    daffodilGarden.tendFlower(1)
}

class Garden<T : Flower>
// in keyword allows generalFlowerTender to be passed instead of a roseTender/daffodilTender
// eliminates duplication
// T and superclasses
// interface becomes contravariant
(val flowers: List<T>, val flowerCare: FlowerCare<in T>) {
    fun pickFlower(num: Int) = flowers[num]

    fun tendFlower(num: Int) {
        flowerCare.prune(flowers[num])
    }
}

open class Flower(val name: String)

class Rose(name: String) : Flower(name)

class Daffodil(name: String) : Flower(name)

interface FlowerCare<T> {
    fun prune(flower: T)
}