package chapter1

fun main() {

    // print hello world
    //  for printing there are two keywords in kotlin
    //  1. print : - that prints the value only
    //2 . println : - That prints the value in new line
    println("Hello World!!!")

    //val and Var

    var name : String = "Dipika" // var is short form of variable and it can modify once assifn the value
    name = "Zalak"
    println(name)

    val age : Int = 25 // val is short form of value and it cannot modify once assigned the  value
    println(age)

    // data types :
    //1 : String :-- String is basically a word or sentence
    var word = "This is the word or a sentance"

    //2 : Int :-- Int is basically a whole number
    var number = 3

    //3 : Double :-- Double is basically a fractional number
    var doubleNum = 2.3

    //4 : Boolean : -- Boolean is a condintion of true and false
    var isRaining = true

    //5. : Character : -- Character is just a character , which is define in single quote
    var char = 'c'

    // 6: line : -- Line is basically multiline string
    val lines: String = """Triple quotes 
        let you have many lines 
        in your string"""


    //Arithmatic Operation

    var num1 =  20
    var num2 = 30

    // 1: Addition
    var total =  num1 + num2

    //2 : Substraction
    var substract = num2 - num1

    //3 : Multiplication
    var multiply = num1 * num2

    //4: Division :

    var divide = num2 / num1

    //5 : Modulo

    var modulo = num2 % num1


    // Function
    // function is basically a group of activitys and function could have parameters and return types and return value
    // fun is keyword of define the function
    //here mathOperation is the name of function
    // here p1 and p2 is the parameters of the function, in the function it could be with one or many parameters as well ass function could be with no parameters
    // : Int is the return type of the function; fumction could have no return type or one return type that return the value in defined return type
    // {} cuely braces is the body of the function we can also callled as block body
    fun mathOperation(p1 : Int , p2 : Int) : Int {
        return  p1 + p2
    }

    // if the function body contains one line of code we can use expression body
    // to declare the expression body we can remove the curly breces and the return keyword and use = sign instead and put a body code in the same line

    fun addition(p1 : Int , p2 : Int) : Int =   p1 + p2

    // if else expression
    // if else statement is for condition checking if condition is true then excecute the code of if statement otherwise it will skip the part of if statement and execute the code of else statement

    var num = 18
    if (num >= 18) {
        println("You are and adult")
    }
    else {
        println("You are a child or teenager")
    }

    // While loop
//    while (Boolean-expression) {
//        // Code to be repeated
//    }


    var i = 0
    while (printStar(i)){
        println("*")
        i+= 1
    }

}
fun printStar(i : Int ) = i < 10

