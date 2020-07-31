package Loops

/*
 * Created by Vaishnavi Chaurasia
 * 31-July-20
 * 8:26 AM
 * Kotlin
*/

fun main() {

    var i = 1;

    // Syntax of while Loop
    while (i <= 10) {
        println(i)
        i++
    }

    println()

    var j = 1
    while (j <= 10) {
        println(j)             // incremented by 2
        j += 2
    }

    var k = 1
    while (k <= 10) {
        println(k)             // decremented by 2
        k -= 2
    }

}