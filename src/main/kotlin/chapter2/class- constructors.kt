package chapter2

fun main() {
    val rectangle = Rectangle(4.3,5.0)
    println("Perimeter : ${rectangle.perimeter}")

    // primary constructor
    var person = Persondata("Dipika", "Kansara", 21)
    println("My name is ${person.firstName} ${person.lastName} and I am ${person.age} years old")


// secondary constructor
    val p1 = Pizza("Large", "Thick", mutableListOf("Cheese", "Paneer"))
    print(p1)



}

class Rectangle(height: Double, width : Double) {
    var perimeter = (height + width) * 2
}

class Persondata (
    var firstName : String,
    var lastName : String,
    var age : Int,
){
    init {
        println("Welcome to person's profile")
    }
}

class Pizza(
    var crustSize : String,
    var crustType : String,
    var topping : MutableList<String>
){
    constructor(
        crustSize: String,
        crustType: String
    ) : this(crustSize, crustType, mutableListOf<String>())

    override fun toString(): String {
        return "Size : ${crustSize}, Type : ${crustType}, Topping : ${topping}"
    }
}



// constructor :
// Basically the constructor is a new object by passing the information or value as a constructor in the class
// There are two types of constructor



//1: Primary construcor : Primary constrictor define as passing the value in the prenthesis into the class
//primary constrcutor's value must specified in the object in the main function


//2: Secondary Construtor : Secondary constructoe define by using Constructor keyword inside the block of body in the class
// and the secondary constructor is not necessary to decalre in the object everytime its an optional value to be specified in the object
// secondary constructor is also called as overloded constructor
