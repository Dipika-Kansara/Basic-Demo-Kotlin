package chapter1

fun main() {
    var myName = "Dipika"
    println(myName)

    val name = "Rebecca"
    println(name)

    var age = 30
    println(age)

    age = 20
    println(age)

    age += 5
    println(age)

    val gravity = 9.8
    println(gravity)

    val itemName = "Rice"
    var itemPrice = 1.5
    var itemQuantity = 3

    val total = itemPrice * itemQuantity
    println("it costs $total to buy $itemQuantity bags of $itemName")

    val firstletter = 'R'
    println("$itemName starts with the letter $firstletter")

    var isWinter = true
    println(isWinter)


    printGreeting("Dipika")
    println(divideDouble(3.0, -2.0))

    println(divideInt(5, 2))

    var myage = 23
    if (isAdult(myage)) {
        println("This person is an adult")
    } else {
        println("This Person is a child")
    }

    checkSign(4)
    checkSign(-3)
    checkSign(0)

    var naame = "Dipika"
    var aage = 23

    println("My name is " + naame + " and I am " + aage + "years old")
    println("My name is $naame and I am $aage years old")
    println("My name is ${naame} and I am ${aage} years old")

    var price = 3.4
    var quantity = 3

    val totaldata = price * quantity

    println("The product cost is $${totaldata}")

    var bigNumber = 23_45_678
    if (isEven(bigNumber)) {
        println("Even")
    } else {
        println("Odd")
    }


    var agedata1 = 19
    if (isTeen(agedata1)) {
        println("This person is teenager")
    } else {
        println("This person is not teenager")
    }

    isOpen(12, true)

    var no = 3
    while (no in 1..6) {
        println(no)
        no--
    }

    do {
        println(no)
        no++
    } while (no in 30..40)


    for (x in 1..6) {
        println(x)
    }


    for (x in 31..40 step 2) {
        println(x)
    }
    for (x in 45..55) {
        if (x % 2 == 0) {
            println(x)
        }
    }

    for (x in 15 downTo 10) {
        println(x)
    }

    repeat(3) {
        println("Hello")
    }

    var namedata = "Dipika"
    if (isVowel(namedata[0])) {
        println("Your name starts with Vowel")
    }
    else {
        println("Your name starts with consonant")
    }

    val naaaaame = "peter"
    if (startWith(naaaaame, 'W')){
        println("My Friend like this name")
    }
    if (startWith(naaaaame, 'p')) {
        println("My Brother like this name")
    }
}


fun printGreeting(name : String) = println("Hello $name")
fun divideDouble (n1 : Double, n2 : Double) : Double = n1 / n2

fun divideInt(num : Int, num2 : Int) : Double {
    return (num / num2).toDouble()
}

fun isAdult (number : Int) : Boolean {
    if (number >= 18){
        return true
    }
    return  false
}

fun checkSign(n : Int) {
    if (n > 0) {
        println("Positove")
    }
    if (n < 0) {
        println("Negative")
    }
    if (n == 0) {
        println("Zero")
    }

}
fun isEven(bigNum : Int): Boolean {
    if(bigNum % 2 == 0){
        return true
    }
    return false
}

fun isTeen(ageNum : Int) : Boolean {
    if (ageNum in 13..19) {
        return true
    }
    return  false
}

fun isOpen( hour : Int, isWeekend : Boolean) : Boolean {
    if(isWeekend == true && hour in 10..15) {
        return true
    }
    else if (isWeekend == false && hour in 9..17) {
        return true
    }
    else {
       return  false
    }
}


fun isVowel (char : Char): Boolean {
    if (char in "aeiouAEIOU") {
    return true
    }
    return false
}

fun endsWithVowel (n : String) : Boolean {
    return n.last() in "aeiouAEIOU"
}
fun startWith(name: String, na: Char) : Boolean{
    if (name[0] == na) {
        return true
    }
    else {
        return false
    }
}