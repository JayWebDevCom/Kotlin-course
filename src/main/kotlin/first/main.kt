package first

fun main(args: Array<String>) {

    // pass parameters out of order
    // as long as they are labelled
    area(height = 12, width = 20)

}

fun area(width: Int, height: Int) {
    println("width $width and height $height")
}

