package chapter3

fun main() {
    var trafficLightColor = TriafficLight.Orange // default Green color

    if (trafficLightColor == TriafficLight.Red) {
        println("Please stop your car")
    }
    else if(trafficLightColor == TriafficLight.Green) {
        println("You may go now")
    }
    else if(trafficLightColor == TriafficLight.Orange){
        println("PLease prepare to stop")
    }
    else {
        println("No valid color")
    }

}

// Enumeration is the collection of names which we can operate in our code ,
// Enumeration is defined as enum class keyword


enum class TriafficLight {
    Red, Green, Orange
}