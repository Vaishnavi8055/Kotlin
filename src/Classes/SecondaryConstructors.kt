package Classes

/*
 * Created by Vaishnavi Chaurasia
 * 02-Aug-20
 * 03:00 AM
 * Kotlin
*/class SecondaryConstructors(language: String, age: Int, beginner: Char) {  // Primary Constructor Variables

    // For the secondary constructors we need to first decalre the variables
    var name: String? = null  // Secondary Constructor Variables

    // Passing both secondary and primary constructor variables
    constructor(language: String, age: Int, beginner: Char, name: String) : this(language, age, beginner) {
        this.name = name
    }

}

fun main() {

    val programmer = SecondaryConstructors("C", 22, 'Y')


    println()

    val programmers = SecondaryConstructors("Java", 13, 'Y', "Vaishnavi")

}