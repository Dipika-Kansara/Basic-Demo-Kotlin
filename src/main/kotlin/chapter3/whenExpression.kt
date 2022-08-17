package chapter3



fun main() {
    repeat(5){

        var a = 10
        var b = 20
        val operator = readln()

        var result = when (operator)  {
            "+" ->  a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> b / a
            else ->
                "$operator is invalid please try again"

        }
        println(result)
    }


}

// When Expression is kind of switch case
