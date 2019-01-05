package first

import java.util.function.Consumer

fun main(args: Array<String>) {
    // hello world in list loops

    val hw = "Hello world"

    mutableListOf(hw).forEach {
        println(it)
    }

    mutableListOf(hw).forEach(
            Consumer { x -> println(x)}
    )

}