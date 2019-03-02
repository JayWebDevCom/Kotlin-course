package com

fun main() {
    // kotlin has no ternary operator

    val myCondition = 0 > 5
    val num: Int

    if (myCondition) {
        num = 50
    } else {
        num = 0
    }

    val someCondition = 2 < 4
    val num2 = if (someCondition) 50 else 0

    val num3 = if (someCondition) {
        println("")
        30
    } else {
        println("")
        40
    }


    println("num is equal to ${if (someCondition) {
        30
    } else {
        40
    }}")
}