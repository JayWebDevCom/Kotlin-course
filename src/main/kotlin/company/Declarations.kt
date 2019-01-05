package company

// type alias
typealias EmployeeSet = Set<StoreEmployee>

fun main(args: Array<String>) {
    // val - immutable like final in Java
    // val cannot be reassigned
    // val preferred over var
    val numberVar = 4

    // explicitly state type - but not necessary in Kotlin
    // compiler can infer type
    // numbers default to Int in Kotlin
    // numbers default to Double in Java
    // cannot change type of variable
//    val number : Short = 25

    // var variables are mutable
    // underlined in the IDE
//    var numberVal = 25

    // employee is val immutable but its properties are mutable
//    val e1 = StoreEmployee("Lynne Jones", 500)
//    e1.name = "Lynne Smith"

    // can declare then assign a val
//    val e2: StoreEmployee
//    e2 = StoreEmployee("Pete Grinffin", 500)

    // Type Alias
//    val employees: EmployeeSet

}

private class Employee(var name: String, val id: Int) {
    // name can change
    // id cannot change
}