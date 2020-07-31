package Loops

/*
 * Created by Vaishnavi Chaurasia
 * 31-July-20
 * 8:08 PM
 * Kotlin
*/

fun main() {

    // Syntax of for loop

    for (i in 1..10) {        // No need to declare iterator in for loop
        println(i)
    }

    println()

    val array = arrayOf('K', 'V', 'A', 'P')

    for (i in 0..array.size - 1) {
        println("${array[i]}")
    }

    println()

    for (i in 0 until array.size) {      // use of until
        println("${array[i]}")
    }


}