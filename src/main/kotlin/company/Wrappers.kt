package company

fun main(args: Array<String>) {
    // wrappers for commonly used java methods

    // hard keywords cannot be used as variables
    // soft keywords 'can' be used as variables but don't

    val names = arrayListOf("John, Jane, Mary")
    println(names[0])
    
    // kotlin has its own String class with different methods
    // https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html
    
    // checked and unchecked exceptions are treated the same in kotlin
    // all exceptions are unchecked therefore no 'throws Exception statement'
    
    // no ternary operator in kotlin - kotlin uses if
    // no for loop in kotlin
    
    // no static keyword in kotlin (syntactically) - but static concept still exists

}