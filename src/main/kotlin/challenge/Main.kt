fun main() {

    // use a range to print out number of 0 - 5000 steps of 5
    // start and end values are included in the range
    for (num in 0..5000 step 5) {
//        print("$num ")
    }

    // print -500 to 0
    for (num in 0.downTo(-500).reversed()) {
//        print("$num ")
    }

    // use a range to print fibbonacci sequence
    val ints = IntArray(15) { i -> i }

    var total: Int // 2 preceeding numbers
    var secondToLast = 0
    var last = 1

    println(secondToLast)
    println(last)

    for (i in 0..13) {
        total = secondToLast + last
        print("$total ")
        secondToLast = last
        last = total
    }

    var num = 4

    var dnum = if (num > 100) {
        3.4
    } else if (num < 100) {
        4.56
    } else if (num == 200) {
        5.78
    } else {
        9.54
    }

    println("dnum is $dnum")

    dnum = when {
        num > 100 -> 4.5
        num < 100 -> 4.6
        num == 100 -> 4.7
        else -> 2.34
    }

    println("dnum is $dnum")
}