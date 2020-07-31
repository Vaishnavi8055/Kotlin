package Conditionals

import kotlin.math.max

/*
 * Created by Vaishnavi Chaurasia
 * 31-July-20
 * 6:45 PM
 * Kotlin
*/

fun main() {

    val number1 = 27
    val number2 = 3                   // val number2 = 0

    // Example 1
    if (number2 == 0) {
        println("Division cannot be done !")
    } else {
        println("${number1 / number2}")
    }

    // Example 2
    if (number1 > number2) {
        println("$number1 is greater")
    } else {
        print("$number2 is greater")
    }

    // Example 3
    val maxValue: Int

    if (number1 > number2) {
        maxValue = number1
    } else {
        maxValue = number2
    }

    println(maxValue)
}
