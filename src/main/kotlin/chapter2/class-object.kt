package chapter2

fun main() {

    // calling the class as an instace or object
    val myDog = Dog()
    println(myDog.bark())
    val myCat = Cat()
    println(myCat.meow()) // if you want to call a member function of the class you must call it with an object
    println(myCat.excercise())
    val myRabbit =  Rabbit()
    println(myRabbit)
}
// you can create your own type/data type which is called class

class Dog {
    fun bark() = "Woof Woof" // This is a member function which is an instance of class
}
class Cat {
    fun meow() = "Meow"
    fun excercise() = this.meow() + meow() + "Running on the weel" // this keyword is print itself value
}
class Rabbit
