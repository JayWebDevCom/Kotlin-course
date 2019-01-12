package stringtemplates

fun main(args: Array<String>) {

    val e1 = Employee("Lynne Jones", 6)
    e1.name = "Lynne Peters"
    println(e1)

    val change = 4.31
    // escape the $ to show the $ symbol i.e. dollar money
    println("\$$change")

    // results of expressions
    val numerator = 10.99
    val denominator = 20.11
    println("The value of $numerator divided by $denominator is ${numerator / denominator}")

    // accessing fields is considered an expression so need braces
    println("Employee1 id is ${e1.id}")

    // triple quoted strings eliminate escaping - can break up over several lines
    // use trimMargin with a character - will trim space and margin character passed
    // default trimMargin arg is '|'
    val eggName = "Humpty"
    val nrhyme = """
        *$eggName Dumpty sat on a wall
        *$eggName Dumpty had a great fall...
    """.trimMargin("*")

    println(nrhyme)

    var hello1 = "hello"
    var hello2 = "hello"
    // unexpected but the jvm optimizes and uses the same string from the stringpool
    // so different vars can point to the same string instance
    println("hello1 and hello2 are referentially equal: ${hello1 === hello2}")
    println("hello1 and hello2 are structurally equal: ${hello1 == hello2}")

    val any: Any = 123.45
    println("any is of class: ${any.javaClass}")

    // smart casting
    val anyString: Any = "any string"
    if (anyString is String) {
        println("to uppercase is: ${anyString.toUpperCase()}")
    }

    println("""
         |   1
         |  11
         | 111
         |1111
    """.trimMargin())

    println("""
         1   1
         1  11
         1 111
         11111
    """.trimMargin("1"))
}

class Employee(var name: String, val id: Int) {
    override fun toString(): String {
        return "Employee(name='$name', id=$id)"
    }
}