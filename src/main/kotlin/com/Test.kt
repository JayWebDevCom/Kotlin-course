package com

class Test (firstName: String) {
    val firstName: String
    var fullTime: Boolean

    // this is not a constructor
    // used in conjunction with constructor
    init {
        this.firstName = firstName
        this.fullTime = true
    }

    // secondary constructors must delegate to primary
    // secondary constructors do not define properties
    constructor(firstName: String, fullTime: Boolean): this(firstName) {
        this.fullTime = fullTime
    }

    // succinct way - combine declaration and assignment
    // val firstName: String = firstName
}