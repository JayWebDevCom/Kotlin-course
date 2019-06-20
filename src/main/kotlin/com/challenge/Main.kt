package com.challenge

fun main(args: Array<String>) {

    val joe = Person("Joe", "Jones", 45)
    val (firstName, lastName, age) = joe
    println("first name: $firstName, last name: $lastName, age: $age")
    println()

    val jane = Person("Jane", "Jones1", 45)
    val mary = Person("Mary", "Jones2", 46)
    val john = Person("John", "Jones3", 47)
    val jean = Person("Jean", "Jones4", 48)
    val mike = Person("Mike", "Jones5", 49)

    val personMap = mapOf(
            joe.lastName to joe,
            jane.lastName to jane,
            mary.lastName to mary,
            john.lastName to john,
            jean.lastName to jean,
            mike.lastName to mike
    )

    // print number with first name beginning with m
    val size = personMap.values.count {
        it.firstName.toLowerCase().startsWith('m')
    }

    val size2 = personMap.count {
        it.value.firstName.toLowerCase().startsWith('m')
    }

    val size3 = personMap.filter {
        it.value.firstName.toLowerCase().startsWith('m')
    }.size

    val size4 = personMap.filter {
        it.value.firstName.toLowerCase().startsWith('m')
    }.count()

    println("$size, $size2, $size3, $size4")


    val pairList = mutableListOf<Pair<String, String>>()
    personMap.forEach { (_, v) ->
        pairList.add(Pair(v.firstName, v.lastName))
    }
    println(pairList)
    println()

    val namePairs: List<Pair<String, String>> = personMap.map { Pair(it.value.firstName, it.value.lastName) }
    println(namePairs)
    println()

    val firstNameList = personMap.map { it.value.firstName }
    val lastNameList = personMap.map { it.value.lastName }
    val namePairs2 = firstNameList.zip(lastNameList)
    println(namePairs2)
    println()

    // also()
    // print Joe is 45 years Old ets
    personMap.values.map {
        it.also { p -> println("${p.firstName} is ${p.age} years old") }
    }
    println()

    personMap.also {
        it.map { p -> println("${p.value.firstName} is ${p.value.age} years old") }
    }
    println()

    personMap.apply {
        this.values.map { println("${it.firstName} is ${it.age} years old") }
    }


    // contains numbers that occur both lists
    val list1 = listOf(1,4,9,15,33)
    val list2 = listOf(4,55,-83, 15, 22, 101)
    val list3 = list1.filter { list2.contains(it) }
    val list4 = list1.filter { it in list2 }
    println(list3)
    println(list4)

    println()
    println()

    // trying to assign a Box of a superclass to a Box of subclass - covariance
    val regularPaper = Box<RegularPaper>()
    val premiumPaper = Box<PremiumPaper>()

    var paper = Box<Paper>()
    println(paper)

    paper = regularPaper
    println(paper)

    paper = premiumPaper
    println(paper)


    // if trying to assign a Box of a subclass to a Box of superclass - contravariance
    // relax T to accept superclasses
    // can't read instances of class - can only write them - don't know what type ypu will get back
    // because instance of Paper isn't necessarily an instance of RegularPaper
}

// trying to assign a Box of a superclass to a Box of subclass
// want T to accept a subclass - covariance
// assign the out keyword
// can only take, cannot add
class Box<out T>
open class Paper
class RegularPaper : Paper()
class PremiumPaper : Paper()


class Person(val firstName: String, val lastName: String, val age: Int) {

    // could have done with data class with primary construction automatically
    operator fun component1(): String = firstName
    operator fun component2(): String = lastName
    operator fun component3(): Int = age
}