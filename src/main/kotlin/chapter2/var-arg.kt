package chapter2

fun main() {
    varargData("Dipika", 2.9)
    varargData("Zalak", 3.4, 4.3,5.7,7.8,8.6)

    val totalnumber = sum(3,5,6,8,9,34,54,23,21,65,76)
    println(totalnumber)

}

fun varargData (s : String, vararg  d: Double){}

fun sum(vararg number : Int) : Int{
    var total = 0
    for (n in number){
        total += n
    }
    return total
}

// Variable arguments is also called as var-arg lists
// the vararg keyword is flexible size argumetn list
//Using the vararg keyword, you can define a function that takes any number of arguments,
// just like listOf() does. vararg is short for variable argument list