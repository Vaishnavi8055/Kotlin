package Conditionals

/*
 * Created by Vaishnavi Chaurasia
 * 31-July-20
 * 6:54 PM
 * Kotlin
*/

fun main() {

    //Nested if-else also Known as if-else ladder

    val number1 = 25
    val number2 = 45

    if (number1 > number2) {
        println("${number1} is greater")
    } else if (number2 > number1) {
        println("${number2} is greater")
    } else {
        println("Both are Equal")
    }

    // Using when

    // Example 1
    when (number1) {
        12 -> println("Twelve")
        10 -> println("Ten")
        25 -> println("Twenty Five")
        1 -> println("One")
        else -> print("None of the above")
    }

    //Example 2
    when {
        number1 > 0 -> println("Positive")
        number1 < 0 -> println("Negative")
        number1 == 0 -> println("Zero")
    }

}