package utils


fun String.upperFirstAndLast(): String {
/*
don't actually need to use 'this'
public properties and members can be referenced

when an inlined function is compiled it's body is directly substituted to the function call
e.g. lambda as parameter
*/

    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)

    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase()
}
