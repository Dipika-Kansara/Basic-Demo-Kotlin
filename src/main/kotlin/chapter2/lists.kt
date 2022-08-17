package chapter2

fun main() {

    val ints = listOf(99, 3, 5, 7, 11, 13)

    val list = mutableListOf<Int>()
    list.add(2)
    list.addAll(listOf(2,4,6,87))
    println(list)
}


//A List is a collection, which is an object that holds other objects.
// list of is immutable list which we can modify or reassign
// you can add an elements in the mutable list by using addmethod or += sign which add single element in the collection