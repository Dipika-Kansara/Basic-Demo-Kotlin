package chapter2

fun main() {
    var name  = "Dipika Kansara"
    var output = name.removeFirstChar()
    println(output)
}

fun String.removeFirstChar() :String  = this.substring(1)


//Usin extension function extend a class with new functionality using extension functions.