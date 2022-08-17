package chapter2

fun main() {
    val person = FullName()

    println(person.fullName())
    println( person.fullName("Zalak", "Kansara"))

}


// You use the same name ("overload" that name) for different functions as long as the parameter lists differ.
class FullName {
    fun fullName() =  "Dipika Kansara"// this function is with no parameter no return type

    fun fullName(firstName : String, lastName : String) = firstName + ""  + lastName

}
