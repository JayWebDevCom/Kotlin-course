package com

fun main() {
    val seasons = arrayOf("autumn", "winter", "spring", "summer")

    for (season in seasons) {
        println(season)
    }

    println("January" !in seasons)

    println()

    for (seasonIndex in seasons.indices) {
        println(seasons[seasonIndex])
    }

    seasons.forEachIndexed {index, value ->
            println("index: $index, value: $value")
    }
}