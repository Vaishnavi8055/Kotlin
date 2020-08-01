package Operators

/*
 * Created by Vaishnavi  Chaurasia
 * 31-July-20
 * 10:00 PM
 * Kotlin
*/

fun main() {

    val number1 = 0

    //Example 1
    if (number1 > 0 || number1 < 0) {
        println("It is a Non Zero Integer")         //Logical OR ||
    } else {
        println("Integer is Zero")
    }

    //Example 2
    if (number1 >= 0 && number1 <= 5) {
        println("The value of Integer is between o-5")  //Logical AND &&
    } else {
        println("The value of Integer is not between o-5")
    }

    //Example 3
    if (number1 != 0 && number1 <= 5) {
        println("The value of Integer is between o-5")   //Logical NOT EQUAL TO !=
    } else {
        println("The value of Integer is not between o-5")
    }

    //Example 4
    val number2 = 21
    when (number2) {                                  // in is used to specify the range
        in 10..15 -> println("Between 10-15")
        in 16..20 -> println("Between 16-20")
        in 21..25 -> println("Between 21-25")
        in 26..30 -> println("Between 26-30")
    }

}
