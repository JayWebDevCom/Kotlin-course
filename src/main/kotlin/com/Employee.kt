package com

/*
classes are public and final by default
declare property in signature of constructor
don;t even need constructor keyword

default parameter values in primary constructor

classes have properties not fields - default is public

default setters and getters are generated - apply to fields directly
can't be done from outside the class

changing the value of a property directly uses a setter behind the scenes

default return type from a member functionis always unit
*/

class Employee(
        val name: String = "No name",
        var fullTime: Boolean = true,
        private var location: String = "OFFICE",
        designation: String = "ok") {

    var designation = designation
        get() {
            println("running the custom get()")
            return field
        }
        set(value) {
            println("running the custom set()")
            field = value
        }

    // actually returns the uppercase verion
    fun upperCaseFirstName() = name.toUpperCase()

}
