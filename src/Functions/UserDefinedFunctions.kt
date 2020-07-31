package Functions

/*
 * Created by Vaishnavi Chaurasia
 * 31-July-20
 * 4:00 PM
 * Kotlin
*/

fun main() {                        //Main Function
    println("Main Function")

    /* Function Calls */
    iAmAFunction()
    sumOfTwoNumbers()
    iAmFunctions()
    functionToSum(12, 2)
    println(functionToDivide(4, 2))

}

fun iAmAFunction(): Unit {          //when a function does not return a meaningful result then default dataType is Unit

}

fun sumOfTwoNumbers() {             // Function Without return Type and Arguments
    val result = 4 + 5             // Block body
    println("${result}")
}

fun iAmFunctions() = println("Kotlin is awesome Language !")      // expression Body

fun functionToSum(number1: Int, number2: Int) =                   // expression Body
    println("$number1 + $number2 = ${number1 + number2}")        // Function With return Type and Arguments

fun functionToDivide(number1: Int, number2: Int): Int {
    return number1 + number2
}

