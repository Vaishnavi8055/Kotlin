package Operators

fun main() {
    val number1 = 18.65
    val number2 = 2.5

    var result: Double  // result Variable is declared var as it's value will change wrt to the operations
                         // datatype is declared explicitly for the compiler to know the result type

    result = number1 + number2
    println(result)

    result = number1-number2
    println(result)

    result = number1 * number2
    println(result)

    result = number1 % number2
    println(result)

}
