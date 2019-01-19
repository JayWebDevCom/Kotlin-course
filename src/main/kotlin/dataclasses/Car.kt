package dataclasses

/*
 data class
 toString
 equals and hashcode
 copy function

 equals will not include properties not in primary constructor
 */

data class Car(val colour: String, val model: String, val year: Int)