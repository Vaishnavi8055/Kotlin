package Classes

/*
 * Created by Vaishnavi Chaurasia
 * 02-Aug-20
 * 02:02 PM
 * Kotlin
*/
class Programming {

    var language: String = "Kotlin"
    val age: Int = 20
    var beginner = 'Y'

    fun aboutMe() {
        println("I am a Programmer !")
        println("I am learning ${language} now a days")
        println("My Age is ${age}")
    }
}

fun main() {
    val programmer = Programming()  // Objects

    println("Know something about me -")
    programmer.aboutMe()

    println()

    println("Know something about my friend -")
    programmer.language = "Java"
    programmer.beginner = 'N'

    programmer.aboutMe()
}
