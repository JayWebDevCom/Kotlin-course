package com

import anothercom.topLevel

fun main(args: Array<String>) {
    // 'internal' access modifier - visible within same module
    // 'private' access modifier - visible within same file

    // import from another module AnotherModule
    // file - module settings, dependencies, +
    println(topLevel("in the kotlinlearning module"))
}
