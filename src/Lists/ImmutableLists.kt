package Lists

/*
 * Created by Vaishnavi Chaurasia
 * 01-Aug-20
 * 09:40 PM
 * Kotlin
*/

fun main() {

    // Immutable lists are defined by using listOf() keyword
    var listOfFruits = listOf("Mango", "Apple","Orange")
    println(listOfFruits)

    /* listOfFruits[1] = "Guava" */ //Will throw an error as it is a immutable List whose size and elements are fixed

    println()

    println("Element at index 1 is : ${listOfFruits.get(1)}")      // get(index) method

     println()

    println("Index is : ${listOfFruits.indexOf("Orange")}")        // indexOf(String) method

    println()

    println(listOfFruits.subList(0,1))                             // subList(startIndex , endIndex+1) method

}