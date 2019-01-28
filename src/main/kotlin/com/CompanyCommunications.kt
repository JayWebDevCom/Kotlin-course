package com

import java.time.Year

object CompanyCommunications {

    val currentYear = Year.now().value

    fun getTagLine() = 4

    fun getCopyrightLine() = "Copyright \u00A9 $currentYear.\n" +
            "All rights reserved"

}

class SomeClass private constructor(val someString: String = "") {

    fun accessPrivateVar(): Int {
        return privateVar
    }


    companion object {
        /*
        grouping static members within a companion object
         */
        private var privateVar: Int = 6

        fun accessPrivateVar(): Int {
            return privateVar
        }

        fun justAssign(str: String) = SomeClass(str)

        fun upperOrLower(str: String, lowercase: Boolean): SomeClass = if (lowercase) {
            SomeClass(str.toLowerCase())
        } else {
            SomeClass(str.toUpperCase())
        }
    }
}

interface SomeInterface {
    fun mustImplement(num: Int) : String
}