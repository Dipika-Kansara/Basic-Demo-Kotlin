package chapter2


fun main() {

    var intSet = setOf<Int>(2,3,4,5,6,7,8)

    //define a Map
    var details = mapOf<String, Int>(
        "Dipika" to 25,
        "Zalak" to 29,
        "Luke" to 37,
        "Kevin" to 39
    )
    var s = ""
    //  Iterate through key-value pairs
    for (d in details){
        s += "${d.key} = ${d.value}"
        println(s)
    }

    //unpacking during Iteration
    for ((key, value) in details) {
        s = "$key :: $value"
        println(s)
    }


}


//A Set is a collection that allows only one element of each value.
//
//The most common Set activity is to test for membership using in or contains():

//Maps
//You create a Map by providing key-value pairs to mapOf(). Using to, we separate each key from its associated value:
//Maop is kind of dictionaries
