package com

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information Technology", 6),
    ACCOUNTING("Accounting", 7),
    SALES("Sales", 8);

    fun departmentInfo(): String =
            "The $fullName department has $numEmployees employees"
}