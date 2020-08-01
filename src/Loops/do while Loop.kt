package Loops

/*
 * Created by Vaishnavi Chaurasia
 * 31-July-20
 * 10:00 PM
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

    var k = 1
    do {
        println(k)         // decremented by 2
        k -= 2
    } while (k <= 10)
}
