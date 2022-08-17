package chapter2

fun main() {

    // object is define as a property
    var r1 = IntRange(0, 10)
    println(r1) // print range of number starting with 0 and ending with 10
    println(r1.sum()) // sum of all numbers in range
    println(r1.reversed()) // reveres the number from range
    println(r1.last()) // print last number of range
    println(r1.first()) // print first number of range
    println(r1.contains(3)) // it will check the value is contains in the range or not
    println(r1.step(2)) // it will step by 2 and prints the range


    val alphabates = "abcdef"
    println(alphabates.uppercase()) // convert the string into Upper case
    println(alphabates.reversed()) // reverrese the string value

    val number = "123456789"
    println(number.toInt())// convert string into Int



}
//class : Defines properties and functions for what is essentially a new data type.
// Classes are also called user-defined types.

// Member : either a property or a function of a class

// Member function :  A function that works only with specific class of object

// Object : Object is a creating an instance of the class it is also called as instance


