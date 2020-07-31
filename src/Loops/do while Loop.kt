package Loops

/*
 * Created by Vaishnavi Chaurasia
 * 01-Aug-20
 * 5:01 AM
 * Kotlin
*/

fun main() {

    var i = 1;
    do {
        println(i)
        i++
    } while (i <= 10)

    println()

    var j = 1
    do {
        println(j)         // incremented by 2
        j += 2
    } while (j <= 10)
}