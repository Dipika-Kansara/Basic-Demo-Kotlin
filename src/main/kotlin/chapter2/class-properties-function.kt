package chapter2

fun main() {
    val person = Person() // instance of the class
    person.firstName = "Dipika" // We can specify the value of the property using dot notation
    person.lastName = "Kansara"
    println("My name is ${person.firstName} ${person.lastName}")

    println("My husband's full name is ${person.husbandfullName("Zalak ","Kansara")}")
}

class Person {
    var firstName : String = ""// This os the property in the class
    var lastName : String = ""

    fun husbandfullName (fName : String, LName : String) : String {
        return fName + LName
    }
}