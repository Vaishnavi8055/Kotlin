package Lists

/*
 * Created by Vaishnavi Chaurasia
 * 01-Aug-20
 * 10:15 AM
 * Kotlin
*/

fun main() {

    // Mutable lists are defined by using mutableListOf() keyword
    var listOfFruits = mutableListOf("Mango", "Apple", "Orange")
    println(listOfFruits)

    println()

    listOfFruits[1] = "Guava" //Will not throw an error as it is a Mutable List whose size and elements are not fixed

    println(listOfFruits)

    println()

    listOfFruits.add(3, "Grapes")    // add(index , element) method
    println(listOfFruits)

    println()

    listOfFruits.removeAt(0)            // remove(index) method
    println(listOfFruits)

    println()

    var listOfVeg = arrayOf("Tomato", "Potato", "Onion")   // add an array to a list by addAll(array[]) method
    listOfFruits.addAll(listOfVeg)
    println(listOfFruits)

    println()

    println("Element at index 1 is : ${listOfFruits.get(1)}")      // get(index) method

    println()

    println("Index is : ${listOfFruits.indexOf("Orange")}")        // indexOf(String) method

    println()

    println(listOfFruits.subList(0, 1))
}