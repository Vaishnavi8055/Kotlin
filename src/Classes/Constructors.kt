package Classes

/*
 * Created by Vaishnavi Chaurasia
 * 02-Aug-20
 * 02:56 PM
 * Kotlin
*/

// Primary Constructors : A class can have only one Primary Constructor
class Constructors constructor(var language: String, var age: Int, var beginner: Char) {                                                                                        // constructor variables

    /* var language: String                 // member/local Variables
      var age: Int
      var beginner: Char

      init {
        this.beginner = beginner           // RHS are constructor variables
        this.language = language           // this keyword is used to differentiate between member and constructor variables
        this.age = age                     // LHS are member/local variables
    } */


    fun aboutMe() {
        println("I am a Programmer !")
        println("I am learning ${language} now a days")
        println("My Age is ${age}")
        println("Am i a Beginner : ${beginner}")
    }
}

fun main() {
    val programmer = Programming()        // Objects are instances of a class

    println("Know something about me -")
    programmer.aboutMe()

    println()

    println("Know something about my friend -")
    programmer.language = "Java"
    programmer.beginner = 'N'

    programmer.aboutMe()

    println()

    println("Constructors : ")
    println()
    // constructor calls
    val programmers1 = Constructors("Python", 19, 'Y')
    programmers1.aboutMe()
    println()
    val programmers2 = Constructors("C++", 26, 'N')
    programmers2.aboutMe()
}